package com.celcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.celcom.model.ServiceInstance;

public interface ServiceInstanceRepository extends JpaRepository<ServiceInstance, Long> {

}
