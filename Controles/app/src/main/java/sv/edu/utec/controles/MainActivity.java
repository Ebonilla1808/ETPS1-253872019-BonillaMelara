package sv.edu.utec.controles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edValor1, edtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edValor1 = findViewById(R.id.edtTabla);
        edtResultado = findViewById(R.id.edtResultado);
    }

    public void Tabla(View v){
        int valTabla = Integer.parseInt(edValor1.getText().toString());
        String resultado="";
        edtResultado.setText(resultado);
        for (int i = 1; i<=10; i++){
            resultado = String.valueOf(valTabla * i);
            edtResultado.append(valTabla +" * "+i + " = " + resultado+"\n");
        }
    }
}