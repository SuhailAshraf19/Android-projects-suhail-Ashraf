package com.suhailashraf.nothing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void SendNow(View view){
        Toast.makeText( this, "sending messages to suhail", Toast.LENGTH_SHORT).show();
    }
    public void ReceiveNow(View view){
        Toast.makeText( this, "Receiving " +
                " messages to suhail", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}