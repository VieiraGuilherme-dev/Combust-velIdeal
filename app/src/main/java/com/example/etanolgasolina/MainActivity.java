package com.example.etanolgasolina;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    EditText edtGasolina;
    EditText edtEtanol;
    Button btnCalcular;
    Button btnLimpar;

    double precoGasolina;
    double precoEtanol;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtResultado = findViewById(R.id.textResultado);
        edtGasolina = findViewById(R.id.edtGasolina);
        edtEtanol = findViewById(R.id.edtEtanol);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnLimpar = findViewById(R.id.btnLimpar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valorGasolina = edtGasolina.getText().toString();
                String valorEtanol = edtEtanol.getText().toString();

                if (!valorGasolina.isEmpty() && !valorEtanol.isEmpty()) {
                    precoGasolina = Double.parseDouble(valorGasolina);
                    precoEtanol = Double.parseDouble(valorEtanol);

                    resultado = precoEtanol / precoGasolina;

                    if (resultado < 0.7) {
                        txtResultado.setText("Melhor usar: Etanol!");
                    } else {
                        txtResultado.setText("Melhor usar: Gasolina!");
                    }
                } else {
                    txtResultado.setText("Preencha ambos os campos!");
                }
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText("Melhor abastecer com:");
                edtGasolina.setText("");
                edtEtanol.setText("");
            }
        });
    }
}
