package com.example.ragnar.prototypingappv300;

import android.support.v7.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;

import java.io.IOException;

/**
 * Created by Administrator on 11/30/2017.
 */

public class sendImage extends AppCompatActivity {
    CardView selectImg;
    ImageView imageView;
    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_image);

        selectImg = findViewById(R.id.send_pickimg);
        imageView = findViewById(R.id.pick_imageView);
        selectImg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), REQUEST_CODE);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(resultCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null && data.getData() != null){
            Uri uri = data.getData();
            try{
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                imageView.setImageBitmap(bitmap);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

//
//    public void onClickPickImg(View view){
//
//    }
    public void onClickGoBack(View view){
        Intent intent = new Intent(this, sendKindInfo.class);
        startActivity(intent);
    }
    public void onClickGoSend(View view){
        // Missing sending pic


        Intent intent=new Intent(this, fileConvertToQR.class);
        startActivity(intent);
    }
}
