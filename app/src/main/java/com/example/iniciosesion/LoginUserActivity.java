package com.example.iniciosesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginUserActivity extends AppCompatActivity {

    public TextView texto;
    public Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        recibirDatos();

        btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginUserActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    private void recibirDatos(){

        String tipoCuenta = getIntent().getStringExtra("tipo de cuenta");
        /*
        Bundle extras = getIntent().getExtras();
        String tipoCuenta = extras.getString("tipo de cuenta");
        */
        texto = findViewById(R.id.txtUser);
        String mensaje = "Tipo de cuenta: " + tipoCuenta;
        texto.setText(mensaje);
    }

}
