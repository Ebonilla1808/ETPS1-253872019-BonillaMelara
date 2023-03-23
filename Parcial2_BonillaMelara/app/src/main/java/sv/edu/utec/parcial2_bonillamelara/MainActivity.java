package sv.edu.utec.parcial2_bonillamelara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Personas> listapersonas;
    ListView lvPersonas;
    Integer[]ImgPpersonas={
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listapersonas=new ArrayList<Personas>();
        listapersonas.add(new Personas("Alexander Pierrot","CEO", "Insures S.O"));
        listapersonas.add(new Personas("Carlos Lopez","Asistente", "Hospital Blue"));
        listapersonas.add(new Personas("Sara Bonz","Directora de Marketing", "Electrical Parts Itd"));
        listapersonas.add(new Personas("Liliana Clarence","Diseñadora de Producto", "Creativa App"));
        listapersonas.add(new Personas("Benito Peralta","Supervisor de ventas", "Neumaticos Press"));
        listapersonas.add(new Personas("Juan Jaramillo","CEO", "Banco Nacional"));
        listapersonas.add(new Personas("Christian Steps","CTO", "Cooperativa Verde"));
        listapersonas.add(new Personas("Alexa Giraldo","Lead Progammer", "Frutisofy"));
        listapersonas.add(new Personas("Linda Murillo","Directora de Marketing", "Seguros Boliver"));
        listapersonas.add(new Personas("Lizeth Astrada","CEO", "Concesionario Motolox"));
        AdaptadorPersonas adaptador = new AdaptadorPersonas(this, listapersonas, ImgPpersonas);
        lvPersonas = findViewById(R.id.lstPersonas);
        lvPersonas.setAdapter(adaptador);
        lvPersonas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, InfoPersonaActivity.class);
                intent.putExtra("nombre", listapersonas.get(position).getNombre());
                intent.putExtra("cargo", listapersonas.get(position).getCargo());
                intent.putExtra("compania", listapersonas.get(position).getCompñia());
                intent.putExtra("foto", ImgPpersonas[position]);
                startActivity(intent);
            }
        });
    }
}