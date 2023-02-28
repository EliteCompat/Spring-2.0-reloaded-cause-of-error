package com.programgripsafes.ordersystem.OrderManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*

@RestController
public class HelloWOrld {

    @Autowired
    @Qualifier("FancyWriter")
    TextWriter fancyText;

    @Autowired
    @Qualifier("NormalWriter")
    TextWriter normalText;


/*  unnecessary constructor injection, because of the @Autowired annotation, which does everything already for us.
    public HelloWOrld(TextWriter text){
    this.text = text;

    }

 */
/*
    @RequestMapping ("/")
    public String index() {
        return normalText.WriteText("hi Gab!");
    }
}
*/
