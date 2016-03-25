package com.celcom.actuator.health;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import com.celcom.model.Account;
import com.celcom.service.AccountService;

@Component
public class AccountServiceHealthIndicator implements HealthIndicator{

	@Autowired
	private AccountService accountService;
	
	@Override
	public Health health() {
		// TODO Auto-generated method stub
        Collection<Account> greetings = accountService.findAll();

        if (greetings == null || greetings.size() == 0) {
            return Health.down().withDetail("count", 0).build();
        }

        return Health.up().withDetail("count", greetings.size()).build();
	}

}
