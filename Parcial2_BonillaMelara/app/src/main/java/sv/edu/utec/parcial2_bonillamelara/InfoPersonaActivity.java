package sv.edu.utec.parcial2_bonillamelara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoPersonaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_persona);
        ImageView imageView = findViewById(R.id.imageView);
        TextView nombreTextView = findViewById(R.id.txwNombre);
        TextView cargoTextView = findViewById(R.id.txwCargo);
        TextView companiaTextView = findViewById(R.id.txwCampania);

        String nombre = getIntent().getStringExtra("nombre");
        String cargo = getIntent().getStringExtra("cargo");
        String compania = getIntent().getStringExtra("compania");
        int foto = getIntent().getIntExtra("foto", 0);

        imageView.setImageResource(foto);
        nombreTextView.setText(nombre);
        cargoTextView.setText(cargo);
        companiaTextView.setText(compania);
    }
}