package com.maveric.org;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(schema = "TAFJ", name = "V_FBNK_CUSTOMER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity {

	@Id
	@Column(name = "RECID")
	private Long recId;

	@Column(name = "CUSTOMER_CODE")
	private String customerCode;

	@Column(name = "CUSTOMER_NO")
	private String customerNo;

	@Column(name = "MNEMONIC")
	private String mnemonic;

	@Column(name = "SHORT_NAME")
	private String shortname;

	@Column(name = "Name_1")
	private String name1;

	@Column(name = "POST_CODE")
	private String postCode;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "NATIONALITY")
	private String nationality;

	@Column(name = "RESIDENCE")
	private String residence;

	@Column(name = "LANGUAGE")
	private String language;

	@Column(name = "AUTHORISER")
	private String authoriser;

}
