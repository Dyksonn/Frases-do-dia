package com.example.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {
        String[] frases = {
          "frase 1",
          "frase 2",
          "frase 3",
          "frase 4",
                "frase 5",
                "frase 6",
                "frase 7",
                "frase 8"
        };
        int numarray = frases.length;
        int numero = new Random().nextInt( numarray );

        TextView texto = findViewById(R.id.txtResultado);
        texto.setText( frases[numero] );
    }
}