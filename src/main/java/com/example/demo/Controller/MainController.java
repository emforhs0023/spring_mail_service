package com.example.demo.Controller;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CustomMailSender;

@CrossOrigin("*")
@RestController
@RequestMapping("/test/")

public class MainController {
	
	@Autowired
	CustomMailSender customMailSender;
	
	@GetMapping("/")
	public int selectDataList() throws MessagingException, IOException{
		
		int aa = customMailSender.sendMail();
		
		return 1;
	}
}
