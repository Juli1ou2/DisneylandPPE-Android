package com.example.myenquetedisneyland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Page1 extends AppCompatActivity implements View.OnClickListener{

    private RadioGroup rgAffluence, rgDiversite ;
    private Button btSuivant ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        this.rgAffluence = findViewById(R.id.idAffluence);
        this.rgDiversite = findViewById(R.id.idDiversite);
        this.btSuivant = findViewById(R.id.idSuivant);

        this.btSuivant.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.idSuivant){
            Intent unIntent = new Intent(this, Page2.class);
            this.startActivity(unIntent);
        }
    }
}