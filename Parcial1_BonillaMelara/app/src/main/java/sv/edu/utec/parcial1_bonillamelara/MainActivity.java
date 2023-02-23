package sv.edu.utec.parcial1_bonillamelara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String usuario= "parcialETps1", pass="p4rC14l#tp$";
    private EditText usuarioET;
    private EditText passwordET;
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuarioET = findViewById(R.id.edtUsuario);
        passwordET = findViewById(R.id.edtPass);
        loginButton = findViewById(R.id.btnIngresar);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuarioIn = usuarioET.getText().toString();
                String contrasenaIn = passwordET.getText().toString();

                if (usuarioIn.equals(usuario) && contrasenaIn.equals(pass)) {
                    Intent intent = new Intent(MainActivity.this, ImcActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "contraseña y usuario no son correctos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}