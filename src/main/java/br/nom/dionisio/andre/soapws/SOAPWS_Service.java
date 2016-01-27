package br.nom.dionisio.andre.soapws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2016-01-26T16:19:58.510-02:00
 * Generated source version: 3.1.4
 * 
 */
@WebServiceClient(name = "SOAPWS", 
                  wsdlLocation = "file:SOAPWS.wsdl",
                  targetNamespace = "http://www.andre.dionisio.nom.br/SOAPWS/") 
public class SOAPWS_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.andre.dionisio.nom.br/SOAPWS/", "SOAPWS");
    public final static QName SOAPWSSOAP = new QName("http://www.andre.dionisio.nom.br/SOAPWS/", "SOAPWSSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:SOAPWS.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SOAPWS_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:SOAPWS.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SOAPWS_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SOAPWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SOAPWS_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SOAPWS_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SOAPWS_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SOAPWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SOAPWS
     */
    @WebEndpoint(name = "SOAPWSSOAP")
    public SOAPWS getSOAPWSSOAP() {
        return super.getPort(SOAPWSSOAP, SOAPWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SOAPWS
     */
    @WebEndpoint(name = "SOAPWSSOAP")
    public SOAPWS getSOAPWSSOAP(WebServiceFeature... features) {
        return super.getPort(SOAPWSSOAP, SOAPWS.class, features);
    }

}