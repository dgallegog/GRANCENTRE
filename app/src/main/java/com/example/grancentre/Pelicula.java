package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Pelicula extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicula);





        AppCompatButton boton = (AppCompatButton)findViewById(R.id.guardianesInfo);
        boton.setOnClickListener(this);
        boton = findViewById(R.id.starWarsinfo);
        boton.setOnClickListener(this);
        boton = findViewById(R.id.starteckInfo);
        boton.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {

        Bundle sac = new Bundle();
        Intent a = new Intent(getApplicationContext(), infopelis.class);
        if(view == findViewById(R.id.guardianesInfo))sac.putString("tipoPeli","GuardianesGalaxia");
        else if(view == findViewById(R.id.starWarsinfo))sac.putString("tipoPeli","starWarsinfo");
        else sac.putString("tipoPeli","starTreckinfo");

        a.putExtras(sac);
        startActivity(a);
    }
}