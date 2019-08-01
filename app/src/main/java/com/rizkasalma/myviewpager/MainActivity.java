package com.rizkasalma.myviewpager;

import android.R.anim;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ImageView imageViewJateng;
    TabLayout tabIndicator;
    int images[] = {R.drawable.banner12, R.drawable.banner12, R.drawable.banner2, R.drawable.banner12};
    MyCustomPagerAdapter myCustomPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewPager);

        imageViewJateng = findViewById(R.id.image1);
        myCustomPagerAdapter = new MyCustomPagerAdapter(MainActivity.this, images);
        viewPager.setAdapter(myCustomPagerAdapter);
        tabIndicator = findViewById(R.id.tab_indicator);
        tabIndicator.setupWithViewPager(viewPager);


        imageViewJateng.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), JatengActivity.class);
                startActivity(i);
            }
        });
    }
}