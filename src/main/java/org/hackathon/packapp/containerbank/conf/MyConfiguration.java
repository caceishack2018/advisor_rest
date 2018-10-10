package org.hackathon.packapp.containerbank.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration()
@ComponentScan({"org.hackathon.packapp.containerbank.rest","org.hackathon.packapp.containerbank.service","org.hackathon.packapp.containerbank.repository.jpa"})
public class MyConfiguration {
	
	
	
	

}
