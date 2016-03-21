package com.celcom.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.celcom.model.ServiceAliasList;

public class ServiceAliasRepositoryImpl implements ServiceAliasRepositoryCustom {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public ServiceAliasList getIdByName(String msisdn) {
		// TODO Auto-generated method stub	
		return (ServiceAliasList) em.createNativeQuery("SELECT * FROM service_alias_list_t WHERE name LIKE :msisdn", ServiceAliasList.class)
				.setParameter("msisdn", msisdn)
			    .setMaxResults(1)
			    .getSingleResult();
	}

}
