/**
 * 
 */
package com.debashish.jerseySpringTest.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author Raju
 *
 */
@ApplicationPath("rs")
public class RestBootstrap extends ResourceConfig {
	
	public RestBootstrap() {
		packages("com.debashish.jerseySpringTest.rest");
	}
}
