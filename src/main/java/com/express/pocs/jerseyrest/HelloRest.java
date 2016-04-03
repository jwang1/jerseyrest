package com.express.pocs.jerseyrest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.express.pocs.jerseyrest.dto.Welcome;

/**
 * Use Code Templates to update the text.
 *
 * @author Jun Wang 
 * @since  Mar 20, 2016
 * 
 */
@Path("hello")
public class HelloRest {

    /**
     * Method handling HTTP GET requests. The returned object will be sent to
     * the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "Hey, This is Jersey JAX-RS !";
    }
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Welcome simplejson() {
        Welcome welcome=new Welcome();
        welcome.setDomain("www.javahash.com");
        welcome.setMessage("JSON Example");
        return welcome;
    }
}

