package com.company;

public final class Singleton {
    public String value;
    private static Singleton instance;
    SkladClass skladClass = new SkladClass();

    private Singleton(String value) {

        try {
            skladClass.dobavitVBloknot("Яблоко");//0
            skladClass.dobavitVBloknot("Мандарин");//1
            skladClass.dobavitVBloknot("Бананы");//2
            skladClass.dobavitVBloknot("Арбуз");//3
            skladClass.dobavitVBloknot("Хурма");//4
            for (int i = 0; i <skladClass.bloknot.size(); i++) {
                skladClass.prochitatSpisokNachalstvu(i);
                Thread.sleep(2000);
                System.out.println(skladClass.prochitatSpisokNachalstvu(i));
            }



        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}