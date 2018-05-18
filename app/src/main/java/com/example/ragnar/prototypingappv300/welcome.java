package com.example.ragnar.prototypingappv300;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 11/30/2017.
 */

public class welcome extends AppCompatActivity {
    private ViewPager viewPager;
    private SlideAdapter myadapter;
    Button btn_goMain;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        viewPager = findViewById(R.id.viewpager);
        myadapter = new SlideAdapter(this);
        viewPager.setAdapter(myadapter);
//        btn_goMain = findViewById(R.id.go_main);
//        btn_goMain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(this,MainActivity.class);
//                startActivity(intent);
//            }
//        });
    }
    public void GoBackMain(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);

        startActivity(intent);

    }
}
