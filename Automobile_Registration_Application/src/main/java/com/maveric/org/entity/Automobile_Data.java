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
@Table(name="automobile")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Automobile_Data {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int id;
	
	@Column(name="Owner_Name")
	private String owner_name;
	
	@Column(name="Model")
	private String model;
	
	@Column(name="Year")
	private String year;
	
	@Column(name="Manufacturer")
	private String manufacturer;
	

}
