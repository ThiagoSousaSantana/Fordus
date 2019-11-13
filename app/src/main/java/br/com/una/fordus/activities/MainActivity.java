package br.com.una.fordus.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.una.fordus.R;
import br.com.una.fordus.models.Cliente;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private EditText cpf;
    private EditText telefone;
    private EditText email;
    private Button btnAvancar;
    private Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editNome);
        cpf = findViewById(R.id.editCpf);
        telefone = findViewById(R.id.editTel);
        email = findViewById(R.id.editEmail);
        btnAvancar = findViewById(R.id.btn_avançar);

        btnAvancar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



                String nomeDeVerdade = null;
                Integer cpfDeVerdade = null;
                Integer telefoneDeVerdade = null;
                String emailDeVerdade = null;

                if (nome.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Por favor insira um Nome " , Toast.LENGTH_SHORT).show();
                }else {
                    nomeDeVerdade = nome.getText().toString();
                }

                if (cpf.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Por favor insira um CPF " , Toast.LENGTH_SHORT).show();
                }else {
                    cpfDeVerdade = Integer.valueOf(cpf.getText().toString());
                }

                if (telefone.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Por favor insira um Telefone " , Toast.LENGTH_SHORT).show();
                }else {
                    telefoneDeVerdade = Integer.valueOf(telefone.getText().toString());
                }

                if (email.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Por favor insira um Email " , Toast.LENGTH_SHORT).show();
                }else {
                    emailDeVerdade = email.getText().toString();
                }

                if (nomeDeVerdade != null && cpfDeVerdade != null && telefoneDeVerdade != null && emailDeVerdade != null){

                    cliente = new Cliente(
                            nomeDeVerdade,
                            cpfDeVerdade,
                            telefoneDeVerdade,
                            emailDeVerdade);

                    vaiPraComponents();

                    Toast.makeText(getApplicationContext(),"Bem Vindo " + nome.getText(), Toast.LENGTH_SHORT).show();

                }


            }
        });

    }

    private void vaiPraComponents(){
        Intent intent = new Intent(this, ComponentesActivity.class);
        intent.putExtra("cliente", this.cliente);
        startActivity(intent);
    }
}
