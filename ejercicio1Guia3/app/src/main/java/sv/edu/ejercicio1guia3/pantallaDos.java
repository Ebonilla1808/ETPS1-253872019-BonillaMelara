package sv.edu.ejercicio1guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class pantallaDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_dos);

        Intent intent = getIntent();
        String leyenda = intent.getStringExtra("leyenda");
        TextView textViewLeyenda = findViewById(R.id.txvResultado2);
        textViewLeyenda.setText(leyenda);

    }
}