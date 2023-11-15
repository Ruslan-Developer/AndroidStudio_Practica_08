package com.example.proyecto08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText password;

    private Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.user);
        password = findViewById(R.id.password);
        bt1 = findViewById(R.id.bt1);


    }

    public void verificar(View view){
        String datos = password.getText().toString();

        if(datos.isEmpty() || datos.length() < 4){
            Toast.makeText(this, "Clave incorrecta", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "Clave correcta", Toast.LENGTH_SHORT).show();
        }
    }



}