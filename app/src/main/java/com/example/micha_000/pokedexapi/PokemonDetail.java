package com.example.micha_000.pokedexapi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import org.w3c.dom.Text;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PokemonDetail extends AppCompatActivity {

    TextView titleTextView;
    TextView weightTextView;
    TextView heightTextView;
    TextView attackTextView;
    TextView defenseTextView;
    TextView hpTextView;
    TextView spaTextView;
    TextView spdTextView;
    TextView speedTextView;
    ImageView Test;
    ImageView pic;
    RecyclerView.ViewHolder holder;
    Context context;



    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_detail);

        titleTextView =(TextView) findViewById(R.id.pokemon_title);
        weightTextView= (TextView) findViewById(R.id.pokemon_weight);
        heightTextView= (TextView) findViewById(R.id.pokemon_height);
        attackTextView=  (TextView) findViewById(R.id.pokemon_attack);
        defenseTextView= (TextView) findViewById(R.id.pokemon_defense);
        hpTextView= (TextView) findViewById(R.id.pokemon_hp);
        spaTextView= (TextView) findViewById(R.id.pokemon_spattack);
        spdTextView= (TextView) findViewById(R.id.pokemon_spdefense);
        speedTextView= (TextView) findViewById(R.id.pokemon_speed);
        pic = findViewById(R.id.pokemon_pic);


        String name =  getIntent().getStringExtra(PokedexAPIActivity.NEW_POKEMON);
        System.out.println(name);
        GetPokemonDataService service = PokemonService.getRetrofitInstance().create(GetPokemonDataService.class);

        Call<Pokemon> call = service.getPokemon(name);

        call.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                // All set up should be done here to display the data
                Pokemon pokemon = response.body();
                System.out.println(pokemon.name);
                titleTextView.setText(pokemon.name);
                weightTextView.setText(pokemon.weight);
                heightTextView.setText(pokemon.height);
                hpTextView.setText("Hp: "+ pokemon.getHp());
                attackTextView.setText("Attack: "+ pokemon.getAttack());
                defenseTextView.setText("Defense: "+ pokemon.getDefense());
                spaTextView.setText("Special Attack: "+ pokemon.getSpecialAttack());
                spdTextView.setText("Special Defense: "+ pokemon.getSpd());
                speedTextView.setText("Speed: "+ pokemon.getSpeed());

                Glide.with(context).load("http://pokeapi.co/media/sprites/pokemon/" + pokemon.number + ".png").into(Test);
                //used glide to load the url with the pokemon number then placed the image into test.
                Drawable place = Test.getDrawable(); // used test to get the image view and then placed it in place
                pic.setImageDrawable(place);
             



            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {
                // Handle Error Output Here.
                Log.e("error", "It did not work");
            }
        });
    }








}
