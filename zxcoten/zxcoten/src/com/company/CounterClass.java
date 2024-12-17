package com.company;

import java.util.ArrayList;

public class CounterClass {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    CounterClass(String s){
        value = s;
     }
     private String countss(String s){
        setValue(s);
        return s;
     }
    }
