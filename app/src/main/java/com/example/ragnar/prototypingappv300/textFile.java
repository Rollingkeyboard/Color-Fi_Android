package com.example.ragnar.prototypingappv300;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class textFile extends AppCompatActivity {

    TextView txtView;
    CardView filechooser;
    private final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_file);
        filechooser = findViewById(R.id.sendfile_pick);
        txtView = findViewById(R.id.read_textview);
//        ScrollView scrollView = new ScrollView();
//        scrollView.addView(txtView);
        txtView.setMovementMethod(new ScrollingMovementMethod());
        filechooser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickFile();
            }
        });


    }

    private void PickFile(){
        Intent intent = new Intent();
        intent.setType("text/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Txt File"), REQUEST_CODE);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(resultCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null && data.getData() != null){
            final Uri uri = data != null ? data.getData() : null;
            InputStream inputStream = null;
            String str = "";
            StringBuffer buf = new StringBuffer();
            try {
                inputStream = getContentResolver().openInputStream(uri);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            if (inputStream!=null){
                try {
                    while((str = reader.readLine())!=null){
                        buf.append(str+"\n");
                    }
                } catch (IOException e) {
                    Toast.makeText(textFile.this,"No more line",Toast.LENGTH_SHORT).show();
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                    Toast.makeText(textFile.this,"Nothing to read",Toast.LENGTH_SHORT).show();
                }
                txtView.setText(buf.toString());
            }

        }
    }


    public void onClickGoBack(View view) {
        Intent intent = new Intent(this, sendKindInfo.class);
        startActivity(intent);
    }

    public void onClickGoSend(View view) {

        TextView messageView = findViewById(R.id.read_textview);
        String messageText = messageView .getText().toString();
        Intent intent=new Intent(this, translate.class);
        intent.putExtra(translate.EXTRA_MESSAGE, messageText);
        startActivity(intent);

    }
}
