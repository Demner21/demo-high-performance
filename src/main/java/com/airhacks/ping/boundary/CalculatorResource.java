package com.airhacks.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("calculate")
public class CalculatorResource {

    @GET
    public String calculate() {
        
        return "Enjoy Java EE 8!";
    }

}
