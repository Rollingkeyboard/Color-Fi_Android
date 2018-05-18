package com.example.ragnar.prototypingappv300;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.widget.EditText;
import android.app.Activity;

public class translate extends AppCompatActivity {
public static final String EXTRA_MESSAGE = "message";  //testing get value from user input and displays input
//public static final Image EXTRA_IMAGE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = findViewById(R.id.receiveMessage);
        messageView.setText(messageText);
    }
        //this is a test pass value from send message activity
        //here, I am try to display message from user input in sendMessage activity.

    public void onClickScan (View view){

        //show color-QR code on imageview
        // DO QR code translate function
        ImageView imageView = findViewById(R.id.imageView);
    }

    public void onClickGoHome (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // below is that we need add more function to convert string to color here



}
