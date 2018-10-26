package com.example.micha_000.pokedexapi;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pokemon {

    @SerializedName("sprites")
    private JsonObject sprites;
    @SerializedName("name")
    public String names;
    @SerializedName("weight")
    public String weights;
    @SerializedName("height")
    public String heights;
    @SerializedName("id")
    public String number;
    @SerializedName("image")
    public String image;
    @SerializedName("stats")
    private List<JsonObject> mStats;
    @SerializedName("attack")
    public String attacks;
    @SerializedName("defense")
    public String defenses;
    @SerializedName("hp")
    public String hps;
    @SerializedName("special-attack")
    public String spas;
    @SerializedName("special-defense")
    public String spds;
    @SerializedName("speed")
    public String speeds;

    public String getAttack() {
        for (int i = 0; i < this.mStats.size(); i++) {
            JsonObject x = this.mStats.get(i);
            if (x.get("stat") instanceof JsonObject) {
                if (String.valueOf(((JsonObject) x.get("stat")).get("name")).equals("\"attack\"")) {
                    this.attacks = String.valueOf(x.get("base_stat"));
                }

            }
        }
        return attacks;
    }

    public String getDefense() {
        for (int i = 0; i < this.mStats.size(); i++) {
            JsonObject x = this.mStats.get(i);
            if (x.get("stat") instanceof JsonObject) {
                if (String.valueOf(((JsonObject) x.get("stat")).get("name")).equals("\"defense\"")) {
                    this.defenses = String.valueOf(x.get("base_stat"));
                }

            }
        }
        return defenses;
    }

    public String getSpecialAttack() {
        for (int i = 0; i < this.mStats.size(); i++) {
            JsonObject x = this.mStats.get(i);
            if (x.get("stat") instanceof JsonObject) {
                if (String.valueOf(((JsonObject) x.get("stat")).get("name")).equals("\"special-attack\"")) {
                    this.spas = String.valueOf(x.get("base_stat"));
                }

            }
        }
        return spas;
    }

    public String getHp() {
        for (int i = 0; i < this.mStats.size(); i++) {
            JsonObject x = this.mStats.get(i);
            if (x.get("stat") instanceof JsonObject) {
                if (String.valueOf(((JsonObject) x.get("stat")).get("name")).equals("\"hp\"")) {
                    this.hps = String.valueOf(x.get("base_stat"));
                }

            }
        }
        return hps;
    }

    public String getSpd() {
        for (int i = 0; i < this.mStats.size(); i++) {
            JsonObject x = this.mStats.get(i);
            if (x.get("stat") instanceof JsonObject) {
                if (String.valueOf(((JsonObject) x.get("stat")).get("name")).equals("\"special-defense\"")) {
                    this.spds = String.valueOf(x.get("base_stat"));
                }

            }
        }
        return spds;
    }

    public String getSpeed() {
        for (int i = 0; i < this.mStats.size(); i++) {
            JsonObject x = this.mStats.get(i);
            if (x.get("stat") instanceof JsonObject) {
                if (String.valueOf(((JsonObject) x.get("stat")).get("name")).equals("\"speed\"")) {
                    this.speeds = String.valueOf(x.get("base_stat"));
                }

            }
        }
        return speeds;
    }


    public void setID(String mID) {
        this.number = mID;
    }


    public void setAttack(String mAttack) {
        this.attacks = mAttack;
    }


    public void setDefense(String mDefense) {
        this.defenses = mDefense;
    }

    public void setHeight(String mHeight) {
        this.heights = mHeight;
    }

    public void setHP(String mHP) {
        this.hps = mHP;
    }

    public void setName(String mName) {
        this.names = mName;
    }

    public void setSPA(String mSPA) {
        this.spas = mSPA;
    }

    public void setSPD(String mSPD) {
        this.spds = mSPD;
    }

    public void setSpeed(String mSpeed) {
        this.speeds = mSpeed;
    }

    public void setWeight(String mWeight) {
        this.weights = mWeight;
    }

    public String getName() {
        return names;
    }

    public String getHeight() {
        return heights;
    }



    public String getWeight() {
        return weights;
    }

    public String getNumber() {
        return number;
    }


    public String getSprite() {
        this.image = this.sprites.get("front_default").getAsString();
        return this.image;
    }
    }
