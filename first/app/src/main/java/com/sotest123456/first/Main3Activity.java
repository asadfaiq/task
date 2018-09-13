package com.sotest123456.first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {
    String items[] =new String[]{"asad","komal","saad","yahya"};
    public Button button1;
    public void init(){


        button1=(Button) findViewById(R.id.as);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {


                Intent asad = new Intent(Main3Activity.this,calc1.class);

                startActivity(asad);
            }


        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init();


    ListView listView=(ListView)findViewById(R.id.abc);
    ArrayAdapter<String> adapter=new ArrayAdapter <>(this,android.R.layout.simple_list_item_1,items);
listView.setAdapter(adapter);
    }
}
