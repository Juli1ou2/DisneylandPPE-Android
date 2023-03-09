package com.example.myenquetedisneyland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Page2 extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup rgEntretien, rgAttente ;
    private Button btSuivant ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        this.rgEntretien = findViewById(R.id.idEntretien);
        this.rgAttente = findViewById(R.id.idAttente);
        this.btSuivant = findViewById(R.id.idSuivant2);

        this.btSuivant.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.idSuivant2){
            Intent unIntent = new Intent(this, Page3.class);
            this.startActivity(unIntent);
        }
    }
}