package sv.edu.utec.parcial4_bonillamelara;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import sv.edu.utec.parcial4_bonillamelara.adaptadores.LstClientesAdapter;
import sv.edu.utec.parcial4_bonillamelara.datos.Clientes;
import sv.edu.utec.parcial4_bonillamelara.entidades.EntClientes;

import androidx.recyclerview.widget.DividerItemDecoration;

public class ClientesFragment extends Fragment {



    RecyclerView listaClientes;

    ArrayList<EntClientes> AListClientes;
    Context context;
    public ClientesFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view;
        view=inflater.inflate(R.layout.fragment_clientes, container, false);
        listaClientes=view.findViewById(R.id.rcvLstProveedores);

        listaClientes.setLayoutManager(new LinearLayoutManager(context));

        Clientes dbClientes = new Clientes(context);

        AListClientes=new ArrayList<>();
        LstClientesAdapter adapter=new LstClientesAdapter(dbClientes.mostrar());
        listaClientes.setAdapter(adapter);
        // Inflate the layout for this fragment


        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(listaClientes.getContext(),
                LinearLayoutManager.VERTICAL);

        listaClientes.addItemDecoration(dividerItemDecoration);
        return view;
    }
}