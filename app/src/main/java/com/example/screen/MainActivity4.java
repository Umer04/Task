package com.example.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView t1,t2,t3,t4;
    String msg1,msg2,msg3,msg4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);



        t1=findViewById(R.id.textView3);
        Intent intent=getIntent();
        msg1=intent.getStringExtra("v1");
        msg3=intent.getStringExtra("v3");
        System.out.println(msg1);


        t1.setText( t1.getText().toString()+msg1+msg3);

    }
}