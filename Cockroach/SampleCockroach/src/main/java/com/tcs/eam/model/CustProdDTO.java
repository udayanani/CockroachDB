package com.tcs.eam.model;

public class CustProdDTO {
	
	private String name;
	private int age;
	private String address;
	private String prodName;
	private int prodId;
	
	
	public CustProdDTO(String name, int age, String address, String prodName, int prodId) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.prodName = prodName;
		this.prodId = prodId;
	}
	
	
	public CustProdDTO(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	

}
