package com.celcom.service;

import java.util.Collection;

import com.celcom.model.Account;


public interface AccountService {


    Collection<Account> findAll();

    Account findOne(Long id);
    
    Account searchAccountDetailsByAccountNo(String accountNo);
    
    Account searchAccountDetailsByMsisdn(String msisdn);
    
    Collection<Account> searchAccountdetailsByFirstName(String firstName);
    
    Collection<Account> searchaccountdetailsByLastName(String lastName);
    

}
