package com.celcom.repository;

import java.util.Collection;

import com.celcom.model.AccountNameInfo;



public interface AccountNameInfoRepositoryCustom {

	public Collection<AccountNameInfo> getIdByFirstName(String firstName);
	
	public Collection<AccountNameInfo> getIdByLastName(String lastName);
}
