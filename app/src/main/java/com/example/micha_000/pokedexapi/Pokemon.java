package com.example.micha_000.pokedexapi;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Pokemon {


    @SerializedName("name")
    public String name;
    @SerializedName("weight")
    public String weight;
    @SerializedName("height")
    public String height;
    /*@SerializedName("attack")
    public String attack;
    @SerializedName("defense")
    public String defense;
    @SerializedName("hp")
    public String hp;
    @SerializedName("special-attack")
    public String spa;
    @SerializedName("spcial-defense")
    public String spd;
    @SerializedName("speed")
    public String speed;

    @SerializedName("sprite")
    public String image;*/


//    public static final Parcelable.Creator<Pokemon> CREATOR = new Parcelable.Creator<Pokemon>()
//    {
//
//        @Override
//        public Pokemon createFromParcel(Parcel source) {
//            return new Pokemon(source);
//        }
//
//        @Override
//        public Pokemon[] newArray(int size) {
//            return new Pokemon[size];
//        }
//    };


//    public Pokemon(String mname, String mweight, String mheight, String mattack, String mdefense, String mhp, String mspa, String mspd, String mspeed)
//    {
//        name = mname;
//        weight = mweight;
//        height = mheight;
//        attack = mattack;
//        defense = mdefense;
//        hp = mhp;
//        spa = mspa;
//        spd = mspd;
//        speed = mspeed;
//    }

//    private Pokemon(Parcel in) {
//        name = in.readString();
//        weight = in.readString();
//        height = in.readString();
//    }
//
//    public int describeContents() {
//        return 0;
//    }
//
//
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(name);
//        dest.writeString(height);
//        dest.writeString(weight);
//    }


}
