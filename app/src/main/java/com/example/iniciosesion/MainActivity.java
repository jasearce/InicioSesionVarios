package com.example.iniciosesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnUsuario, btnGuardia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUsuario = findViewById(R.id.btnUser);
        btnGuardia = findViewById(R.id.btnGuardia);
    }

    public void onClick(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.btnUser:
                intent = new Intent(MainActivity.this, LoginUserActivity.class);
                intent.putExtra("tipo de cuenta", "Usuario");
                startActivity(intent);
                finish();
                break;
            case R.id.btnGuardia:
                intent = new Intent(MainActivity.this, LoginGuardiaActivity.class);
                intent.putExtra("tipo de cuenta", "Guardia");
                startActivity(intent);
                finish();
                break;
        }
    }
}
