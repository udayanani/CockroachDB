package com.tcs.eam.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Indexed;

import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "customer", indexes = {@Index(columnList="name"), @Index(columnList="age")})
public class Customer {

	@Id
	private Long id;
	
	@NotBlank
    @Size(min = 3, max = 100)
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "address")
	private String address;
	
	
//	@OneToMany(mappedBy="customer",cascade = CascadeType.ALL) 
//	private Set<Product> p;
//	 
	
	public Long getId() {
		return id;
	}
//	public Set<Product> getP() {
//		return p;
//	}
//	public void setP(Set<Product> p) {
//		this.p = p;
//	}
	public void setId(Long id) {
		this.id = id;
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

}
