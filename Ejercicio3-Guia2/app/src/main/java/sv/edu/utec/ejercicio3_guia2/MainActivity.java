package sv.edu.utec.ejercicio3_guia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etOp1, etOp2, etSigno;
    Button btnCalcular;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etOp1=findViewById(R.id.etOp1);
        etOp2=findViewById(R.id.etOp2);
        etSigno=findViewById(R.id.etSigno);
        btnCalcular=findViewById(R.id.btnCalcular);
        tvResultado=findViewById(R.id.tvResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int op1= Integer.parseInt(etOp1.getText().toString());
                int op2= Integer.parseInt(etOp2.getText().toString());
                String signo= etSigno.getText().toString();
                double resultado=0;

                switch (signo){
                    case"+":
                        resultado=op1+op2;
                        break;
                    case"-":
                        resultado=op1-op2;
                        break;
                    case"*":
                        resultado=op1*op2;
                        break;
                    case"/":
                        resultado=(double)op1/op2;
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Signo aritmetico no valido!", Toast.LENGTH_SHORT).show();
                        break;
                }
                tvResultado.setText(String.valueOf(resultado));
            }
        });
    }
}