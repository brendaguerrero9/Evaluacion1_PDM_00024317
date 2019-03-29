package com.example.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnShare;
    private TextView usuario,vEmail,tot;
    String cont1, cont2, cont3, cont4, cont5, cont6, cont7, cont8, cont9, tx1, tx2, tx3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        usuario=findViewById(R.id.tvUser);
        vEmail=findViewById(R.id.tvEmail);
        tot=findViewById(R.id.tvTotal);

        btn1=findViewById(R.id.b1);
        btn2=findViewById(R.id.b2);
        btn3=findViewById(R.id.b3);
        btn4=findViewById(R.id.b4);
        btn5=findViewById(R.id.b5);
        btn6=findViewById(R.id.b6);
        btn7=findViewById(R.id.b7);
        btn8=findViewById(R.id.b8);
        btn9=findViewById(R.id.b9);

        btnShare=findViewById(R.id.btShare);

        Intent mIntent = getIntent();
        if (mIntent != null) {
            usuario.setText(mIntent.getStringExtra("user"));
            vEmail.setText(mIntent.getStringExtra("email"));
            tot.setText(mIntent.getStringExtra("total"));
            btn1.setText(mIntent.getStringExtra("k1"));
            btn2.setText(mIntent.getStringExtra("k2"));
            btn3.setText(mIntent.getStringExtra("k3"));
            btn4.setText(mIntent.getStringExtra("k4"));
            btn5.setText(mIntent.getStringExtra("k5"));
            btn6.setText(mIntent.getStringExtra("k6"));
            btn7.setText(mIntent.getStringExtra("k7"));
            btn8.setText(mIntent.getStringExtra("k8"));
            btn9.setText(mIntent.getStringExtra("k9"));
        }
    }



}
