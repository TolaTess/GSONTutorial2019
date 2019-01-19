package com.example.tolaotesanya.gsontutorial2019;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tolaotesanya on 19/01/2019.
 */

public class Employee {

    //three fields
    //Expose = default is true = only the ones with this will be serialised or desrialised.... Then you can remove transient from password.
    @Expose
    private String firstname;
    @Expose(serialize = false)
    private int age;
    @Expose(deserialize = false)
    private String mail;
    //transient - java keyword that keeps the field from being serialised/deserialised
    private transient String password;

    //create an instance of Address
    //nested objects
    @SerializedName("address")
    private Address mAddress;

    //create an instance of Family members
    //arrays
    @SerializedName("family")
    private List<FamilyMember> mFamily;

    //constructor = needed for serialization
    public Employee(String firstname, int age, String mail, String password, Address address, List<FamilyMember> family)
    {
        this.firstname = firstname;
        this.age = age;
        this.mail = mail;
        this.password = password;
        mAddress = address;
        mFamily = family;
    }

}
