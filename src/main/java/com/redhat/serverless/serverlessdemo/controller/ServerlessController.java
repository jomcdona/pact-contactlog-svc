package com.redhat.serverless.serverlessdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping(value = "/srv/")
public class ServerlessController {

	//@Autowired
	//Producer kafkaSender;

	//@GetMapping(value = "/producer")
        @RequestMapping(path = "/test", produces = "application/json; charset=UTF-8")
        @ResponseBody
	public String helloserverless(@RequestParam("message") String message) {
		return "Hello " + message;
	}

}

