package sv.edu.utec.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
String [] paises = {
        //"El Salvador",
        //"Guatemala",
        "Honduras",
       // "Nicargua",
        "Costa Rica"};
ListView lvstPais;
Integer [] imgPais = {
       // R.drawable.salvador,
      //  R.drawable.guatemala,
        R.drawable.honduras,
       // R.drawable.nicaragua,
        R.drawable.costarica
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdaptadorPais adaptadorPais = new AdaptadorPais(this, paises, imgPais);
        lvstPais=findViewById(R.id.lsvtPaises);
        lvstPais.setAdapter(adaptadorPais);
    }
}