package sv.edu.utec.listapersonalizada;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdaptadorPais extends ArrayAdapter<String> {
    Activity contexto;
    String [] paises;
    Integer [] imgPais;
    ImageView imgBande;
    TextView tvNombre;

    public AdaptadorPais(Activity contexto, String [] paises, Integer [] imgPais){
        super(contexto,R.layout.paises, paises);
        this.contexto = contexto;
        this.paises = paises;
        this.imgPais = imgPais;
    }

    @Override
    public View getView(int position,  View v,  ViewGroup parent) {
        LayoutInflater inflater = contexto.getLayoutInflater();
        View roeView = inflater.inflate(R.layout.paises, null, true);
        tvNombre = roeView.findViewById(R.id.tvNombrePais);
        imgBande = roeView.findViewById(R.id.imgBandera);
        tvNombre.setText(paises[position]);
        imgBande.setImageResource(imgPais[position]);
        return roeView;
    }
}
