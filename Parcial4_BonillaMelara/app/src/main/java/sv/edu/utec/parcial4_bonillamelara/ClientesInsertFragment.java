package sv.edu.utec.parcial4_bonillamelara;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import sv.edu.utec.parcial4_bonillamelara.datos.Clientes;


public class ClientesInsertFragment extends Fragment {

    EditText txtnombre,txtapellido,txtdireccion, txtciudad;
    TextView tvMensajes;
    Button btnGuardar;
    Context context;

    public ClientesInsertFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatActivity appCompatActivity =new AppCompatActivity();
        context = getContext();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) { // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_clientes_insert, container, false);
        txtnombre=view.findViewById(R.id.edtNombreCliente);
        txtapellido=view.findViewById(R.id.edtApellidoCliente);
        txtdireccion=view.findViewById(R.id.edtDireccion);
        txtciudad=view.findViewById(R.id.edtCiudad);
        btnGuardar=view.findViewById(R.id.btnGuardar);
        tvMensajes=view.findViewById(R.id.tvMensaje);

        btnGuardar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Clientes baseProv = new Clientes(context);

                long codiSave=baseProv.insertar(txtnombre.getText().toString(),txtapellido.getText().toString(),txtdireccion.getText().toString(), txtciudad.getText().toString());
                if(codiSave>0){
                    tvMensajes.setText("Registro insertado con codigo: "+codiSave);
                }
                else{
                    tvMensajes.setText("Error en insertar");
                }
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}