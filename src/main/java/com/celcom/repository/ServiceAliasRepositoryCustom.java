package com.celcom.repository;

import com.celcom.model.ServiceAliasList;

public interface ServiceAliasRepositoryCustom {
	
	public ServiceAliasList getIdByName(String name);

}
