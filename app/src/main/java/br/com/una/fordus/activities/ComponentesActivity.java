package br.com.una.fordus.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.R.layout;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import br.com.una.fordus.R;
import br.com.una.fordus.models.Cliente;
import br.com.una.fordus.models.Direcao;
import br.com.una.fordus.models.Motor;
import br.com.una.fordus.models.Orcamento;
import br.com.una.fordus.models.Suspencao;

public class ComponentesActivity extends AppCompatActivity {


    private Motor motorSelecionado = null;
    private Suspencao suspencaoSelecionado = null;
    private Direcao direcaoSelecionado = null;
    private Cliente cliente= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componentes);

        Intent intent = getIntent();
        cliente = (Cliente) intent.getSerializableExtra("cliente");

        final List<Motor> motores = Arrays.asList(
                new Motor("Motor 1.0", BigDecimal.valueOf(25000), 80),
                new Motor("Motor 1.6", BigDecimal.valueOf(30000), 120),
                new Motor("Motor 2.0", BigDecimal.valueOf(35000), 150),
                new Motor("Motor 2.0 Turbo", BigDecimal.valueOf(40000), 190)
        );

        final List<Suspencao> suspencaos = Arrays.asList(
                new Suspencao("Eixo rigido", BigDecimal.valueOf(10000), "Baixa"),
                new Suspencao("Independente", BigDecimal.valueOf(15000), "Media"),
                new Suspencao("MacPherson / Multilink", BigDecimal.valueOf(20000), "Alta")
        );

        final List<Direcao> direcoes = Arrays.asList(
                new Direcao("Eletrica", BigDecimal.valueOf(5000), "Media"),
                new Direcao("Hidraulica / Eletrohidraulica", BigDecimal.valueOf(10000), "Baixa")
        );



        Spinner spinnerMotores = findViewById(R.id.spMotores);
        spinnerMotores.setAdapter(new ArrayAdapter<>(this, layout.simple_spinner_dropdown_item, motores));

        final EditText editTextMotor = findViewById(R.id.edtMotor);

        spinnerMotores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                motorSelecionado = motores.get(position);
                editTextMotor.setText(motorSelecionado.getPrecoFormatado());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                motorSelecionado = null;
            }
        });


        Spinner spinnerSuspencoes = findViewById(R.id.spSuspencoes);
        spinnerSuspencoes.setAdapter(new ArrayAdapter<>(this, layout.simple_spinner_dropdown_item, suspencaos));

        final EditText editTextSuspencao = findViewById(R.id.edtSuspencoes);

        spinnerSuspencoes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                suspencaoSelecionado = suspencaos.get(position);
                editTextSuspencao.setText(suspencaoSelecionado.getPrecoFormatado());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                suspencaoSelecionado = null;
            }
        });

        Spinner spinnerDirecoes = findViewById(R.id.spDirecoes);
        spinnerDirecoes.setAdapter(new ArrayAdapter<>(this, layout.simple_spinner_dropdown_item, direcoes));

        final EditText editTextDirecao = findViewById(R.id.edtDirecoes);

        spinnerDirecoes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                direcaoSelecionado = direcoes.get(position);
                editTextDirecao.setText(direcaoSelecionado.getPrecoFormatado());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                direcaoSelecionado = null;
            }
        });


        Button btn = findViewById(R.id.btn_avançarComponentes);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaiPraOrders();
            }
        });
    }

    private void vaiPraOrders(){
        Intent intent = new Intent(this, OrderActivity.class);

        Orcamento orcamento = new Orcamento(
                cliente,
                motorSelecionado,
                direcaoSelecionado,
                suspencaoSelecionado
        );

        intent.putExtra("orcamento", orcamento);
        startActivity(intent);
    }
}
