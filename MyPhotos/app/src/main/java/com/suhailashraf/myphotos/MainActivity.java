package com.suhailashraf.myphotos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton prev,next;
    ImageView pic;
    TextView text;

    int currentimage=0;
    String [] names={"Photo1","Photo2","Photo3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void prev(View view){
     text=findViewById(R.id.status);
     String idX="pic"+currentimage;
    int x= this.getResources().getIdentifier(idX,"id",getPackageName());
    pic=findViewById(x);
    pic.setAlpha(0f);
    currentimage=(3+currentimage-1)%3;
    String idY="pic"+currentimage;
    int y=this.getResources().getIdentifier(idY,"id",getPackageName());
    pic=findViewById(y);
    pic.setAlpha(1f);
    text.setText(names[currentimage]);

    }
    public void next(View view){
        text=findViewById(R.id.status);
        String idX="pic"+currentimage;
        int x= this.getResources().getIdentifier(idX,"id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);
        currentimage=(currentimage+1)%3;
        String idY="pic"+currentimage;
       int y=this.getResources().getIdentifier(idY,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentimage]);
    }

}