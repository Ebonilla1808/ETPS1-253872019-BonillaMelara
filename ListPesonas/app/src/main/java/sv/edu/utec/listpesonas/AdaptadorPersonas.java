package sv.edu.utec.listpesonas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AdaptadorPersonas extends ArrayAdapter<Personas> {
    AppCompatActivity appCompatActivity;
    ArrayList<Personas> listapersonas;
    Integer [] imgPersonas;
    AdaptadorPersonas(AppCompatActivity context, ArrayList<Personas> listapersonas, Integer [] imgPersonas) {
        super(context, R.layout.persona, listapersonas);
        appCompatActivity = context;
        this.listapersonas = listapersonas;
        this.imgPersonas = imgPersonas;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = appCompatActivity.getLayoutInflater();
        View item = inflater.inflate(R.layout.persona, null);
        TextView textView1 = item.findViewById(R.id.tvNombre);
        textView1.setText(listapersonas.get(position).getNombre());
        ImageView imageView1 = item.findViewById(R.id.imvFoto);
        imageView1.setImageResource(imgPersonas[position]);
        return (item);
    }
}
