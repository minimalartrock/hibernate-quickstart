package org.acme.hibernate;

import javax.inject.Inject;

@Path("hibernate")
public class Resource {	

	@Inject
	SantaClausService service;

	@GET
    public List<Fruit> list() {
				return findAll();
    }
}
