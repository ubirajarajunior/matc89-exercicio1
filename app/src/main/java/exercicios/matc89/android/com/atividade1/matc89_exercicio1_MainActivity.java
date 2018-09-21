package exercicios.matc89.android.com.atividade1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class matc89_exercicio1_MainActivity extends AppCompatActivity {

    public Button botaoClique;
    public TextView textoDigitado;
    public EditText textoMudado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matc89_exercicio1_main);

        botaoClique = findViewById(R.id.btnCumprimentar);
        textoDigitado = findViewById(R.id.labelMensagem);
        textoMudado = findViewById(R.id.editNome);

        //textoDigitado.setText("");

        botaoClique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoQueDigiteiNaCaixa = textoMudado.getText().toString();

                    textoDigitado.setText("Alô, X");
            }
        });
    }
}
