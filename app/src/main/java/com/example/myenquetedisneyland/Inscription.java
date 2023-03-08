package com.example.myenquetedisneyland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Inscription extends AppCompatActivity implements View.OnClickListener{

        private EditText txtNom, txtPrenom, txtEmail;

        private Spinner spAge, spCommande;

        private Button btParticiper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        this.txtNom = findViewById(R.id.idNom);
        this.txtPrenom = findViewById(R.id.idPrenom);
        this.txtEmail = findViewById(R.id.idEmail);
        this.spAge = findViewById(R.id.idAge);
        this.spCommande = findViewById(R.id.idCommande);
        this.btParticiper = findViewById(R.id.idParticiper);

        this.btParticiper.setOnClickListener(this);

        //remplissage des spinners
        ArrayList<String> lesAges = new ArrayList<>();
        lesAges.add("18-21 ans");
        lesAges.add("22-29 ans");
        lesAges.add("30-40 ans");
        lesAges.add("41-55 ans");
        lesAges.add("56-65 ans");
        lesAges.add("Plus de 65 ans");
        //création de l'adapter qui permet de structurer l'affichage dans le spinner
        ArrayAdapter unAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, lesAges);
        this.spAge.setAdapter(unAdapter);

        ArrayList<String> lesCommandes = new ArrayList<>();
        lesCommandes.add("0");
        lesCommandes.add("1");
        lesCommandes.add("2");
        lesCommandes.add("3");
        lesCommandes.add("4");
        lesCommandes.add("5");
        lesCommandes.add("Plus que 5");
        //création de l'adapter qui permet de structurer l'affichage dans le spinner
        ArrayAdapter unAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, lesCommandes);
        this.spCommande.setAdapter(unAdapter2);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.idParticiper) {
            Intent unIntent = new Intent(this, Page1.class);
            this.startActivity(unIntent);
        }
    }
}