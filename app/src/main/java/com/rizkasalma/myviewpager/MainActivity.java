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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ImageView imageViewJateng;
    ImageView imageViewJabar;
    ImageView imageViewJatim;
    ImageView see_all;
    TabLayout tabIndicator;
    ImageButton buttonBaju;
    ImageButton buttonKemeja;
    ImageButton buttonDress;
    ImageButton buttonCelana;

    int images[] = {R.drawable.mostfixbanner1, R.drawable.fixbanner2, R.drawable.fixbanner3};
    MyCustomPagerAdapter myCustomPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewPager);

        imageViewJateng = findViewById(R.id.image1);
        imageViewJatim = findViewById(R.id.image2);
        imageViewJabar = findViewById(R.id.image3);
        see_all= findViewById(R.id.image4);
        buttonBaju = findViewById(R.id.buttonBaju);
        buttonKemeja = findViewById(R.id.buttonKemeja);
        buttonDress = findViewById(R.id.buttonDress);
        buttonCelana = findViewById(R.id.buttonCelana);


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
        imageViewJatim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), JatengActivity.class);
                startActivity(i);
            }
        });
        buttonKemeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), JatengActivity.class);
                startActivity(i);
            }
        });
        imageViewJabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), JatengActivity.class);
                startActivity(i);
            }
        });
        see_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SeeAllActivity.class);
                startActivity(i);
            }
        });
        buttonBaju.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), KaosActivity.class);
                startActivity(i);
            }
        });
        buttonDress.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), DressActivity.class);
                startActivity(i);
            }
        });
        buttonCelana.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), CelanaActivity.class);
                startActivity(i);
            }
        });
    }
}