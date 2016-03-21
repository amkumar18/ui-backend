package com.celcom.web.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.celcom.model.Account;
import com.celcom.service.AccountService;


@RestController
public class AccountController extends BaseController {


    @Autowired
    private AccountService accountService;

    @RequestMapping(
            value = "/api/accounts",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Account>> getAccounts() {
        logger.info("> getAccounts");

        Collection<Account> accounts = accountService.findAll();
        logger.info("< getAccounts");
        return new ResponseEntity<Collection<Account>>(accounts,
                HttpStatus.OK);
    }
    


    @RequestMapping(
            value = "/api/accounts/accountPoid/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Account> getAccount(@PathVariable("id") Long id) {
        logger.info("> getAccount id:{}", id);

        Account account = accountService.findOne(id);
        if (account == null) {
            return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
        }

        logger.info("< getAccount id:{}", id);
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }
    
    @RequestMapping(
            value = "/api/accounts/firstname/{firstName}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Account>> getAccountByFirstName(@PathVariable("firstName") String firstName) {
        logger.info("> getAccountByFirstName id:{}", firstName);

        Collection<Account> accountCol = accountService.searchAccountdetailsByFirstName(firstName);
        if (accountCol == null) {
            return new ResponseEntity<Collection<Account>>(HttpStatus.NOT_FOUND);
        }

        logger.info("< getAccountByFirstName id:{}", firstName);
        return new ResponseEntity<Collection<Account>>(accountCol, HttpStatus.OK);
    }
    
    @RequestMapping(
            value = "/api/accounts/lastname/{lastName}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Account>> getAccountByFirstNameLastName(@PathVariable("lastName") String lastName) {
        logger.info("> getAccountByLastName id:{}", lastName);

        Collection<Account> accountCol = accountService.searchaccountdetailsByLastName(lastName);
        if (accountCol == null) {
            return new ResponseEntity<Collection<Account>>(HttpStatus.NOT_FOUND);
        }

        logger.info("< getAccountByLastName id:{}", lastName);
        return new ResponseEntity<Collection<Account>>(accountCol, HttpStatus.OK);
    }

    
    
    @RequestMapping(
            value = "/api/accounts/accountno/{accountNo}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Account> searchAccountByAccountNo(@PathVariable("accountNo") String accountNo) {
        logger.info("> getAccount accountNo:{}", accountNo);

        Account account = accountService.searchAccountDetailsByAccountNo(accountNo);
        if (account == null) {
            return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
        }

        logger.info("< getAccount accountNo:{}", accountNo);
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }
    
    
    @RequestMapping(
            value = "/api/accounts/service/msisdn/{msisdn}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Account> searchAccountByMsisdn(@PathVariable("msisdn") String msisdn) {
        logger.info("> searchAccountByMsisdn msisdn:{}", msisdn);

        Account account = accountService.searchAccountDetailsByMsisdn(msisdn);
        if (account == null) {
            return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
        }

        logger.info("< searchAccountByMsisdn msisdn:{}", msisdn);
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }

}
