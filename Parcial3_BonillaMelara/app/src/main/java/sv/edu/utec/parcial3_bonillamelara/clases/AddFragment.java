package sv.edu.utec.parcial3_bonillamelara.clases;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import sv.edu.utec.parcial3_bonillamelara.Helper.AdminSQLiteOpenHelper;
import sv.edu.utec.parcial3_bonillamelara.R;

public class AddFragment extends Fragment {

    private Button btnInsert;

    EditText edtNombre, edtApellido, edtCorreo, edtTelefono, edtCodigo;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add, container, false);

        btnInsert = view.findViewById(R.id.btnInsert);
        edtNombre= view.findViewById(R.id.edtNombre);
        edtApellido= view.findViewById(R.id.edtApellido);
        edtCodigo= view.findViewById(R.id.edtCod);
        edtCorreo= view.findViewById(R.id.edtCorreo);
        edtTelefono= view.findViewById(R.id.edtTelefono);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getActivity(),"parcial",null,1);
                SQLiteDatabase bd= admin.getWritableDatabase();
                String cod = edtCodigo.getText().toString();
                String nombre = edtNombre.getText().toString();
                String apellido = edtApellido.getText().toString();
                String correo = edtCorreo.getText().toString();
                String telefono = edtTelefono.getText().toString();
                ContentValues informacion =new ContentValues();
                informacion.put("idContacto", cod);
                informacion.put("Nombre", nombre);
                informacion.put("Apellidos", apellido);
                informacion.put("Teléfono", telefono);
                informacion.put("Correo", correo);
                try {
                    bd.insert("Contactos", null, informacion);

                    Toast.makeText(getActivity(), "Se inserto el contacto", Toast.LENGTH_LONG).show();
                    bd.close();

                } catch (Exception e){
                    //pendiente imprimir error
                    Toast.makeText(getActivity(), ""+e.getCause(), Toast.LENGTH_LONG).show();
                }

            }
        });
        return view;
    }

}
