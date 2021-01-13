package org.acme.hibernate;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hibernate")
public class Resource {	

	@Inject
	SantaClausService service;

	@GET
	public Gift[] list() {
			return service.findAll();
	}
}
