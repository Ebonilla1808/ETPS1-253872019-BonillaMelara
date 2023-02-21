package sv.edu.ejercicio2guia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etPrecio;
    Button btCalculo;
    TextView tvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrecio=findViewById(R.id.edtPrecio);
        btCalculo=findViewById(R.id.btnCalcular);
        tvresultado=findViewById(R.id.txvResultado);
    }

    public void calculoIVA (View v){
        try {
            double dato1= Double.parseDouble(etPrecio.getText().toString());
            double iva=0.134;
            double resultado=dato1 * (1 + iva);

            tvresultado.setText(String.format("El precio final con IVA es: $%.2f", resultado));
        }
        catch (Exception e){
            tvresultado.setText("El dato ingresado no es valido, porfavor ingrese el dato nuevamente");
        }


    }
}
