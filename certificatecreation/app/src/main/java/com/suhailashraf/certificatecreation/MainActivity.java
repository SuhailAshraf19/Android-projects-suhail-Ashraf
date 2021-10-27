package com.suhailashraf.certificatecreation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String msg="com.suhailashraf.certficate";
     public void Certificate(View view){
         Intent intent= new Intent(this,certificateactivity.class);
         EditText editText1=findViewById(R.id.id1);
         EditText editText2=findViewById(R.id.id2);
         EditText editText3=findViewById(R.id.id3);
         String message="    Dear " + editText1.getText().toString()+ " son of "+ editText2.getText().toString() +" from "+editText3.getText().toString()+" you have sucessfully completed the course for typing ";

         if(editText1.getText().toString()!=null ) {
             intent.putExtra(msg,message);
             startActivity(intent);
         }
     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}