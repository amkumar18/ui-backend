package com.celcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.celcom.model.ServiceAliasList;

@Repository
public interface ServiceAliasRepository extends JpaRepository<ServiceAliasList, Long>, ServiceAliasRepositoryCustom {

}
