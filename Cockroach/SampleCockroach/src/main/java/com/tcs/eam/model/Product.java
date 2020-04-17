package com.tcs.eam.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@Column(name = "prodId")
	private int prodId;
	
	@NotBlank
    @Size(min = 3, max = 100)
	@Column(name = "prodName")
	private String prodName;
	
	
	@NotBlank
	@Column(name = "custId")
	private int custId;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "FK_CUSTID")
	private Customer c;

	public int getProdId() {
		return prodId;
	}


	public void setProdId(int prodId) {
		this.prodId = prodId;
	}


	public String getProdName() {
		return prodName;
	}


	public void setProdName(String prodName) {
		this.prodName = prodName;
	}


	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	} 
	
}
