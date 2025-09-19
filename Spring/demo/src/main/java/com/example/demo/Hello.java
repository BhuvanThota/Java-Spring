package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Hello {

    @Autowired
    World obj;

    
    public void code(){
        obj.print();
    }
        
}

