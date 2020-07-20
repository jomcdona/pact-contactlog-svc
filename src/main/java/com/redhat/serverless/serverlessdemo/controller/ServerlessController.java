package com.redhat.serverless.serverlessdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import com.redhat.serverless.serverlessdemo.model.contactdm;

@RestController
@RequestMapping(value = "/srv/")
public class ServerlessController {

	//@Autowired
	//Producer kafkaSender;

	//@GetMapping(value = "/producer")
        @GetMapping(path = "/test", produces = "application/json; charset=UTF-8")
        @ResponseBody
	public String helloserverless(@RequestParam("message") String message) {
		return "Hello " + message;
	}
        
        @PostMapping(path = "/logcontact", consumes = "application/text", produces = "application/json; charset=UTF-8")
        @ResponseBody
        public String saveContact(@RequestBody String contactentry)
        {
           String[] contactlist = contactentry.split(",");
           contactdm ct = new contactdm();
           ct.setmmid1(contactlist[0]);
           ct.setmmid2(contactlist[1]);
           ct.setgpsloc(contactlist[2]);
           ct.setcity(contactlist[3]);
           ct.setstate(contactlist[4]);
           ct.setcountry(contactlist[5]);
           

           return contactentry;
        }

}

