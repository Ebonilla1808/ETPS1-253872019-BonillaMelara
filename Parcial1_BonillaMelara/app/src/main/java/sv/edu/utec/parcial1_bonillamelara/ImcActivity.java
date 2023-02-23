package sv.edu.utec.parcial1_bonillamelara;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ImcActivity extends AppCompatActivity {

    private EditText pesoET;
    private EditText alturaET;
    private TextView resultadoTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        pesoET= findViewById(R.id.edtPeso);
        alturaET = findViewById(R.id.edtAltura);
        resultadoTv = findViewById(R.id.txwResultado);
    }

    public void CalcularImc(View v){
        double peso = Double.parseDouble(pesoET.getText().toString());
        double estatura = Double.parseDouble(alturaET.getText().toString());
        double imc = peso / (estatura * estatura);

        resultadoTv.setText(String.format("Tu IMC es: %.1f\n", imc));
        if(imc<10.5){
            resultadoTv.append("Críticamente Bajo de Peso");
        }
        else if(imc<15.9){
            resultadoTv.append("Severamente Bajo de Peso");
        }
        else if(imc<18.5){
            resultadoTv.append("Bajo de Peso");
        }
        else if(imc<25){
            resultadoTv.append("Normal (peso saludable)");
        }
        else if(imc<30){
            resultadoTv.append("Sobrepeso");
        }
        else if(imc<35){
            resultadoTv.append("Obesidad Clase 1 - Moderadamente Obeso");
        }
        else if(imc<40){
            resultadoTv.append("Obesidad Clase 2 - Severamente Obeso");
        }
        else if(imc<50){
            resultadoTv.append("Obesidad Clase 3 - Críticamente Obeso");
        }
        else{
            resultadoTv.append("Obesidad Clase 4 - Obesidad extrema");
        }
    }
}
