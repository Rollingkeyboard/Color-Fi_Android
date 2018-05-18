package com.example.ragnar.prototypingappv300;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fileConvertToQR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_convert_to_qr);
    }

    public void onClickSendOther(View view) {
        Intent intent = new Intent(this, sendKindInfo.class);
        startActivity(intent);
    }

    public void onClickGoHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
