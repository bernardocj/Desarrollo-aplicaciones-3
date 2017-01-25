package com.example.pandithagd.ordinario1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtNumberA;

    private Button btnCalculate;

    private TextView txvResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumberA=(EditText) findViewById(R.id.edt_a);

        btnCalculate=(Button)findViewById(R.id.btn_calculate);

        txvResult=(TextView) findViewById(R.id.txv_result);



        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float numberA=Float.parseFloat(edtNumberA.getText().toString());

                float result=0;

                 result=2*numberA*((numberA+2)*(3*numberA-1)-(numberA+2*(numberA-1)*(numberA+3))) ;

                txvResult.setText(""+result);
            }
        });

    }
}
