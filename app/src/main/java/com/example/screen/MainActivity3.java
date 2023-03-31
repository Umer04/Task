package com.example.screen;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private Button add;
    String msg1,msg2,msg3,msg4;
    TextView name,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        add=findViewById(R.id.button);
        name=findViewById(R.id.textView);
        phone=findViewById(R.id.textView2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent details=new Intent(MainActivity3.this,MainActivity4.class);

                msg1=name.getText().toString();

                msg3=phone.getText().toString();


                details.putExtra("v1",msg1);
                details.putExtra("v3",msg3);
                startActivity((details));
            }
        });
    }
}
