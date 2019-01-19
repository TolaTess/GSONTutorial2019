package com.example.tolaotesanya.gsontutorial2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        //Serialization
        //using the constructor, send in the value for the employee object
        Employee employee = new Employee("Sarah", 31, "sarah@mail.com");
        //serialize the employee details using gson.
        String json = gson.toJson(employee);
    }
}
