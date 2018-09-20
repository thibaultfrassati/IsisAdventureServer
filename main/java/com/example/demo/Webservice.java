package com.example.demo;


import java.io.FileNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tfrassat
 */

@Path("generic")
public class Webservice {
 Services services;
 public Webservice() {
 services = new Services();
 }
 
 @GET
 @Path("world")
 /**@Produces(MediaType.APPLICATION_XML)*/
 @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
 public Response getWorld() {
 return Response.ok(services.getWorld()).build();
 }

 
    /**
     * PUT method for updating or creating an instance of GenericResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    //@PUT
    //@Path("product")
    //@Consumes("application/json")

    //public void putProduct(String content,@Context HttpServletRequest request) throws JAXBException, FileNotFoundException {
        //System.out.println(content);//afiche le XML du product
    //    ProductType product = new Gson().fromJson(content, ProductType.class);
    //    username = request.getHeader("X-User");
    //    services.updateProduct(username, product);
    //}

}
