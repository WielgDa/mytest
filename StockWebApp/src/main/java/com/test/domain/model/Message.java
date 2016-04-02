package com.test.domain.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

@SuppressWarnings("restriction")
@XmlRootElement(name = "myTest")
public class Message {
	 
    String name;
    String text;
    
    public Message(){}
 
    public Message(String name, String text) {
        this.name = name;
        this.text = text;
    }
 
    @XmlElement
    public String getName() {
        return name;
    }
    @XmlElement
    public String getText() {
        return text;
    }
 
}