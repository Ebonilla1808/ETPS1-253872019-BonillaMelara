package sv.edu.ejercicio2guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtValor;
    TextView txvrResultado;
    Button btnCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor=findViewById(R.id.txvNumero);
        txvrResultado=findViewById(R.id.txvResultado);
        btnCalculo=findViewById(R.id.btnCalcular);
    }

    public void calculo (View v) {
        try {
            int numeroString = Integer.parseInt(edtValor.getText().toString());
            int numero = 0;

            numero = Integer.parseInt(String.valueOf(numeroString));

            if (numero > 999) {
                txvrResultado.setText("El número ingresado tiene más de 3 cifras");
                return;
            }

            int cantidadCifras = String.valueOf(numero).length();

            switch (cantidadCifras) {
                case 1:
                    txvrResultado.setText("El número ingresado tiene 1 cifra");
                    break;
                case 2:
                    txvrResultado.setText("El número ingresado tiene 2 cifras");
                    break;
                case 3:
                    txvrResultado.setText("El número ingresado tiene 3 cifras");
                    break;
            }
        } catch (NumberFormatException e) {
            txvrResultado.setText("El número ingresado no es válido");
        }
    }
}

