package com.programgripsafes.ordersystem.OrderManagementSystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("NormalWriter")
public class Normal_Writer implements TextWriter{
    public String WriteText(String s){
        return s.toUpperCase();
    }
}
