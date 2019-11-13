package br.com.una.fordus.activities;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import br.com.una.fordus.R;

public class OrderActivity extends AppCompatActivity {

    private TextView titleClient;
    private TextView cliente;
    private TextView titleMotor;
    private TextView motor;
    private TextView titleSuspensao;
    private TextView suspensao;
    private TextView titleDirecao;
    private TextView direcao;
    private TextView titleValor;
    private TextView valor;
    private Button botao;
    private LottieAnimationView animation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        this.titleClient = findViewById(R.id.title_cliente);
        this.cliente = findViewById(R.id.cliente);
        this.titleMotor = findViewById(R.id.title_motor);
        this.motor = findViewById(R.id.motor);
        this.titleSuspensao = findViewById(R.id.title_suspensao);
        this.suspensao = findViewById(R.id.suspensao);
        this.titleDirecao = findViewById(R.id.title_direcao);
        this.direcao = findViewById(R.id.direcao);
        this.titleValor = findViewById(R.id.title_valor);
        this.valor = findViewById(R.id.valor);

        this.botao = findViewById(R.id.button);
        this.animation = findViewById(R.id.animation);
        animation.setVisibility(View.INVISIBLE);

        this.botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animations();
            }
        });
    }

    private void animations(){
        getSupportActionBar().hide();
        titleClient.setVisibility(View.INVISIBLE);
        cliente.setVisibility(View.INVISIBLE);
        titleMotor.setVisibility(View.INVISIBLE);
        motor.setVisibility(View.INVISIBLE);
        titleSuspensao.setVisibility(View.INVISIBLE);
        suspensao.setVisibility(View.INVISIBLE);
        titleDirecao.setVisibility(View.INVISIBLE);
        titleValor.setVisibility(View.INVISIBLE);
        valor.setVisibility(View.INVISIBLE);
        direcao.setVisibility(View.INVISIBLE);
        botao.setVisibility(View.INVISIBLE);

        animation.setVisibility(View.VISIBLE);
        animation.setAnimation("anim/confirm_punch.json");
        animation.playAnimation();
        animation.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                showFields();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
    }

    private void showFields(){
        animation.setVisibility(View.GONE);
        getSupportActionBar().show();
        titleClient.setVisibility(View.VISIBLE);
        cliente.setVisibility(View.VISIBLE);
        titleMotor.setVisibility(View.VISIBLE);
        motor.setVisibility(View.VISIBLE);
        titleSuspensao.setVisibility(View.VISIBLE);
        suspensao.setVisibility(View.VISIBLE);
        titleDirecao.setVisibility(View.VISIBLE);
        direcao.setVisibility(View.VISIBLE);
        titleValor.setVisibility(View.VISIBLE);
        valor.setVisibility(View.VISIBLE);
        botao.setVisibility(View.VISIBLE);
        botao.setText("Comprado");
        botao.setFocusable(false);
        botao.setClickable(false);
    }
}
