package sv.edu.utec.listbanderas_guia5;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String []paises={"El Salvador","Guatemala","Honduras","Nicaragua","Costa Rica"};
    ListView lsvPais;
    Integer[]ImgPais={
            R.drawable.banderaesa,
            R.drawable.banderaguatemala,
            R.drawable.banderahon,
            R.drawable.banderanic,
            R.drawable.banderacr,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdaptadorPais adaptador=new AdaptadorPais(this,paises,ImgPais);
        lsvPais=findViewById(R.id.lsvPais);
        lsvPais.setAdapter(adaptador);


        lsvPais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"Selecciono "+parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}