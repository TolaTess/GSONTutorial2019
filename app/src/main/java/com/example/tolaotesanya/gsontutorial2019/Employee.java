package com.example.tolaotesanya.gsontutorial2019;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tolaotesanya on 19/01/2019.
 */

public class Employee {

    //three fields
    private String firstname;
    private int age;
    private String mail;

    //create an instance of Address
    //nested objects
    @SerializedName("address")
    private Address mAddress;

    //create an instance of Family members
    //arrays
    @SerializedName("family")
    private List<FamilyMember> mFamily;

    //constructor = needed for serialization
    public Employee(String firstname, int age, String mail, Address address, List<FamilyMember> family)
    {
        this.firstname = firstname;
        this.age = age;
        this.mail = mail;
        mAddress = address;
        mFamily = family;
    }

}
