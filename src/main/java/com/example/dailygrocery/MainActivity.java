package com.example.dailygrocery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
         EditText batch,user,seller,price;
         Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        batch=(EditText) findViewById(R.id.batchno);
        user=(EditText) findViewById(R.id.username);
        seller=(EditText) findViewById(R.id.seller);
        price=(EditText) findViewById(R.id.price);

        btn=(Button)  findViewById(R.id.button);
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                String Batchvalue=batch.getText().toString();
                String userValue=user.getText().toString();
                String sellerValue=seller.getText().toString();
                String priceV=price.getText().toString();
                Intent intent=new Intent(MainActivity.this,DemoActivity2.class);
                intent.putExtra("Batch",Batchvalue);
                intent.putExtra("USER",userValue);
                intent.putExtra("seLLer",sellerValue);
                intent.putExtra("priCe",priceV);
                startActivity(intent);
            }
        });






    }
}