package com.isw.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    Button boton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.id_boton_1);
        Button boton2 = (Button) findViewById(R.id.id_boton_2);
    }

    public void onClick1(View view) {
        Toast.makeText(getApplicationContext(), "Estamos en release 2", Toast.LENGTH_SHORT).show();
    }

    public void onClick2(View view) {
        Toast.makeText(getApplicationContext(), "No debería mostrarse este mensaje", Toast.LENGTH_SHORT).show();
    }
}
