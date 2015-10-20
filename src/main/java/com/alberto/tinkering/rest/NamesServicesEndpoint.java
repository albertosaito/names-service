package com.alberto.tinkering.rest;


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;


/**
 * NamesServicesEndpoint represents ...
 *
 * @author <a href="mailto:nobuji.saito@24hourfit.com">nobuji.saito</a>
 * @version $Id$
 * @since Oct 19, 2015
 *
 */
@ApplicationPath ("")
@Path ("/")
public class NamesServicesEndpoint extends Application
{

   /**
    * Represents getNames
    *
    * @param names
    * @return {@link String}
    * @since Oct 19, 2015
    *
    */
   /**
    * Represents getNames
    *
    * @param names
    * @return DONE
    * @since Oct 19, 2015
    *
    * @todo complete description
    */
   @POST
   @Consumes ({"application/xml", "application/json"})
   @Path ("names")
   public String getNames (final String... names)
   {
      for (final String name : names)
      {
         System.out.println (name);
      }
      return "DONE";

   }

}
