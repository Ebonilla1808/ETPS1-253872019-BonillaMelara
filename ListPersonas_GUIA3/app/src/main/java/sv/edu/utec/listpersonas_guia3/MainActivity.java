package sv.edu.utec.listpersonas_guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Personas> listapersonas;
    ListView lv1;
    Integer[]ImgPpersonas={
            R.drawable.ana,
            R.drawable.carlos,
            R.drawable.fernanda,
            R.drawable.gustavo,
            R.drawable.jose,
            R.drawable.juan,
            R.drawable.karla,
            R.drawable.luis,
            R.drawable.maria,
            R.drawable.marta,
            R.drawable.pedro,
            R.drawable.silvia
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listapersonas=new ArrayList<Personas>();
        listapersonas.add(new Personas("ana",'f'));
        listapersonas.add(new Personas("carlos",'m'));
        listapersonas.add(new Personas("fernanda",'f'));
        listapersonas.add(new Personas("gustavo",'m'));
        listapersonas.add(new Personas("jose",'m'));
        listapersonas.add(new Personas("Juan", 'm'));
        listapersonas.add(new Personas("karla",'f'));
        listapersonas.add(new Personas("luis",'m'));
        listapersonas.add(new Personas("maria",'f'));
        listapersonas.add(new Personas("marta",'f'));
        listapersonas.add(new Personas("pedro",'m'));
        listapersonas.add(new Personas("silvia",'f'));
        AdaptadorPersonas adaptador = new AdaptadorPersonas(this, listapersonas, ImgPpersonas);
        lv1 = findViewById(R.id.lsvPersonas);
        lv1.setAdapter(adaptador);
    }


}
