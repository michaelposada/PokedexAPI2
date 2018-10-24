package com.example.micha_000.pokedexapi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonHolder>{


    private List<String> mPokemonList;

    public PokemonAdapter(List<String> pokemonList)
    {
        mPokemonList = pokemonList;
    }


    public PokemonHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View pokemonView = inflater.inflate(R.layout.pokemon_list, parent, false);
        PokemonHolder pokemonHolder = new PokemonHolder(pokemonView);

        return pokemonHolder;
    }

    public void onBindViewHolder(PokemonAdapter.PokemonHolder pokemonHolder, int position)
    {
        String pokemon = mPokemonList.get(position);

        TextView titleTextView = pokemonHolder.pokemonTitleTextView;
        titleTextView.setText(pokemon);
    }

    public int getItemCount()
    {
        return mPokemonList.size();
    }

    public class PokemonHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        public TextView pokemonTitleTextView;


        public PokemonHolder(View itemView)
        {
            super(itemView);
            pokemonTitleTextView = (TextView) itemView.findViewById(R.id.pokemon_name);
            itemView.setOnClickListener(this);
        }

        public void onClick(View v)
        {
            String pokemons = mPokemonList.get(getLayoutPosition());
            Intent intent = new Intent(itemView.getContext(), PokemonDetail.class);
            intent.putExtra(PokedexAPIActivity.NEW_POKEMON, pokemons);
            itemView.getContext().startActivity(intent);
        }
    }

}
