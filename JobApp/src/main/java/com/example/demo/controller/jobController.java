package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.JobPost;
import com.example.demo.service.JobService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class jobController {
	
	@Autowired
	JobService service;

	@GetMapping({"/","home"})
	public String home() {
		
		return "home";
		
	}
	
	@GetMapping("addjob")
	public String addjob() {
		
		return "addjob";
		
	}
	
	@PostMapping("handleForm")
	public String handleForm(JobPost JobPost) {

		service.addjob(JobPost);
		return "success";
		
	}
	
	@GetMapping("viewalljobs")
	public String viewalljobs(Model m){
		List<JobPost> jobs=service.viewalljobs();
		m.addAttribute("jobPosts",jobs);
		return "viewalljobs";
		
	}
	
	
	
	
	
	
	
}
