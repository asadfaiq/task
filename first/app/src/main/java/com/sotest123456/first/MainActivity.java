package com.sotest123456.first;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

public Button button1,url,calc,list;
      public void init(){


        button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:03323602358"));
                startActivity(intent);
            }


        });
    }
    public void abc(){


        url=(Button) findViewById(R.id.url);
        url.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(browserIntent);
            }


        });
    }
    public void i() {


        calc = (Button) findViewById(R.id.calc);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {


                Intent asad1 = new Intent(MainActivity.this, calc1.class);

                startActivity(asad1);
            }


        });

    }
    public void c() {


        list = (Button) findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {


                Intent asad12 = new Intent(MainActivity.this, Main3Activity.class);

                startActivity(asad12);
            }


        });
    }


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = new TextView(this);
        txt.setText(R.string.app_name);
        txt.append("abc");
        txt.setHeight(RelativeLayout.LayoutParams.WRAP_CONTENT);
        txt.setWidth(RelativeLayout.LayoutParams.WRAP_CONTENT);
  init();
abc();

i();
c();
}
}
