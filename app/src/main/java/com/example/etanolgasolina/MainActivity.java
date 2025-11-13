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

    private TextView txtResultado;
    private EditText edtGasolina;
    private EditText edtEtanol;
    private Button btnCalcular;
    private Button btnLimpar;

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

        btnCalcular.setOnClickListener(v -> {
            String valorGasolina = edtGasolina.getText().toString().trim();
            String valorEtanol = edtEtanol.getText().toString().trim();

            if (!valorGasolina.isEmpty() && !valorEtanol.isEmpty()) {
                try {
                    double precoGasolina = Double.parseDouble(valorGasolina);
                    double precoEtanol = Double.parseDouble(valorEtanol);
                    double resultado = precoEtanol / precoGasolina;

                    if (resultado < 0.7) {
                        txtResultado.setText("Melhor usar: Etanol!");
                    } else {
                        txtResultado.setText("Melhor usar: Gasolina!");
                    }
                } catch (NumberFormatException e) {
                    txtResultado.setText("Digite apenas números válidos.");
                }
            } else {
                txtResultado.setText("Preencha ambos os campos!");
            }
        });

        btnLimpar.setOnClickListener(v -> {
            txtResultado.setText("Melhor abastecer com:");
            edtGasolina.setText("");
            edtEtanol.setText("");
            edtGasolina.requestFocus();
        });
    }
}
