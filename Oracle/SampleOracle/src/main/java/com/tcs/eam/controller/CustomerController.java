package com.tcs.eam.controller;


import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.eam.model.Customer;
import com.tcs.eam.model.Product;
import com.tcs.eam.model.CustProdDTO;
import com.tcs.eam.repository.CustomerRepository;
import com.tcs.eam.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cs;
	
	@GetMapping("/")
    public ModelAndView registration() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("customer", new Customer());
		return mv;
    }
	
	   @PostMapping(value = "/createCustomer")
	   public ModelAndView addCustomer(@ModelAttribute("customer") Customer c) {
		   ModelAndView mv = new ModelAndView("index");
		   cs.save(c);
		   mv.addObject("message", "Customer created/updated successfully");
		   return mv;
	   }
	   
	   @PostMapping("/savecust")
	   public ModelAndView saveCustomer(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("age") int age,@RequestParam("address") String address) {
		   System.out.println("Hello");
		   ModelAndView mv = new ModelAndView("index");
		  Long id1=Long.parseLong(id);
		  cs.updateCustomer(id1,name,age,address); 
	   		//cs.save(c);
		   mv.addObject("message", "Customer created/updated successfully");
		   return mv;
	   }
	   
	  
	   @RequestMapping("/updateCustomer/{id}")
	   public ModelAndView updateCustomer(@PathVariable long id)
	   {
		   ModelAndView mv = new ModelAndView("update_customer");
		    Customer customer = cs.get(id);
		    String s = customer.getId().toString();
		    mv.addObject("customer1", customer);	
		    System.out.println("customer id is: "+customer.getId());
		    return mv;
	   }
	   
	   @RequestMapping("/delete/{id}")
	   public ModelAndView deleteCustomer(@PathVariable("id") Long id) {
		   System.out.println("id is: "+id);
		   ModelAndView mv = new ModelAndView("index");
	      // cs.delete(Long.parseLong(id));
		   cs.delete(id);
	       mv.addObject("message", "Customer deleted successfully");
	       mv.addObject("customer", new Customer());
	       return mv;       
	   }
	   
	   @GetMapping("/search/{name}")
	   public ModelAndView search(@PathVariable String name) {
	       List<Customer> result = cs.search(name);
	       ModelAndView mv = new ModelAndView("search");
	       mv.addObject("result", result);
	    
	       return mv;    
	   }
	   
	   @GetMapping("/selectAll")
	   public ModelAndView selectAll() {
	       List<Customer> c = cs.selectAll();
	       ModelAndView mv = new ModelAndView("search");
	       mv.addObject("result", c);
	    
	       return mv;    
	   }
	   
	   @GetMapping("/search1")
	   public ModelAndView search1() {
	       List<CustProdDTO> result = cs.search1();
	       ModelAndView mv = new ModelAndView("search");
	       mv.addObject("result", result);
	    
	       return mv;    
	   }
	   
	   @GetMapping("/selectJoin")
	   public ModelAndView selectJoin() {
	       List<CustProdDTO> c = cs.selectJoin();
	       
	       for(CustProdDTO c1 : c)
	       {
	    	   System.out.println("Hi: "+c1.getName() + "  "+ c1.getProdName());
	       }
	       System.out.println(c);
	       ModelAndView mv = new ModelAndView("searchJoin");
	       mv.addObject("result", c);
	    
	       return mv;    
	   }
	   
	   @GetMapping("/searchP")
	   public ModelAndView searchProduct() {
	       List<Product> result = cs.searchProduct();
	       for(Product p : result)
	       {
	    	   System.out.println(p.getProdId());
	       }
	       ModelAndView mv = new ModelAndView("searchproduct");
	       mv.addObject("result", result);
	    
	       return mv;    
	   }

}
