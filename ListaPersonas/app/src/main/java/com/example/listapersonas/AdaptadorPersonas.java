package com.example.listapersonas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorPersonas extends ArrayAdapter<String> {
    Activity contexto;
    String[]personas;
    Integer[]ImgPersona;
    ImageView imgPerson;
    TextView tvNombrePersona;

    public AdaptadorPersonas(Activity contexto, String[]personas, Integer[]ImgPersona){
        super(contexto, R.layout.personas,personas);
        this.contexto=contexto;
        this.personas=personas;
        this.ImgPersona=ImgPersona;
    }

    public View getView(int posicion, View v, ViewGroup parent){
        LayoutInflater inflater = contexto.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.personas,null,true);
        tvNombrePersona=rowView.findViewById(R.id.tvNombrePersona);
        imgPerson=rowView.findViewById(R.id.imgvPersonas);
        tvNombrePersona.setText(personas[posicion]);
        imgPerson.setImageResource(ImgPersona[posicion]);
        return rowView;
    }
}
