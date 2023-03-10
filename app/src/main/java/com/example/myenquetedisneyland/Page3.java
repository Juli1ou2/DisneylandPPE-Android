package com.example.myenquetedisneyland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Page3 extends AppCompatActivity implements View.OnClickListener{

    private Button btSuivant ;
    private CheckBox cbRestau, cbRestau2, cbRestau3, cbRestau4, cbRestau5, cbRestau6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        this.cbRestau = findViewById(R.id.idRestau1);
        this.cbRestau2 = findViewById(R.id.idRestau2);
        this.cbRestau3 = findViewById(R.id.idRestau3);
        this.cbRestau4 = findViewById(R.id.idRestau4);
        this.cbRestau5 = findViewById(R.id.idRestau5);
        this.cbRestau6 = findViewById(R.id.idRestau6);
        this.btSuivant = findViewById(R.id.idFin);

        this.btSuivant.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.idFin){
            Intent unIntent = new Intent(this, Page4.class);
            this.startActivity(unIntent);
        }
    }
}