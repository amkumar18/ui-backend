package com.celcom.repository;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.Query;

import com.celcom.model.AccountNameInfo;

public class AccountNameInfoRepositoryCustomImpl implements AccountNameInfoRepositoryCustom {
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Query
	public Collection<AccountNameInfo> getIdByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return  (Collection<AccountNameInfo>) em.createQuery(
			    "SELECT obj_id0 FROM account_nameinfo_t acct WHERE acct.first_name LIKE :firstName")
			    .setParameter("firstName", firstName)
			    .setMaxResults(10)
			    .getSingleResult()
			    ;
	}

	@Override
	@Query
	public Collection<AccountNameInfo> getIdByLastName(String lastName) {
		// TODO Auto-generated method stub
		return  (Collection<AccountNameInfo>) em.createQuery(
			    "SELECT obj_id0 FROM account_nameinfo_t acct WHERE acct.first_name LIKE :lastName")
			    .setParameter("lastName", lastName)
			    .setMaxResults(10)
			    .getSingleResult()
			    ;
	}

}
