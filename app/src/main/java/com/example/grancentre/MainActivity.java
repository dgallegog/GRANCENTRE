package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatButton boton = (AppCompatButton)findViewById(R.id.bussinesVer);
        boton.setOnClickListener(this);

        boton = (AppCompatButton)findViewById(R.id.pelisVer);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if(view.getId() == findViewById(R.id.bussinesVer).getId())
        {
            i = new Intent(getApplicationContext(), bussinesActivity.class);

        }else
        {
            i = new Intent(getApplicationContext(), Pelicula.class);
        }
        startActivity(i);
    }
}