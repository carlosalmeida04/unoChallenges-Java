package com.example.desafios_uno;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = { "PUT YOUR CHALANGES HERE"
    };

    TextView tv_frase;
    Button bt_gerar;
    boolean vf = false;
    Random rndlength = new Random();
    int INT_rndlength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_gerar = findViewById(R.id.bt_gerar);
        tv_frase = findViewById(R.id.tv_frase);

        bt_gerar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!vf){
                    for(int i = 0; i < frases.length; i++){
                        INT_rndlength = rndlength.nextInt(frases.length);
                        tv_frase.setText(frases[INT_rndlength]);
                    }
                    for(int i = 0; i < frases.length; i++){
                        for(int j = i + 1; j < frases.length; j++){
                            if(frases[i].equals(frases[j])){
                                INT_rndlength = rndlength.nextInt(frases.length);
                            }else{
                                INT_rndlength = rndlength.nextInt(frases.length);
                            }
                        }
                    }
                    vf = true;
                }else{
                    tv_frase.setText("");
                    vf = false;
                }
            }
        });
    }
}