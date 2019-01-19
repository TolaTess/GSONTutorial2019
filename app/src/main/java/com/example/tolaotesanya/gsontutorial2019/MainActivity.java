package com.example.tolaotesanya.gsontutorial2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        /*Serialization
        Address address = new Address("Ireland", "Dublin");
        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Wife", 30));
        family.add(new FamilyMember("Son", 10));


        //using the constructor, send in the value for the employee object
        Employee employee = new Employee("Sarah", 31, "sarah@mail.com", address, family);
        //serialize the employee details using gson.
        String json = gson.toJson(employee);
        */


        //Deserialization
        String json = "{\n" +
                "  \"age\": 31,\n" +
                "  \"firstname\": \"Tom\",\n" +
                "  \"address\": {\n" +
                "    \"city\": \"Dundalk\",\n" +
                "    \"country\": \"Ireland\"\n" +
                "  },\n" +
                "  \"family\": [\n" +
                "    {\n" +
                "      \"age\": 30,\n" +
                "      \"role\": \"Wife\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"age\": 10,\n" +
                "      \"role\": \"Son\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"mail\": \"sarah@mail.com\"\n" +
                "}";

        Employee employee = gson.fromJson(json, Employee.class);

        //Deserialize array head object
        String json1 = "[\n" +
                "    {\n" +
                "      \"age\": 30,\n" +
                "      \"role\": \"Wife\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"age\": 10,\n" +
                "      \"role\": \"Son\"\n" +
                "    }\n" +
                "  ]";

        //Arrays
        FamilyMember[] familyMembers = gson.fromJson(json1, FamilyMember[].class);

        //For List - create a Type
        Type familyType = new TypeToken<ArrayList<FamilyMember>>(){}.getType();
        ArrayList<FamilyMember> family = gson.fromJson(json1, familyType);

    }
}
