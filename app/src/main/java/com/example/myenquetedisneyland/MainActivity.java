package com.example.myenquetedisneyland;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btInscritpion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //faire le lien entre objet prog et graphique
        this.btInscritpion = findViewById(R.id.idInscription);
        //rendre les boutons ecoutables
        this.btInscritpion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.idInscription){
            Intent unIntent = new Intent(this, Inscription.class);
            this.startActivity(unIntent);
        }
    }
}