package com.example.ragnar.prototypingappv300;

import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class receiveMsg extends AppCompatActivity {

    ImageView imageView;
    int CAMERA_REQUEST = 1888;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_msg);

        CardView scan_camera = findViewById(R.id.scan_camera);
        imageView =findViewById(R.id.receive_imageView);
        scan_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,CAMERA_REQUEST);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);
        }
        else
        {
            Toast.makeText(receiveMsg.this, "Picture NOT taken", Toast.LENGTH_LONG);
        }
    }

    // go back to main page from receive
    public void onClickGoBackMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }

    //scan msg to color QR here
    public void onClickSend(View view){

        // jump to display displayMsg activity, show after QR convert to msg
        Intent intent = new Intent(this, displayMsg.class);
        startActivity(intent);

    }



}
