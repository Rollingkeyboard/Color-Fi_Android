package com.example.ragnar.prototypingappv300;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.CardView;
import android.view.View;

//add import here
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//

//        findViewById(R.id.sendingfile).setOnClickListener(new View.OnClickListener(){
//            @Override public void onClick(View view){
//                Intent intent = new Intent(MainActivity.this, sendKindInfo.class);
//                startActivity(intent);
//            }
//
//        });
//        findViewById(R.id.sendingmsg).setOnClickListener(new View.OnClickListener(){
//            @Override public void onClick(View view){
//                Intent intent = new Intent(MainActivity.this, sendMessage.class);
//                startActivity(intent);
//            }
//
//        });
//        findViewById(R.id.receiveMsg).setOnClickListener(new View.OnClickListener(){
//            @Override public void onClick(View view){
//                Intent intent = new Intent(MainActivity.this, receiveMsg.class);
//                startActivity(intent);
//            }
//
//        });
//        findViewById(R.id.setting).setOnClickListener(new View.OnClickListener(){
//            @Override public void onClick(View view){
//                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
//                startActivity(intent);
//            }
//
//        });

    }
//

//  called when the send button is clicked from home scream
    public void onClickSend(View view) {

        Intent intent = new Intent(this, sendKindInfo.class);
        startActivity(intent);

    }
    //called when the receive button is clicked from home scream
    public void onClickReceive(View view){

        Intent intent = new Intent(this, receiveMsg.class);
        startActivity(intent);

    }

    //called when the shortcut sent text button is clicked from home scream, it jump to send message
    // activity to allow user input text.
    public void onClickSentMsgShortCut(View view) {

        Intent intent = new Intent(this, sendMessage.class);
        startActivity(intent);

    }

    //called when the setting button is clicked from home scream
    public void onClickSettings(View view){

        Intent intent = new Intent (this, SettingsActivity.class);
        startActivity(intent);
    }




}

