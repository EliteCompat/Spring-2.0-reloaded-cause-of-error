package com.programgripsafes.ordersystem.OrderManagementSystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("FancyWriter")
public class FancyWriter implements TextWriter{

    public String WriteText(String s){
        return s + " writing this Text in a decoupled function and place it here... (fancy)";
    }
}
