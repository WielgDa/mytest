package com.test.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.dao.impl.TestDAO;
import com.stock.model.test.Test;
import com.test.domain.model.Message;

@RestController
@Transactional
public class RestTestController {
	
    @RequestMapping(value = "/helloRest/{name}", headers = {"Accept=text/xml, application/json"})
    public Message helloWorld(@PathVariable String name) {
    	System.out.println("/helloRest/{name}");
    	
    	Test test = (Test) testDAO.get(1);
    	
        Message msg = new Message(name, "Hello " + test.getId());
        return msg;
    }
    
    @Autowired
    TestDAO testDAO;


}
