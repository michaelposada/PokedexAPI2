package com.example.micha_000.pokedexapi;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PokemonDetail extends AppCompatActivity {

    TextView idTextView;
    TextView titleTextView;
    TextView weightTextView;
    TextView heightTextView;
    TextView attackTextView;
    TextView defenseTextView;
    TextView hpTextView;
    TextView spaTextView;
    TextView spdTextView;
    TextView speedTextView;
    ImageView pic;
    Context context;



    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_detail);

        idTextView = findViewById(R.id.pokemon_id);
        titleTextView =(TextView) findViewById(R.id.pokemon_name);
        weightTextView= (TextView) findViewById(R.id.pokemon_weight);
        heightTextView= (TextView) findViewById(R.id.pokemon_height);
        attackTextView=  (TextView) findViewById(R.id.pokemon_attack);
        defenseTextView= (TextView) findViewById(R.id.pokemon_defense);
        hpTextView= (TextView) findViewById(R.id.pokemon_hp);
        spaTextView= (TextView) findViewById(R.id.pokemon_spa);
        spdTextView= (TextView) findViewById(R.id.pokemon_spd);
        speedTextView= (TextView) findViewById(R.id.pokemon_speed);
        pic = findViewById(R.id.pokemon_pic);




        String pokemon = (String)getIntent().getStringExtra(PokedexAPIActivity.NEW_POKEMON);

        GetPokemonDataService pokemonDataService = (GetPokemonDataService) PokemonService.getRetrofitInstance().create(GetPokemonDataService.class);
        Call<Pokemon> call = pokemonDataService.getPokemon(pokemon);
        call.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                // All set up should be done here to display the data
                Pokemon pokemon = response.body();
                idTextView.setText("# "+ response.body().getNumber());
                titleTextView.setText("Name: " + response.body().getName());
                weightTextView.setText("Weight: "+ response.body().getWeight());
                heightTextView.setText("Height: " +response.body().getHeight());
                hpTextView.setText("Hp: "+  response.body().getHp());
                attackTextView.setText("Attack: " +response.body().getAttack());
                defenseTextView.setText("Defense: " +response.body().getDefense());
                spaTextView.setText("Special Attack: " +response.body().getSpecialAttack());
                spdTextView.setText("Special Defense: " +response.body().getSpd());
                speedTextView.setText("Speed: " +response.body().getSpeed());

                Picasso.get().load(response.body().getSprite()).into(pic);



            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {
                // Handle Error Output Here.
                titleTextView.setText(t.getMessage());
            }
        });
    }








}
