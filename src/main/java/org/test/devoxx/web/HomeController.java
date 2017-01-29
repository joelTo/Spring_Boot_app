package org.test.devoxx.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	// Pour lancer un element properties ou // Valeur par defaut est devoxx
	@Value("${conference.name:devoxx}")
	private String conference;

	@RequestMapping("/")
	public String home() {
		return "hello " + conference;
	}

}
