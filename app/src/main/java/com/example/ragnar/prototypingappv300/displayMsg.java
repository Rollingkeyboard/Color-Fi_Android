package com.example.ragnar.prototypingappv300;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class displayMsg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_msg);
    }

    public void onClickGoBack(View view)
    {
        Intent intent = new Intent(this,receiveMsg.class);

        startActivity(intent);

    }


    public void onClickFinshed(View view){

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }



}
