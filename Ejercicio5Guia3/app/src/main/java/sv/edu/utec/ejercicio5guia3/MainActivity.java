package sv.edu.utec.ejercicio5guia3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Lado1, Lado2, Lado3;
    private ImageView imV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lado1 = findViewById(R.id.edtLado1);
        Lado2 = findViewById(R.id.edtLado2);
        Lado3 = findViewById(R.id.edtLado3);
        imV = findViewById(R.id.imV);

        findViewById(R.id.btnCalcular).setOnClickListener(view -> {
            double l1 = Double.parseDouble(Lado1.getText().toString());
            double l2 = Double.parseDouble(Lado2.getText().toString());
            double l3 = Double.parseDouble(Lado3.getText().toString());

            if (esTriangulo(l1, l2, l3)) {
                String tipo = tipoTriangulo(l1, l2, l3);
                switch (tipo) {
                    case "Equilátero":
                        imV.setImageResource(R.drawable.equilatero);
                        break;
                    case "Isósceles":
                        imV.setImageResource(R.drawable.iscoseles);
                        break;
                    case "Escaleno":
                        imV.setImageResource(R.drawable.tescaleno001);
                        break;
                }
            } else {
                imV.setImageResource(R.drawable.error);
            }
        });

       findViewById(R.id.btnLimpiar).setOnClickListener(View ->   {


            {
                EditText edtLado1 = findViewById(R.id.edtLado1);
                EditText edtLado2 = findViewById(R.id.edtLado2);
                EditText edtLado3 = findViewById(R.id.edtLado3);

                edtLado1.setText("");
                edtLado2.setText("");
                edtLado3.setText("");

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder.setMessage("¿Estás seguro de que quieres limpiar los campos?");
                alertDialogBuilder.setPositiveButton("Sí", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Código para limpiar los campos
                    }
                });
                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // No hacer nada
                    }
                });
                alertDialogBuilder.show();
            }
        });


    }

    private boolean esTriangulo(double l1, double l2, double l3) {
        return l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1;
    }

    private String tipoTriangulo(double l1, double l2, double l3) {
        if (l1 == l2 && l1 == l3) {
            return "Equilátero";
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}

