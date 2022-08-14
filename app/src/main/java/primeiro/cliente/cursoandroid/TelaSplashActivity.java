package primeiro.cliente.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class TelaSplashActivity extends AppCompatActivity {

    String TAG = "Primeiro Cliente";

    int tempoDeEspera = 1000 * 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);

        Log.d(TAG, "onCreate: Tela Splash carregando...");

        trocarTela();

    }

    private void trocarTela() {

        Log.d(TAG, "trocarTela: Trocando de tela...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Log.d(TAG, "Esperando um tempo...");

                //'intenção de trocar de tela'           tela que estou agora      |      tela que quero ir
                Intent trocarDeTela = new Intent(TelaSplashActivity.this, MainActivity.class);
                startActivity(trocarDeTela);  //inicia a intenção
                finish(); //fecha a tela
            }
        }, tempoDeEspera);

    }

}