package com.demo.assignment;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.demo.assignment.model.InputJSON;


@Consumes(MediaType.APPLICATION_JSON)
@Path("/api")
public class DemoResource {

    @Inject
    DemoService service;


    @GET@Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello World!";
    }

    @POST
    @Path("/convertStr")
    public Response convertString(InputJSON inputJson) {
        if (inputJson.inputStr == null){
            return Response.ok("Invalid JSON.").status(403).build();
        }
        service.convertStringToDesiredFormat(inputJson);
        return Response.ok("Success! See application logs.").build();
    }
}