package com.example.myenquetedisneyland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Toast;

public class Page4 extends AppCompatActivity implements View.OnClickListener {
    private Button btFin ;
   RatingBar rbMickey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        this.btFin = findViewById(R.id.idFin);
        rbMickey=(RatingBar)findViewById(R.id.idNote);

        rbMickey.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(),Float.toString(rating),Toast.LENGTH_LONG).show();

            }

        });

        this.btFin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()== R.id.idFin){
            Toast.makeText(this, "Merci d'avoir accépter de répondre", Toast.LENGTH_SHORT).show();
            Intent unIntent = new Intent(this, MainActivity.class);
            this.startActivity(unIntent);
        }
    }
}