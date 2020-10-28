package com.example.dailygrocery;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.dailygrocery.R.id.batchno;

public class DemoActivity2 extends AppCompatActivity {
      TextView textView,textView1,textView2,textView3;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);
        textView=(TextView) findViewById(batchno);
        textView1=(TextView) findViewById(R.id.username);
        textView2=(TextView) findViewById(R.id.Seller);
        textView3=(TextView) findViewById(R.id.Price);

        textView.setText("Batch: "+getIntent().getStringExtra("Batch"));
        textView1.setText("Name: "+getIntent().getStringExtra("USER"));
        textView2.setText("Seller:"+getIntent().getStringExtra("seLLer"));
        textView3.setText("Price: "+getIntent().getStringExtra("priCe"));

    }
}