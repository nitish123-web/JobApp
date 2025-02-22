package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.JobPost;
import com.example.demo.repo.JobRepo;

@Service
public class JobService {
	
	@Autowired
	JobRepo jobrepo;
	
	public void addjob(JobPost jb) {
		jobrepo.addjob(jb);
	}
	
	
	public List<JobPost> viewalljobs(){
		
		return jobrepo.getalljobs();
		
	}

}
