package com.example.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.evaluacion.utilities.AppConstants;

public class MainActivity extends AppCompatActivity {

    private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btsend;
    private EditText et_user,et_email;
    private Integer cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,cont6=0,cont7=0,cont8=0,cont9=0,contTotal=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=findViewById(R.id.btn1);
        bt2=findViewById(R.id.btn2);
        bt3=findViewById(R.id.btn3);
        bt4=findViewById(R.id.btn4);
        bt5=findViewById(R.id.btn5);
        bt6=findViewById(R.id.btn6);
        bt7=findViewById(R.id.btn7);
        bt8=findViewById(R.id.btn8);
        bt9=findViewById(R.id.btn9);
        btsend=findViewById(R.id.btSend);

        et_user=findViewById(R.id.btUser);
        et_email=findViewById(R.id.btEmail);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont1 = cont1+1;
                bt1.setText("producto 1\n" + cont1);

            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont2= cont2+1;
                bt2.setText("producto 2\n" + cont2);

            }
        });


        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont3 = cont3+1;
                bt3.setText("producto 3\n" + cont2);

            }
        });



        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont4 = cont4+1;
                bt4.setText("producto 4\n" + cont4);

            }
        });


        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont5 = cont5+1;
                bt5.setText("producto 5\n" + cont5);

            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont6 = cont6+1;
                bt6.setText("producto 6\n" + cont6);

            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont7 = cont7+1;
                bt7.setText("producto 7\n" + cont7);

            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont8 = cont8+1;
                bt8.setText("producto 8\n" + cont8);

            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont9 = cont9+1;
                bt9.setText("producto 9\n" + cont9);

            }
        });



        btsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contTotal=cont1+cont2+cont3+cont4+cont5+cont6+cont7+cont8+cont9;


                Intent mIntent = new Intent(MainActivity.this,secondActivity.class);
                mIntent.putExtra("user",et_user.getText().toString());
                mIntent.putExtra("email",et_email.getText().toString());
                mIntent.putExtra("total",Integer.toString(contTotal));


                mIntent.putExtra("k1", bt1.getText().toString());
                mIntent.putExtra("k2", bt2.getText().toString());
                mIntent.putExtra("k3", bt3.getText().toString());
                mIntent.putExtra("k4", bt4.getText().toString());
                mIntent.putExtra("k5", bt5.getText().toString());
                mIntent.putExtra("k6", bt6.getText().toString());
                mIntent.putExtra("k7", bt7.getText().toString());
                mIntent.putExtra("k8", bt8.getText().toString());
                mIntent.putExtra("k9", bt9.getText().toString());

                startActivity(mIntent);

            }


        });

    }



}
