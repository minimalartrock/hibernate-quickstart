package org.acme.hibernate;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class SantaClausService {
    @Inject
    EntityManager em; 

    @Transactional 
    public void createGift(String giftDescription) {
        Gift gift = new Gift();
        gift.setName(giftDescription);
        em.persist(gift);
		}
		
		public Gift[] findAll() {
			return em.createNamedQuery("gift.findAll", Gift.class)
				.getResultList().toArray(new Gift[0]);
		}
}