package com.pado.quickbookbridge.endpoints;

import com.pado.quickbookbridge.pojos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

@Endpoint
public class App {

    private final Logger log;

    private final ObjectFactory objectFactory;

    private final Map<String,String> session;

    public App(ObjectFactory objectFactory) {
        this.objectFactory = objectFactory;
        session=new HashMap<>();
        log=Logger.getLogger("QuickbooksLog");
    }

    public static final String NAME_SPACE_URL="http://developer.intuit.com/";

    @PayloadRoot(namespace = NAME_SPACE_URL, localPart = "serverVersion")
    @ResponsePayload
    public ServerVersionResponse serverVersion(@RequestPayload ServerVersion serverVersion){
        ServerVersionResponse reponse= objectFactory.createServerVersionResponse();
        reponse.setServerVersionResult("2.0");
        return reponse;
    }
@PayloadRoot(namespace = NAME_SPACE_URL, localPart = "clientVersion")
    @ResponsePayload
    public ClientVersionResponse clientVersion(@RequestPayload ClientVersion serverVersion){
    ClientVersionResponse reponse= objectFactory.createClientVersionResponse();
    System.out.println(serverVersion.getStrVersion());
        reponse.setClientVersionResult("O:"+serverVersion.getStrVersion());
        return reponse;
    }

    @PayloadRoot(namespace = NAME_SPACE_URL, localPart = "authenticate")
    @ResponsePayload
    public AuthenticateResponse auth(@RequestPayload Authenticate authenticate){
        AuthenticateResponse response= objectFactory.createAuthenticateResponse();
        ArrayOfString resp= objectFactory.createArrayOfString();
        log.info("trying to attemp a connection");
        // Authentification utilisateur
        if ("monUtilisateurQB".equals(authenticate.getStrUserName()) &&
                "Autres11123".equals(authenticate.getStrPassword())) {

            String ticket= UUID.randomUUID().toString();
            resp.getString().add(ticket);
            resp.getString().add("");
            log.info("user connected");
            session.put("SESSION-TICKET",ticket);
        } else {
            resp.getString().add("nvu");
            resp.getString().add("");

//            response.setAuthenticateResult(resp);
//            return new String[] { "nvu", "" }; // nvu = Not Valid User
        }
        response.setAuthenticateResult(resp);
        return response;
    }

    @PayloadRoot(namespace = NAME_SPACE_URL, localPart = "sendRequestXML")
    @ResponsePayload
    public SendRequestXMLResponse request(@RequestPayload SendRequestXML sendRequestXML){
        SendRequestXMLResponse response= objectFactory.createSendRequestXMLResponse();
        if(session.containsKey("SESSION-TICKET") && session.containsValue(sendRequestXML.getTicket())){
            sendRequestXML.setStrHCPResponse("");
            log.info("send request");
            String req="<?xml version=\"1.0\" encoding=\"utf-8\"?>"+
                                        "<?qbxml version=\"13.0\"?>"+
                                        "<QBXML>"+
                                            "<QBXMLMsgsRq onError=\"stopOnError\">"+
                                                "<AccountAddRq>"+
                                                  "<AccountAdd>"+
                                                      "<Name >test</Name> "+
                                                      "<IsActive >false</IsActive> "+

                                                      "<AccountType >CostOfGoodsSold</AccountType> "+
                                                     
                                                      "</AccountAdd>"+
                                                  "</AccountAddRq>"+
                               
                                            "</QBXMLMsgsRq>"+
                                        "</QBXML>"
                    ;
            response.setSendRequestXMLResult(req);
        }
        return response;
    }
    @PayloadRoot(namespace = NAME_SPACE_URL, localPart = "receiveResponseXML")
    @ResponsePayload
    public ReceiveResponseXMLResponse reponse(@RequestPayload ReceiveResponseXML receiveResponseXML){
        ReceiveResponseXMLResponse response= objectFactory.createReceiveResponseXMLResponse();
        log.info(receiveResponseXML.getResponse());
        if(session.containsKey("SESSION-TICKET") && session.containsValue(receiveResponseXML.getTicket())){
            log.info(receiveResponseXML.getResponse());
            response.setReceiveResponseXMLResult(100);
        }
        return response;
    }
    @PayloadRoot(namespace = NAME_SPACE_URL, localPart = "closeConnection")
    @ResponsePayload
    public CloseConnectionResponse close(@RequestPayload CloseConnection closeConnection){
        CloseConnectionResponse response= objectFactory.createCloseConnectionResponse();
        if(session.containsKey("SESSION-TICKET") && session.containsValue(closeConnection.getTicket())){
            session.clear();
            response.setCloseConnectionResult("done");
        }
        return response;
    }
@PayloadRoot(namespace = NAME_SPACE_URL, localPart = "connectionError")
    @ResponsePayload
    public ConnectionErrorResponse conn(@RequestPayload ConnectionError connectionError){
        ConnectionErrorResponse response= objectFactory.createConnectionErrorResponse();
        if(session.containsKey("SESSION-TICKET") &&  session.containsValue(connectionError.getTicket())){
            response.setConnectionErrorResult(connectionError.getMessage());
        }
        return response;
    }
@PayloadRoot(namespace = NAME_SPACE_URL, localPart = "getLastError")
    @ResponsePayload
    public GetLastErrorResponse error(@RequestPayload GetLastError getLastError){
        GetLastErrorResponse response= objectFactory.createGetLastErrorResponse();
        if(session.containsKey("SESSION-TICKET") && session.containsValue(getLastError.getTicket())){
            response.setGetLastErrorResult("erreur");
        }
        return response;
    }


}
