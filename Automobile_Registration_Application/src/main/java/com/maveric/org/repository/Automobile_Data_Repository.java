package com.maveric.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maveric.org.entity.Automobile_Data;

@Repository
public interface Automobile_Data_Repository  extends JpaRepository<Automobile_Data, Integer>{

}
