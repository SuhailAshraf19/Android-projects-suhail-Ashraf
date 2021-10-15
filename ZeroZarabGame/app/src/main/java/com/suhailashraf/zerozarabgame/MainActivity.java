package com.suhailashraf.zerozarabgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int activeplayer=0;
    int []gamestate;
    boolean gameactive=true;

    {
        gamestate = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2};
    }
    int [][] winpositions={{0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{2,4,6}
    };




    public void  playertap(View view){

        ImageView img=(ImageView) view;
        int tappedimage=Integer.parseInt(img.getTag().toString());

        if(gamestate[tappedimage]==2 && gameactive==true){
            gamestate[tappedimage]=activeplayer;
            if(activeplayer==0){
                img.setImageResource(R.drawable.cross);
                activeplayer=1;
                TextView status=findViewById(R.id.status);
                status.setText("O's turn to play");
            }
            else if(activeplayer==1){
                img.setImageResource(R.drawable.zero);
                activeplayer=0;
                TextView status=findViewById(R.id.status);
                status.setText("X's turn to play");
            }
        }
        for(int winposition[]:winpositions){
            if(gamestate[winposition[0]]==gamestate[winposition[1]] && gamestate[winposition[1]]==gamestate[winposition[2]]
                && gamestate[winposition[0]]!=2){
                String str;
                if(gamestate[winposition[0]]==0){
                    str="X has won the game";
                }
                else{
                    str="0 has won the game";
                }
                TextView status=findViewById(R.id.status);
                status.setText(str);
                gameactive=false;

            }

        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startagain(View view) {
        gameactive=true;
        activeplayer=0;
        for(int i=0;i<9;i++){
            gamestate[i]=2;
        }
        ((ImageView)findViewById((R.id.imageView1))).setImageResource(0);
        ((ImageView)findViewById((R.id.imageView2))).setImageResource(0);
        ((ImageView)findViewById((R.id.imageView3))).setImageResource(0);
        ((ImageView)findViewById((R.id.imageView4))).setImageResource(0);
        ((ImageView)findViewById((R.id.imageView5))).setImageResource(0);
        ((ImageView)findViewById((R.id.imageView6))).setImageResource(0);
        ((ImageView)findViewById((R.id.imageView7))).setImageResource(0);
        ((ImageView)findViewById((R.id.imageView8))).setImageResource(0);
        ((ImageView)findViewById((R.id.imageView9))).setImageResource(0);
        TextView status= findViewById(R.id.status);
        status.setText("X's Turn to play");
    }
}