package com.example.tolaotesanya.gsontutorial2019;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tolaotesanya on 19/01/2019.
 */

public class Address {

    @SerializedName("country")
    private String mCountry;
    @SerializedName("city")
    private String mCity;

    public Address(String mCountry, String mCity) {
        this.mCountry = mCountry;
        this.mCity = mCity;
    }
}
