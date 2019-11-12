package br.com.una.fordus.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.R.layout;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import br.com.una.fordus.R;
import br.com.una.fordus.models.Direcao;
import br.com.una.fordus.models.Motor;
import br.com.una.fordus.models.Suspencao;

public class ComponentesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componentes);

        List<Motor> motores = Arrays.asList(
                new Motor("Motor 1.0", BigDecimal.valueOf(25000.00), 80),
                new Motor("Motor 1.6", BigDecimal.valueOf(30000.00), 120),
                new Motor("Motor 2.0", BigDecimal.valueOf(35000.00), 150),
                new Motor("Motor 2.0 Turbo", BigDecimal.valueOf(40000.00), 190)
        );

        List<Suspencao> suspencaos = Arrays.asList(
                new Suspencao("Eixo rigido", BigDecimal.valueOf(10000.00), "Baixa"),
                new Suspencao("Independente", BigDecimal.valueOf(15000.00), "Media"),
                new Suspencao("MacPherson / Multilink", BigDecimal.valueOf(20000.00), "Alta")
        );

        List<Direcao> direcoes = Arrays.asList(
                new Direcao("Eletrica", BigDecimal.valueOf(5000), "Media"),
                new Direcao("Hidraulica / Eletrohidraulica", BigDecimal.valueOf(10000), "Baixa")
        );



        Spinner spinnerMotores = findViewById(R.id.spMotores);
        spinnerMotores.setAdapter(new ArrayAdapter<>(this, layout.simple_spinner_dropdown_item, motores));

        Spinner spinnerSuspencoes = findViewById(R.id.spSuspencoes);
        spinnerSuspencoes.setAdapter(new ArrayAdapter<>(this, layout.simple_spinner_dropdown_item, suspencaos));

        Spinner spinnerDirecoes = findViewById(R.id.spDirecoes);
        spinnerDirecoes.setAdapter(new ArrayAdapter<>(this, layout.simple_spinner_dropdown_item, direcoes));

    }
}
