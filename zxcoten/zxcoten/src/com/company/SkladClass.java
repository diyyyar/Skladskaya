package com.company;

import java.util.ArrayList;

public class SkladClass {
    ArrayList<String> bloknot = new ArrayList<>();

    public void dobavitVBloknot(String product){
        bloknot.add(product);
    }
    public String prochitatSpisokNachalstvu(int id){
        return bloknot.get(id);
    }
}
