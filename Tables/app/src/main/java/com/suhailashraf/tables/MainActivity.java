package com.suhailashraf.tables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int i=1;
    
   
    TextView textView;
   public ArrayList<String> table(int y){
        ArrayList<String> al=new ArrayList<>();
        i=y;
        for(int j=1;j<21;j++){
            int t=i*j;
            String x;
            x = "                                "+i+" X "+j+" = "+t;
            al.add(x);
        }
        return al;
    }
    ArrayList<String> list=new ArrayList<>();
    int a=1;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.list);


        list=table(a);

         arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

    }
    public void next(View view){
      list=table(6);
        arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
    }
    public void prev(View view){

    }
}