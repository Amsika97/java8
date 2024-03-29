package com.maveric.org;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DatabaseInteractionRepository extends JpaRepository<CustomerEntity, Long> {

	

}
