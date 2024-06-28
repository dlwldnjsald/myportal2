package himedia.myportal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import himedia.myportal.services.PhonebookService;

@RequestMapping("/phonebook")
@Controller
public class PhonebookController {
	
	@Autowired
	private PhonebookService phonebookService;

	
	
}
