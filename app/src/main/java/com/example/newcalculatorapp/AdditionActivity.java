package com.example.newcalculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdditionActivity extends AppCompatActivity
{

    Button b1;
    EditText t1,t2;
    String getNum1,getNum2,result;
    int sum,num1,num2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addition);

        b1=(Button) findViewById(R.id.res);
        t1=(EditText) findViewById(R.id.n1);
        t2=(EditText) findViewById(R.id.n2);
        tv=(TextView) findViewById(R.id.re);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getNum1=t1.getText().toString();
                getNum2=t2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1+num2;
                result=String.valueOf(sum);
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                tv.setText(result);
            }
        });

    }
}