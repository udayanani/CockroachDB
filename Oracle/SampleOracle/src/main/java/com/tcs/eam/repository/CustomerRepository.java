package com.tcs.eam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.tcs.eam.model.Customer;
import com.tcs.eam.model.CustProdDTO;

import java.util.List;
import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Query(value = "SELECT * FROM Customer ORDER BY age DESC", nativeQuery = true)
	public List<Customer> selectAll();
	
	@Query(value = "SELECT * FROM Customer c where c.name like ?1", nativeQuery = true)
	 public List<Customer> search(@Param("name") String name);
	
	@Query(value = "SELECT new com.tcs.eam.model.CustProdDTO(c.name,c.age,c.address,p.prodName,p.prodId) FROM Customer c INNER JOIN Product p on c.id=p.custId")
	 public List<CustProdDTO> searchJoin();
	
	@Query(value = "UPDATE Customer c SET c.name=?2, c.age=?3,c.address=?4 WHERE c.id=?1")
	 public void update(@Param("id") Long id,@Param("name") String name,@Param("age") int age,@Param("address") String address);
	
	@Query(value = "SELECT new com.tcs.eam.model.CustProdDTO(c.name,c.age,c.address) FROM Customer c")
	 public List<CustProdDTO> search1();
	

}
