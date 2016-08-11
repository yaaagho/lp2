package com.example.yagho.fatorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText num = (EditText) findViewById(R.id.numero);
        Button calcular = (Button) findViewById(R.id.btn);
        final TextView texto = (TextView) findViewById(R.id.txt);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num.getText().toString());
                int i=1,aux=1;

                while(i<=n1){
                    aux=aux*i;
                    i++;
                }

                texto.setText("O fatorial de "+ n1 + " é: " + aux);



            }
        });

    }
}
