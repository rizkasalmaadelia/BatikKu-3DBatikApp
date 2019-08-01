package com.rizkasalma.myviewpager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class JatengActivity extends AppCompatActivity {
    ImageButton buttonBack;
    ImageView daerah1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jateng);

        buttonBack = findViewById(R.id.buttonBack);
        daerah1 = findViewById(R.id.daerah1);

        buttonBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        daerah1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),BatikActivity.class);
                startActivity(i);
            }
        });

    }
}
