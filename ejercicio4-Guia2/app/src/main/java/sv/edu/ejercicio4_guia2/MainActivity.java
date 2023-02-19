package sv.edu.ejercicio4_guia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //Declaracion de variables

    EditText edtDatoN;
    TextView txvrResultadoN,txvrResultadoNA, txvrResultadoNB, txvrResultadoNC;
    Button btnCalculoN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtDatoN=findViewById(R.id.edtValorN);
        txvrResultadoN=findViewById(R.id.txvResultado);
        txvrResultadoNA=findViewById(R.id.txvResultadoUno);
        txvrResultadoNB=findViewById(R.id.txvResultadoDos);
        txvrResultadoNC=findViewById(R.id.txvResultadoTres);
        btnCalculoN=findViewById(R.id.btnCalcular);
    }
    public void calculoDeN (View v) {
        try {
            int N = Integer.parseInt(edtDatoN.getText().toString());


            txvrResultadoN.setText("Valor inicial de N = " + String.valueOf(N));
            N += 77;
            txvrResultadoNA.setText("N + 77 = " + String.valueOf(N));
            N -= 3;
            txvrResultadoNB.setText("N - 3 = " + String.valueOf(N));
            N *= 2;
            txvrResultadoNC.setText("N * 2 = " + String.valueOf(N));
        }
        catch (Exception e){
            txvrResultadoN.setText("El valor de N no es valido. Porfavor, ingrese un numero entero");
        }
    }
}