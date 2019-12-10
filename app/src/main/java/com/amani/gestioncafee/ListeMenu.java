package com.amani.gestioncafee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;


public class ListeMenu extends AppCompatActivity {

    private RecyclerView recyclerViewMenu;
    private RecyclerView.LayoutManager layoutManager;
    private MenuAdapter menuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_menu);


        List<Menu> listeMenus = new ArrayList<>();
        Menu m=new Menu("Caffee Turk","2500",R.drawable.aa);
        listeMenus.add(m);
        m=new Menu("Cafffe Direct","1500",R.drawable.a);
        listeMenus.add(m);
        // On récupère notre RecyclerView via son id
        recyclerViewMenu = findViewById(R.id.menu_recyclerview);

        // On veut un RecyclerView qui utilise un LinearLayoutManager
        layoutManager = new LinearLayoutManager(this);
        recyclerViewMenu.setLayoutManager(layoutManager);

        // On donne notre adapter à notre RecyclerView
        menuAdapter = new MenuAdapter(listeMenus);
        recyclerViewMenu.setAdapter(menuAdapter);

        // On sépare chaque ligne de notre liste par un trait
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerViewMenu.getContext(), DividerItemDecoration.VERTICAL);
        recyclerViewMenu.addItemDecoration(dividerItemDecoration);
    }
}