package com.maveric.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maveric.org.entity.User_Data;

@Repository
public interface UserRepository extends JpaRepository<User_Data, Integer> {

}
