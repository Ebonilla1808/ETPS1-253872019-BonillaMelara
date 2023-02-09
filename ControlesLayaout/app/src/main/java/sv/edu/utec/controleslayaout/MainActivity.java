package sv.edu.utec.controleslayaout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spnPais;
    EditText etNombres, etApellidos, etInfo;
    RadioButton rbGenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombres = findViewById(R.id.edtNombre);
        etApellidos = findViewById(R.id.edtApellido);
        etInfo = findViewById(R.id.edtInfo);
        spnPais = findViewById(R.id.spnPaises);

        String [] opciones = {"Seleccione un pais","Guatemala", "El Salvador", "Honduras", "Nicaragua", "Costa Rica", "Panama"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, opciones);
        spnPais.setAdapter(adaptador);
    }
}