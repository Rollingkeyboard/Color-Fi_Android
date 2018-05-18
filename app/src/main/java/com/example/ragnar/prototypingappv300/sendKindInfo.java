package com.example.ragnar.prototypingappv300;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class sendKindInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_kind_info);

    }

    //called when the sendMsg button is clicked
    public void onClickSendMsg(View view) {

        Intent intent = new Intent(this, sendMessage.class);
        startActivity(intent);
    }

    //called when the send image button is clicked
    public void onClickSendImage(View view)
    {
        Intent intent = new Intent(this, sendImage.class);
        startActivity(intent);
    }

    //called when the send file button is clicked
    public void onClickSendFile(View view)
    {
        Intent intent = new Intent(this, textFile.class);
        startActivity(intent);
    }

    //called when the go back button is clicked
    public void onClickGoBack(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }


}


