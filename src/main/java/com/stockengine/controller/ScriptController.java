package com.stockengine.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/script")
public class ScriptController {
	
	private static final String info = "Hello this is Stock analysis application in progress";
	
	@RequestMapping(method = RequestMethod.GET)
	public String getInfo(){
		return info;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addScript(){
		
	}

}
