package sv.edu.ejercicio3guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText[] numeros = new EditText[10];
    private Button btnSuma;
    private TextView txvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeros[0] = findViewById(R.id.numero1);
        numeros[1] = findViewById(R.id.numero2);
        numeros[2] = findViewById(R.id.numero3);
        numeros[3] = findViewById(R.id.numero4);
        numeros[4] = findViewById(R.id.numero5);
        numeros[5] = findViewById(R.id.numero6);
        numeros[6] = findViewById(R.id.numero7);
        numeros[7] = findViewById(R.id.numero8);
        numeros[8] = findViewById(R.id.numero9);
        numeros[9] = findViewById(R.id.numero10);

        btnSuma = findViewById(R.id.btnSum);
        txvresultado = findViewById(R.id.txvrespuesta);
    }

    public void calculo(View v) {
        try {
            int suma = 0;
            for (int i = 5; i < numeros.length; i++) {
                suma += Integer.parseInt(numeros[i].getText().toString());
            }
            txvresultado.setText("La suma de los últimos 5 números " +
                    "ingresados es: " + suma);
        }
        catch (Exception e){
            txvresultado.setText("Los valores ingresados no son validos. Porfavor, " +
                    "" + "ingrese solo numeros enteros");
        }
    }
}


