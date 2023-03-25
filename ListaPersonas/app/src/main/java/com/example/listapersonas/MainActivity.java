package com.example.listapersonas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.example.listapersonas.AdaptadorPersonas.*;

public class MainActivity extends AppCompatActivity {
    String []personas={
            "Andrés Cabrera\n28 años\nCarrera 17 # 57-23, Bogotá, Colombia.",
            "Carlos Hernández\n36 años\nCalle Colón # 432, San Juan, Puerto Rico.",
            "Sofía Lima\n43 años \nAvenida Paulista, 1578 - Bela Vista, São Paulo - SP, Brazil.",
            "Laura Chávez\n29 años\nPlaza Mayor, s/n, 37002 Salamanca, Spain.",
            "Bernardo Nuila\n34 años\nVia del Corso, 1, 00186 Roma RM, Italy.",
            "José Quintanilla\n47 años\nOxford Street, London W1B 3AG, United Kingdom.",
            "Fernando Mejia \n33 años\nRue de Rivoli, 75001 Paris, France.",
            "Luciana González\n27 años\nFriedrichstraße 43-45, 10117 Berlin, Germany.",
            "Rebeca Valencia\n26 años\nTimes Square, Manhattan, New York, NY 10036, United States.",
            "Estela Estrada\n25 años\nShibuya Crossing, 2 Chome-2-1 Dogenzaka, Shibuya City, Tokyo 150-0043, Japan.",


    };
    ListView lsvpersonas;
    Integer[]ImgPersona={
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdaptadorPersonas adaptador=new AdaptadorPersonas(this,personas,ImgPersona);
        lsvpersonas=findViewById(R.id.lsvpersonas);
        lsvpersonas.setAdapter(adaptador);

    }
}