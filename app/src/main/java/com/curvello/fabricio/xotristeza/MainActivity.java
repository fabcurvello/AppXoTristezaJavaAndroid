package com.curvello.fabricio.xotristeza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView numero;
    ImageView smile;
    Button botao;

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smile = findViewById(R.id.imv_smile);
        numero = findViewById(R.id.tv_numero);
        botao = findViewById(R.id.id_botao);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador ++;
                Log.d("TESTE CONTADOR", "onClick: CLICOU " + contador);
                numero.setText(String.valueOf(contador));

                switch (contador) {

                    case 10:
                        smile.setImageResource(R.drawable.smile02);
                        break;

                    case 20:
                        smile.setImageResource(R.drawable.smile03);
                        break;

                    case 30:
                        smile.setImageResource(R.drawable.smile04);
                        break;

                    case 40:
                        smile.setImageResource(R.drawable.smile05);
                        break;

                    case 50:
                        smile.setImageResource(R.drawable.smile06);
                        break;

                    case 60:
                        smile.setImageResource(R.drawable.smile07);
                        break;

                    case 70:
                        smile.setImageResource(R.drawable.smile08);
                        break;

                    case 80:
                        smile.setImageResource(R.drawable.smile09);
                        break;

                    case 90:
                        smile.setImageResource(R.drawable.smile10);
                        break;

                    case 100:
                        smile.setImageResource(R.drawable.smile11);
                        break;
                }

            }
        });
    }

    public void zerarTudo (View view) {
        contador = 0;
        numero.setText(String.valueOf(contador));
        smile.setImageResource(R.drawable.smile01);
    }
}
