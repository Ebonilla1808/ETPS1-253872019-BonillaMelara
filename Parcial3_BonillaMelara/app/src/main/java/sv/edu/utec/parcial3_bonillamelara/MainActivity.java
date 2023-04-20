package sv.edu.utec.parcial3_bonillamelara;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import sv.edu.utec.parcial3_bonillamelara.clases.AddFragment;
import sv.edu.utec.parcial3_bonillamelara.clases.ContactFragment;
import sv.edu.utec.parcial3_bonillamelara.clases.HomeFragment;
import sv.edu.utec.parcial3_bonillamelara.clases.SearchFragment;
import sv.edu.utec.parcial3_bonillamelara.clases.SettingsFragment;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView btnNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); btnNav=findViewById(R.id.btnNav);

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