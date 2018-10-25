package com.example.micha_000.pokedexapi;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pokemon {


    @SerializedName("name")
    public String name;
    @SerializedName("weight")
    public String weight;
    @SerializedName("height")
    public String height;
    @SerializedName("id")
    public String number;
    @SerializedName("sprites")
    public Drawable image;
    @SerializedName("stats")
    private List<JsonObject> mStats;
    @SerializedName("attack")
    public String attack;
    @SerializedName("defense")
    public String defense;
    @SerializedName("hp")
    public String hp;
    @SerializedName("special-attack")
    public String spa;
    @SerializedName("special-defense")
    public String spd;
    @SerializedName("speed")
    public String speed;

    public String getAttack() {
        for(int i=0; i< this.mStats.size(); i++)
        {
            JsonObject x = this.mStats.get(i);
            if(x.get("stat") instanceof JsonObject)
            {
                if(String.valueOf(((JsonObject) x.get("stat")).get("name")).equals("\"attack\""))
                {
                    this.attack = String.valueOf(x.get("base_stat"));
                }

            }
        }
        return attack;
    }

    public String getDefense() {
        for(int i=0; i< this.mStats.size(); i++)
        {
            JsonObject x = this.mStats.get(i);
            if(x.get("stat") instanceof JsonObject)
            {
                if(String.valueOf(((JsonObject) x.get("stat")).get("name")).equals("\"defense\""))
                {
                    this.defense = String.valueOf(x.get("base_stat"));
                }

            }
        }
        return defense;
    }
    public String getSpecialAttack() {
        for(int i=0; i< this.mStats.size(); i++)
        {
            JsonObject x = this.mStats.get(i);
            if(x.get("stat") instanceof JsonObject)
            {
                if(String.valueOf(((JsonObject) x.get("stat")).get("name")).equals("\"special-attack\""))
                {
                    this.spa = String.valueOf(x.get("base_stat"));
                }

            }
        }
        return spa;
    }
    public String getHp() {
        for(int i=0; i< this.mStats.size(); i++)
        {
            JsonObject x = this.mStats.get(i);
            if(x.get("stat") instanceof JsonObject)
            {
                if(String.valueOf(((JsonObject) x.get("stat")).get("name")).equals("\"hp\""))
                {
                    this.hp = String.valueOf(x.get("base_stat"));
                }

            }
        }
        return hp;
    }
    public String getSpd() {
        for(int i=0; i< this.mStats.size(); i++)
        {
            JsonObject x = this.mStats.get(i);
            if(x.get("stat") instanceof JsonObject)
            {
                if(String.valueOf(((JsonObject) x.get("stat")).get("name")).equals("\"special-defense\""))
                {
                    this.spd = String.valueOf(x.get("base_stat"));
                }

            }
        }
        return spd;
    }
    public String getSpeed() {
        for(int i=0; i< this.mStats.size(); i++)
        {
            JsonObject x = this.mStats.get(i);
            if(x.get("stat") instanceof JsonObject)
            {
                if(String.valueOf(((JsonObject) x.get("stat")).get("name")).equals("\"speed\""))
                {
                    this.attack = String.valueOf(x.get("base_stat"));
                }

            }
        }
        return speed;
    }








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