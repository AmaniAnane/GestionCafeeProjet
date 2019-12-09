package com.amani.gestioncafee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

                Intent intent= new Intent(accueil.this,listMenu.class);
                startActivity(intent);


            }
        });
    }

}
