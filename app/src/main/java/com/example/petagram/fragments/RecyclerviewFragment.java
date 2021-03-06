package com.example.petagram.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petagram.R;
import com.example.petagram.adapters.PetAdapter;
import com.example.petagram.pojo.Pet;

import java.util.ArrayList;


public class RecyclerviewFragment extends Fragment {

    private RecyclerView recyclerView;
    ArrayList<Pet> pets;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // asociamos el fragment a un layout:
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);


        recyclerView = (RecyclerView) v.findViewById(R.id.pet_recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(llm);

        initPetList();
        initAdapter();

        return v;
    }

    public void initAdapter() {
        PetAdapter adapter = new PetAdapter(pets, getActivity());
        recyclerView.setAdapter(adapter);
    }

    public void initPetList() {
        pets = new ArrayList<Pet>();
        pets.add(new Pet("Kitty", "3", R.drawable.icons8_cat_head_96));
        pets.add(new Pet("Doggy", "1", R.drawable.icons8_pug_96));
        pets.add(new Pet("Pandy", "2", R.drawable.icons8_red_panda_96));
        pets.add(new Pet("Parrot", "2", R.drawable.icons8_parrot_96));
        pets.add(new Pet("Nemo", "4", R.drawable.icons8_fish_96));
        pets.add(new Pet("Fox", "1", R.drawable.icons8_fox_96));

    }
}
