package com.ritesh.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Hello world!
 *
 */

@Path("/home")
public class App
{
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String home()
    {
        return "Home Page - Restful Web Service - Powered By Jersey :)";
    }
}