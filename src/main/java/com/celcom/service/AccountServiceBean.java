package com.celcom.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.persistence.EntityExistsException;
import javax.persistence.NoResultException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celcom.model.Account;
import com.celcom.model.AccountNameInfo;
import com.celcom.model.ServiceAliasList;
import com.celcom.model.ServiceInstance;
import com.celcom.repository.AccountNameInfoRepository;
import com.celcom.repository.AccountRepository;
import com.celcom.repository.ServiceAliasRepository;
import com.celcom.repository.ServiceInstanceRepository;


@Service
public class AccountServiceBean implements AccountService {

    //private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private ServiceInstanceRepository serviceInstanceRepository;

    @Autowired
    private AccountRepository accountRepository;
    
    @Autowired
    private AccountNameInfoRepository accountNameInfoRepository;
    
    @Autowired
    private ServiceAliasRepository serviceAliasRepository;

    @Override
    public Collection<Account> findAll() {
        //logger.info("> findAll");

        Collection<Account> accounts = accountRepository.findAll();

        //logger.info("< findAll");
        return accounts;
    }

    @Override
    public Account findOne(Long id) {
        //logger.info("> findOne id:{}", id);

        Account account = accountRepository.findOne(id);

       // logger.info("< findOne id:{}", id);
        return account;
    }



	@Override
	public Account searchAccountDetailsByAccountNo(String accountNo) {
		// TODO Auto-generated method stub
		Account account = accountRepository.getAccountIdByAccountNo(accountNo);
		return account;
	}


	@Override
	public Collection<Account> searchAccountdetailsByFirstName(String firstName) {
		// TODO Auto-generated method stub
		Collection<Account> acctList = new ArrayList<Account>();
		Collection<AccountNameInfo> acctNameInfo = accountNameInfoRepository.getIdByFirstName(firstName);
		Iterator<AccountNameInfo> itr = acctNameInfo.iterator();
		
		while(itr.hasNext()){
			AccountNameInfo acctInfo = (AccountNameInfo) itr.next();
			Account acct = accountRepository.findOne(acctInfo.getId());
			acctList.add(acct);
		}
		return acctList;
	}

	@Override
	public Collection<Account> searchaccountdetailsByLastName(String lastName) {
		// TODO Auto-generated method stub
		Collection<Account> acctList = new ArrayList<Account>();
		Collection<AccountNameInfo> acctNameInfo = accountNameInfoRepository.
													getIdByLastName(lastName);
		Iterator<AccountNameInfo> itr = acctNameInfo.iterator();
		
		while(itr.hasNext()){
			AccountNameInfo acctInfo = (AccountNameInfo) itr.next();
			Account acct = accountRepository.findOne(acctInfo.getId());
			acctList.add(acct);
		}
		return acctList;
	}

	@Override
	public Account searchAccountDetailsByMsisdn(String msisdn) {
		// TODO Auto-generated method stub
		ServiceAliasList servList = serviceAliasRepository.getIdByName(msisdn);
		ServiceInstance servIntance = serviceInstanceRepository.findOne(servList.getId());
		Account acct = accountRepository.findOne(servIntance.getAccountId());
		return acct;
	}

}
