package com.example.grancentre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.fragment.app.FragmentManager;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;


public class bussinesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bussines);
        FragmentManager fm = getSupportFragmentManager();

        initUI();
        AppCompatAutoCompleteTextView e = findViewById(R.id.negociTextView);
        e.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if(e.getText().toString().equals("Perruqueries"))
                {


                    Peluquerias fragment1 = new Peluquerias();
                    fm.beginTransaction().replace(R.id.miFragment, fragment1).commit();

                }else if (e.getText().toString().equals("Tallers"))
                {
                    Tallers fragment1 = new Tallers();
                    fm.beginTransaction().replace(R.id.miFragment, fragment1).commit();

                }else if (e.getText().toString().equals("Botigues"))
                {
                    Botigues fragment1 = new Botigues();
                    fm.beginTransaction().replace(R.id.miFragment, fragment1).commit();
                }

            }
        });
    }

    private void initUI()
    {
        //UI reference of textView
        final AutoCompleteTextView negociAuto = findViewById(R.id.negociTextView);

        // create list of customer
        ArrayList<String> negociList = getTipusnegoci();

        //Create adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(bussinesActivity.this, android.R.layout.simple_spinner_item, negociList);

        //Set adapter
        negociAuto.setAdapter(adapter);



    }
    private ArrayList<String> getTipusnegoci()
    {
        ArrayList<String> negocis = new ArrayList<>();
        negocis.add("Perruqueries");
        negocis.add(" ");
        negocis.add("Tallers");
        negocis.add(" ");
        negocis.add("Botigues");
        return negocis;
    }
}
