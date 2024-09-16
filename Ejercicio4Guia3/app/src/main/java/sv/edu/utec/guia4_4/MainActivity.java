package sv.edu.utec.guia4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mg1, msg2;
    TextView num;
    Button btn;

    int con = 10,neg=0, pos=0, par=0,mul=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mg1 = findViewById(R.id.msg1);
        msg2 = findViewById(R.id.msg2);
        num = findViewById(R.id.num);
        btn = findViewById(R.id.btn);

        mg1.setText("Ingrse "+con+" numeros");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero();
            }
        });
    }


    private void numero(){
        int r = 0;
        String txt="";
        r = Integer.parseInt(num.getText().toString());
        con--;

        pos = (r>0)?pos+= 1:pos;
        neg = (r<0)?neg+= 1:neg;
        par = (r%2 == 0)?par+= r:par;
        mul = (r%15 ==0)?mul+=1:mul;

        if(con == 0){
            con = 10;

            txt= "Positivos: "+pos+"\n" +
                    "Negativos: "+neg+" \n" +
                    "Pares acumulados: "+par+"\n" +
                    "Multiplos de 15:  "+mul+" \n";

            msg2.setText(txt);

            neg=0; pos=0; par=0;mul=0;
        }
        mg1.setText("Ingrse "+con+" numeros");
    }

}