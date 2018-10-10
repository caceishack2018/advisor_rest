package org.hackathon.packapp.containerbank.rest;

import java.util.Collection;

import org.hackathon.packapp.containerbank.model.Advisor;
import org.hackathon.packapp.containerbank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AdvisorRest {

	 private final BankService bankService;
	 
	  @Autowired
	    public AdvisorRest(BankService bankService) {
	        this.bankService = bankService;
	    }
	  
	 @GetMapping(value = "/advisors")
	    public
	    
	   Collection<Advisor> showResourcesAdvisorList() {
	        // Here we are returning an object of type 'Advisors' rather than a collection of Advisor objects
	        // so it is simpler for JSon/Object mapping
		 System.out.println("matched");
	      
		 return this.bankService.findAdvisors();
	        
	    }
	 
	
}
