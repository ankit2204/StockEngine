package com.stockengine.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/script")
public class ScriptController {
	
	@RequestMapping(method = RequestMethod.POST)
	public void addScript(){
		
	}

}
