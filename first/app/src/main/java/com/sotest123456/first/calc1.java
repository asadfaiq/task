package com.sotest123456.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calc1 extends AppCompatActivity implements View.OnClickListener
    {
        private Button btnAdd, btnSub, btnMul, btnDiv;
        private TextView tvResult;
        private EditText c, d;


        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc1);
        init();

    }
        private void init () {


        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        c = (EditText) findViewById(R.id.efirst);
        d = (EditText) findViewById(R.id.esecond);
      tvResult=(EditText)findViewById(R.id.tvResult);
         btnAdd.setOnClickListener(this);
         btnSub.setOnClickListener(this);
         btnMul.setOnClickListener(this);
         btnDiv.setOnClickListener(this);
    }

        @Override
        public void onClick(View view) {
            String num1=c.getText().toString();
            String num2 = d.getText().toString();
            switch (view.getId())
{
    case R.id.btnAdd:
        int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
    tvResult.setText(String.valueOf(addition));
    break;
    case R.id.btnSub:
        int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
        tvResult.setText(String.valueOf(subtraction));
        break;
    case R.id.btnMul:
        int multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
        tvResult.setText(String.valueOf(multiply));
        break;
    case R.id.btnDiv:
        try
        {

            int divide = Integer.parseInt(num1) / Integer.parseInt(num2);
            tvResult.setText(String.valueOf(divide));

        }catch (Exception e){

tvResult.setText("cannot divide");

        }
        break;

}
        }
    }