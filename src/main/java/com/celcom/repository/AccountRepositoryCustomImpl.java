package com.celcom.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.celcom.model.Account;


public class AccountRepositoryCustomImpl implements AccountRepositoryCustom {
	
    @PersistenceContext
    private EntityManager em;

	@Override
	public Account getAccountIdByAccountNo(String accountNo) {
		// TODO Auto-generated method stub

		return (Account) em.createQuery(
			    "SELECT poid_id0 FROM account_t acct WHERE acct.account_no LIKE :acctNo")
			    .setParameter("acctNo", accountNo)
			    .setMaxResults(1)
			    .getSingleResult()
			    ;
	}

/*	@Override
	public AccountNameInfo getIdByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return (AccountNameInfo) em.createQuery(
			    "SELECT distinct obj_id0 FROM account_nameinfo_t acct WHERE acct.first_name LIKE :firstName")
			    .setParameter("firstName", firstName)
			    .setMaxResults(1)
			    .getSingleResult()
			    ;
	}*/

/*	@Override
	public Account getAccountIdFromMsisdn(String msisdn) {
		// TODO Auto-generated method stub
		return (Account) em.createQuery(
			    "SELECT poid_id0 FROM account_t acct,service_t serv, service_alias_list_t sal"
			    + "acct.poid_id0 = serv.account_obj_id0"
			    + "and serv.poid_id0 = sal.obj_id0"
			    + "and sal.name LIKE :msisdn")
			    .setParameter("msisdn", msisdn)
			    .setMaxResults(1)
			    .getSingleResult()
			    ;
	}*/

/*	@Override
	public AccountSearchDetails getAccountDetailsByServiceId(String serviceId) {
		// TODO Auto-generated method stub
		return (AccountSearchDetails) em.createQuery(
			    "SELECT DISTINCT acct.account_no," +
                " sal.name AS service_id," +
                " serv.poid_type AS serviceType," +
                " ant.first_name," +
                " ant.last_name," +
                " ant.company," +
                " ant.address," +
                " ant.city," +
                " ant.state," +
                " ant.zip," +
                " ant.country" +
  " FROM service_alias_list_t sal,"+
       " service_t serv," +
       " account_t acct," +
       " account_nameinfo_t ant" +
  " WHERE serv.poid_id0 = sal.obj_id0" +
       " AND acct.poid_id0 = serv.account_obj_id0" +
       " AND acct.poid_id0 = ant.obj_id0" +
       " AND sal.name = :serviceId")
			    .setParameter("serviceId", serviceId)
			    .setMaxResults(1)
			    .getSingleResult()
			    ;
	}*/

}
