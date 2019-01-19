package com.example.tolaotesanya.gsontutorial2019;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tolaotesanya on 19/01/2019.
 */

public class FamilyMember {

    @SerializedName("role")
    private String mRole;
    @SerializedName("age")
    private int mAge;

    public FamilyMember(String mRole, int mAge) {
        this.mRole = mRole;
        this.mAge = mAge;
    }
}
