package com.celcom.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.celcom.model.AccountNameInfo;

@Repository
public interface AccountNameInfoRepository extends JpaRepository<AccountNameInfo, Long>,AccountNameInfoRepositoryCustom {

}
