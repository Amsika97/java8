package com.maveric.org.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "UserData")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User_Data {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	@Column(name="Name")
	private String userName;
	@Column(name="DOB")
	private String dob;
	@Column(name="Mobile")
	private String mobileNumber;
	@Column(name="Address")
	private String address;
	@Column(name="Type")
	private String userType;
	

	
}
