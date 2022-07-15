package com.cs50.recycleview2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class secondPage extends AppCompatActivity {

    ImageView img;
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        img=(ImageView)findViewById(R.id.iv2);
        tv1=(TextView) findViewById(R.id.tV3);
        tv2=(TextView) findViewById(R.id.tV4);

        img.setImageResource(getIntent().getIntExtra("image",0));
        tv1.setText(getIntent().getStringExtra("header"));
        tv2.setText(getIntent().getStringExtra("desc"));

    }
}