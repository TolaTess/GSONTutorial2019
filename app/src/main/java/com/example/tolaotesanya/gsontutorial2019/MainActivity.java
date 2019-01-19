package com.example.tolaotesanya.gsontutorial2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        Address address = new Address("Ireland", "Dublin");
        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Wife", 30));
        family.add(new FamilyMember("Son", 10));

        //Serialization

        //using the constructor, send in the value for the employee object
        Employee employee = new Employee("Sarah", 31, "sarah@mail.com", address, family);
        //serialize the employee details using gson.
        String json = gson.toJson(employee);


        /*Deserialization

        String json = "{\n" +
                "  \"age\": 31,\n" +
                "  \"firstname\": \"Sarah\",\n" +
                "  \"address\": {\n" +
                "    \"city\": \"Dublin\",\n" +
                "    \"country\": \"Ireland\"\n" +
                "  },\n" +
                "  \"mail\": \"sarah@mail.com\"\n" +
                "}";

        Employee employee = gson.fromJson(json, Employee.class);
        */
    }
}
