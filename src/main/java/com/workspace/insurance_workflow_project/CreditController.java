package com.workspace.insurance_workflow_project;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/credit-score")
@CrossOrigin("*")
public class CreditController {
	
	@GetMapping
	public ExternalData getExternalData(@RequestParam String name,@RequestParam String dob) {
		System.out.println("Called..... "+name+"  "+dob);
		ExternalData externalData=new ExternalData(456.2,"Some info");
		System.out.println(externalData);
		return externalData;
	}

}
