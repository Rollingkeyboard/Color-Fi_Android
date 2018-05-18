package com.example.ragnar.prototypingappv300;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 11/30/2017.
 */

public class SlideAdapter extends PagerAdapter{
    Context context;
    LayoutInflater inflater;
    Button btn_goMain;

    public int[] lst_images = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4
    };

    public String[] lst_title = {
            "Performance",
            "Security",
            "Usability",
            "Localization"
    };
    public String[] lst_description = {
            "Using color-bit to transfer files or key are faster than using Bluetooth 2.0",
            "Only receiver camera can read and decode these color frame, so it avoid during wireless data transmission files or can be intercept or steal",
            "Using one device’s camera and another device’s screen",
            "For security season, quickly transfer files or key only in private room. It means this application is a short distance, quick transmission, and high security solution for sharing files or key"
    };
    public int[] lst_backgroundcolor = {
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,59,89),
            Color.rgb(1,188,212)
    };

    public SlideAdapter(Context context){
        this.context = context;
    }


    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container,false);
        LinearLayout layoutslide = view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = view.findViewById(R.id.slideimg);
        TextView txttitle = view.findViewById(R.id.txttitle);
        TextView description = view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        if (position == lst_title.length){


        }
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
