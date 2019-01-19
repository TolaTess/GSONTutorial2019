package com.example.tolaotesanya.gsontutorial2019;

import java.util.Arrays;

/**
 * Created by tolaotesanya on 19/01/2019.
 */

public class Employee {

    //three fields
    private String firstname;
    private int age;
    private String mail;

    //constructor = needed for serialization
    public Employee(String firstname, int age, String mail)
    {
        this.firstname = firstname;
        this.age = age;
        this.mail = mail;
    }

}
