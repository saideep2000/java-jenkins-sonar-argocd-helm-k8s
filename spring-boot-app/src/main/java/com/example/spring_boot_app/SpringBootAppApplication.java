package com.example.spring_boot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@SpringBootApplication
@Controller
public class SpringBootAppApplication {

	@GetMapping("/")
	public String index(final Model model) {
		model.addAttribute("title", "I have successfuly built a sprint boot application using Maven");
		model.addAttribute("msg", "This application is deployed on to Kubernetes using Argo CD");
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

}
