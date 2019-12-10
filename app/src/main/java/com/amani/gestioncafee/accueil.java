package com.amani.gestioncafee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class accueil extends AppCompatActivity {
    private Button cofee;
    private Button BREAKFAST;
    private Button DRINKS;
    private  Button DESERT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);


        cofee=findViewById(R.id.COFFEE);
        cofee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(accueil.this,ListeMenu.class);
                intent.putExtra("mess", "COFFEE");
                startActivity(intent);




            }
        });

        BREAKFAST=findViewById(R.id.BREAKFAST);
        BREAKFAST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(accueil.this,ListeMenu.class);
                intent.putExtra("mess", "BREAKFAST");
                startActivity(intent);




            }
        });
        DRINKS=findViewById(R.id.DRINKS);
        DRINKS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(accueil.this,ListeMenu.class);
                intent.putExtra("mess", "DRINKS");
                startActivity(intent);




            }
        });
        DESERT=findViewById(R.id.DESERT);
        DESERT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(accueil.this,ListeMenu.class);
                intent.putExtra("mess", "DESERT");
                startActivity(intent);




            }
        });

    }

}
