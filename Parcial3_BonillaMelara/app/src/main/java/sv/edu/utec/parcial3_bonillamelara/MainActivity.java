package sv.edu.utec.parcial3_bonillamelara;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import sv.edu.utec.parcial3_bonillamelara.Helper.AdminSQLiteOpenHelper;
import sv.edu.utec.parcial3_bonillamelara.clases.AddFragment;
import sv.edu.utec.parcial3_bonillamelara.clases.ContactFragment;
import sv.edu.utec.parcial3_bonillamelara.clases.HomeFragment;
import sv.edu.utec.parcial3_bonillamelara.clases.SearchFragment;
import sv.edu.utec.parcial3_bonillamelara.clases.SettingsFragment;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView btnNav;
    Button btnInsert;
    EditText edtNombre, edtApellido, edtCorreo, edtTelefono, edtCodigo;
    private FrameLayout fragmentCont;
    private ImageView btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNav=findViewById(R.id.btnNav);
        fragmentCont = findViewById(R.id.fragmentCont);
        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cargar fragmento en el FrameLayout
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AddFragment fragment = new AddFragment(); // Instancia del fragmento que deseas cargar
                fragmentTransaction.replace(R.id.fragmentCont, fragment);
                fragmentTransaction.commit();
                btnInsert = findViewById(R.id.btnInsert);
            }
        });


        btnNav.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) navaListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navaListener= new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment seleccionFrag= null;

            switch (item.getItemId()){
                case R.id.nav_home:
                    seleccionFrag = new HomeFragment();
                    break;
                case R.id.nav_search:
                    seleccionFrag = new SearchFragment();
                    break;
                case R.id.nav_contact:
                    seleccionFrag = new ContactFragment();
                    break;
                case R.id.nav_settings:
                    seleccionFrag = new SettingsFragment();
                    break;
                case R.id.btnAdd:
                    seleccionFrag = new AddFragment();
                    break;
            }



            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentCont, seleccionFrag).commit();
            return true;

        }



    };
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_configuraciones,menu);
        return true ;

    }
/*
    public boolean onOptionsItemSelected(MenuItem items){

        Intent intent = new Intent(this, Sumar.class);

        switch (items.getItemId()){

            case R.id.opcion1:
                Toast.makeText(this,"Selecciono la opcion 1"+1,Toast.LENGTH_SHORT).show();
                startActivity(intent);
                return true;
            case R.id.opcion2:
                Toast.makeText(this,"Selecciono la opcion 2"+1,Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion3:
                Toast.makeText(this,"Selecciono la opcion 3"+1,Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion4:
                Toast.makeText(this,"Selecciono la opcion 4"+1,Toast.LENGTH_SHORT).show();
                return true;


        }

        return super.onOptionsItemSelected(items);
    }*/
}