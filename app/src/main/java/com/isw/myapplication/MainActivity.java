package com.isw.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.id_boton);
        boton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "Estamos en release 2", Toast.LENGTH_SHORT).show();
    }
}
