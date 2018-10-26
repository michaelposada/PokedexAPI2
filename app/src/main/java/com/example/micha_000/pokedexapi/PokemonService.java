package com.example.micha_000.pokedexapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokemonService {
    public static Retrofit retrofit;
    public static final String BASE_URL = "https://pokeapi.co/";


    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl("https://pokeapi.co/").addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
