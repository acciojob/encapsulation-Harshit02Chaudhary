package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //obj.name = "Harshit";
        //assigning error - Unexpected token
        //System.out.println(obj.name);
        //printing error - name has private access in "com.driver.RWOnly"

        obj.setName("Harshit");
        System.out.println(obj.getName());
    }

}