package com.redhat.serverless.serverlessdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.redhat.serverless.serverlessdemo.model.contactdm;
import com.redhat.serverless.serverlessdemo.service.ContactsService;

@RestController
@RequestMapping(value = "/srv/")
public class ServerlessController {

	//@Autowired
    //Producer kafkaSender;
    @Autowired
    ContactsService cs;

	//@GetMapping(value = "/producer")
        @GetMapping(path = "/test", produces = "application/json; charset=UTF-8")
        @ResponseBody
	    public String helloserverless(@RequestParam("message") String message) {
		    return "Hello " + message;
    	}
        
        @PostMapping(path = "/logcontact", consumes = "text/plain", produces = "text/plain; charset=UTF-8")
        @ResponseBody
        public String saveContact(@RequestBody String contactentry)
        {

           String[] contactlist = contactentry.split(",");
           contactdm ct = new contactdm();
           ct.setMmid1(Integer.parseInt(contactlist[0] + "1"));
           ct.setMmid2(Integer.parseInt(contactlist[1] + "2"));
           ct.setGpsloc(Integer.parseInt(contactlist[2]));
           ct.setCity(contactlist[3]);
           ct.setState(contactlist[4]);
           ct.setCountry(contactlist[5]);
           cs.addContact(ct);
           return ct.getCity();

        }

        @GetMapping(path = "/findbystate/{state}", consumes = "text/plain", produces = "application/json; charset=UTF-8")
        @ResponseBody
        public List<contactdm>findByState(@RequestParam("state") String state)
        {
            return cs.findContactByState(state);
        }

        @GetMapping(path = "/findbycountry", consumes = "text/plain", produces = "application/json; charset=UTF-8")
        @ResponseBody
        public List<contactdm>findByCountry(@RequestParam("country") String country)
        {
            return cs.findContactByCountry(country);
        }

}
