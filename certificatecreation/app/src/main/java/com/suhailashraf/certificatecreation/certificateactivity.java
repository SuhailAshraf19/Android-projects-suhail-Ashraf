package com.suhailashraf.certificatecreation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class certificateactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificateactivity);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.msg);
        TextView textView=findViewById(R.id.certificate1);
        textView.setText(message);
    }
}