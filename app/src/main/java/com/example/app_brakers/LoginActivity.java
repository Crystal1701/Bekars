package com.example.app_brakers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        Button boton = (Button)findViewById(R.id.btningresar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  usuario = ((EditText)findViewById(R.id.txtusuario)).getText().toString();
                String password = ((EditText)findViewById(R.id.txtpassword)).getText().toString();
                if (usuario.equals("piero") && password.equals("alvarez"))
                {
                    Intent nuevapagina = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(nuevapagina);
                }else
                {
                    Toast.makeText(getApplicationContext(),"Usuario incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
