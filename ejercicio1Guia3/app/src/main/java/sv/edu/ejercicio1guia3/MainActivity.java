package sv.edu.ejercicio1guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaracion de variables

    EditText edtValor;
    TextView txvrResultado;
    Button btnCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor=findViewById(R.id.edValor);
        txvrResultado=findViewById(R.id.txvResultado);
        btnCalculo=findViewById(R.id.btnCalcular);
    }
    public void calculo (View v) {
        try {
            int numero = Integer.parseInt(edtValor.getText().toString());
            String leyenda;
            if(numero > 0) {

                leyenda="El número es positivo";
            } else if(numero == 0) {

                leyenda="El número es nulo";
            } else {

                leyenda="El número es negativo";
            }

            Intent intent = new Intent(getApplicationContext(), pantallaDos.class);
            intent.putExtra("leyenda", leyenda);
            startActivity(intent);

        }
        catch (Exception e){
            txvrResultado.setText("El valor ingresado no es valido. Porfavor, " +
                    "ingrese un numero entero");
        }
    }
}