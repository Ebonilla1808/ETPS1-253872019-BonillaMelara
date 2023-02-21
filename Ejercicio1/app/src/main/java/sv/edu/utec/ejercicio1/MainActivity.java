package sv.edu.utec.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNombre;
    TextView etInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre=findViewById(R.id.edtNombre);
        etInfo=findViewById(R.id.tvResultado);

    }
    public void Mostrar(View v){

       String nombre=etNombre.getText().toString();
       etInfo.setText("Bienvenido " +nombre);


    }
}