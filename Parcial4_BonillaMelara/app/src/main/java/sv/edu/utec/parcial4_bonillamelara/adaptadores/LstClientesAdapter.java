package sv.edu.utec.parcial4_bonillamelara.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import sv.edu.utec.parcial4_bonillamelara.R;
import sv.edu.utec.parcial4_bonillamelara.entidades.EntClientes;

public class LstClientesAdapter extends RecyclerView.Adapter<LstClientesAdapter.ClientesViewHolder>{
    ArrayList<EntClientes> listaprove;
    public LstClientesAdapter(ArrayList<EntClientes> mostrar) {

        this.listaprove=mostrar;
    }

    public LstClientesAdapter() {
    }

    @NonNull
    @Override
    public LstClientesAdapter.ClientesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_clientes,null,false);
        return new ClientesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LstClientesAdapter.ClientesViewHolder holder, int position) {

       // holder.viewId.setText(listaprove.get(position).getID_Cliente());
        holder.viewNombre.setText(listaprove.get(position).getsNombreCliente());
        holder.viewApellido.setText(listaprove.get(position).getsApellidosCliente());
        holder.viewDireccion.setText(listaprove.get(position).getsDireccionClientes());
        holder.viewCiudad.setText(listaprove.get(position).getsCiudadCliente());
    }

    @Override
    public int getItemCount() {
        return listaprove.size();
    }

    public class ClientesViewHolder extends RecyclerView.ViewHolder {
        TextView viewNombre,viewApellido, viewDireccion, viewCiudad;
        public ClientesViewHolder(@NonNull View itemView) {
            super(itemView);
          //  viewId=itemView.findViewById(R.id.tvIdCliente);
            viewNombre=itemView.findViewById(R.id.tvNombre);
            viewApellido=itemView.findViewById(R.id.tvApellido);
            viewDireccion=itemView.findViewById(R.id.tvDireccion);
            viewCiudad=itemView.findViewById(R.id.tvCiudad);
        }
    }
}
