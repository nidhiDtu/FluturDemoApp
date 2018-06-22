package com.example.user.fluturdemoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    private Button a1;
    private Button a2;
    private Button a3;
    private Button a4;
    private Button a5;
    private Button a6;
    private Button a7;
    private Button a8;
    private Button a9;
    private Button a10;

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;

    private Button c1;
    private Button c2;
    private Button c3;
    private Button c4;
    private Button c5;
    private Button c6;
    private Button c7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Intent intent=getIntent();

        init();

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"Q",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","Q");
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"W",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","W");
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"E",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","E");
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"R",Toast.LENGTH_SHORT).show();

                Log.d("letter typed","R");
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"T",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","T");
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"Y",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","Y");
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"U",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","U");
            }
        });
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"I",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","I");
            }
        });
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"O",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","O");
            }
        });
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"P",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","P");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"A",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","A");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"S",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","S");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"D",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","D");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"F",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","F");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"G",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","G");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"H",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","H");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"J",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","J");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"K",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","K");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"L",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","L");
            }
        });

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"Z",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","Z");
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"X",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","X");
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"C",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","C");
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"V",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","V");
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"B",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","B");
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"N",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","N");
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this,"M",Toast.LENGTH_SHORT).show();
                Log.d("letter typed","M");
            }
        });
    }

    private void init() {
        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a3=findViewById(R.id.a3);
        a4=findViewById(R.id.a4);
        a5=findViewById(R.id.a5);
        a6=findViewById(R.id.a6);
        a7=findViewById(R.id.a7);
        a8=findViewById(R.id.a8);
        a9=findViewById(R.id.a9);
        a10=findViewById(R.id.a10);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);

        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);
        c7=findViewById(R.id.c7);
    }
}
