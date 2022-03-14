package com.lin.common.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lin.common.job.config.JobLog;
import com.lin.common.job.config.JobLogRepository;

@Controller
@RequestMapping("/job/logs")
public class JobLogController {
	@Autowired
	private JobLogRepository jobLogRespository;
	
	@GetMapping("")
	public ResponseEntity<List<JobLog>> getJobLogs() {
		return ResponseEntity.ok(jobLogRespository.findAll());
	}
}
