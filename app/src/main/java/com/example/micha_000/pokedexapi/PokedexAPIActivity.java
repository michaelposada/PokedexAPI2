package com.example.micha_000.pokedexapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import android.support.v7.widget.LinearLayoutManager;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

public class PokedexAPIActivity extends AppCompatActivity {


    private List<String> newList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    public static final String NEW_POKEMON = "com.example.micha_000.pokedexapi.NEW_POKEMON";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex_api);

        mRecyclerView = findViewById(R.id.pokedex_reyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(PokedexAPIActivity.this));

        newList.add("bulbasaur");
        newList.add("pikachu");
        newList.add("charmander");
        newList.add("squirtle");
        newList.add("raichu");
        newList.add("eevee");
        newList.add("pichu");
        newList.add("charizard");
        newList.add("ditto");
        newList.add("vulpix");
        PokemonAdapter pokes = new PokemonAdapter(newList);
        mRecyclerView.setAdapter(pokes);


    }



}
