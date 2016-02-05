/**
 * 
 */
package com.debashish.jerseySpringTest.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.debashish.jerseySpringTest.service.RestTestServiceImpl;

/**
 * @author Raju
 *
 */
@Component
@Path("/test")
public class RestTestController {
	
	@Autowired
	private RestTestServiceImpl service;
	
	@GET
	@Path("/get")
	@Produces("application/json")
	public Response testSubresource() {
		System.out.println("0");
		service.testServiceMethod();
		return Response.ok().entity("0").build();
	}

	public RestTestServiceImpl getService() {
		return service;
	}

	public void setService(RestTestServiceImpl service) {
		this.service = service;
	}
}
