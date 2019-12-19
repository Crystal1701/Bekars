package com.example.app_brakers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProducts = (Button) findViewById(R.id.btnEnter);
        btnAboutsUs =(Button) findViewById(R.id.btnAboutUs);
        btnAboutsUs.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Log.i(Settings.INFO,"About us");
                Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });
        btnProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i(Settings.INFO,"Products");
                Intent i = new Intent(MainActivity.this, ProductListActivity.class);
                startActivity(i);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this,
                "Aplicación Iniciada",
                Toast.LENGTH_SHORT).show();
    }

    @Override protected void onStop(){
        super.onStop();

        Toast.makeText(this,
                "Aplicacion Finalizada",
                Toast.LENGTH_SHORT).show();
    }

    private Button btnProducts;
    private Button btnAboutsUs;



}
