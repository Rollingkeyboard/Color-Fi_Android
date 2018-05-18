package com.example.ragnar.prototypingappv300;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.EditText;



public class sendMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
    }

    // after click send for input msg, it will pass string value to receive activity
    public void translateMSG(View view){
        EditText messageView = findViewById(R.id.message);
        String messageText = messageView .getText().toString();
         Intent intent=new Intent(this, translate.class);
         intent.putExtra(translate.EXTRA_MESSAGE, messageText);
         startActivity(intent);
    }

    //go back button will jump to the previews one of sendKindInfo
    public void onClickGoSendOthers(View view) {

        Intent intent = new Intent(this, sendKindInfo.class);
        startActivity(intent);

    }
    //allow user go home page
    public void onClickGoHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
