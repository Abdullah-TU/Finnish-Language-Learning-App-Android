package com.emssoft.knowfinnish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Tipsandtrics extends AppCompatActivity {

    ImageView frt, fd;
    Animation uptodown,downtoup;
    RelativeLayout rela;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tipsandtricks);


        rela = (RelativeLayout) findViewById(R.id.linearLayouttipsandtrcis);

        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);

        rela.setAnimation(downtoup);

        frt= (ImageView) findViewById(R.id.alpha);
        fd= (ImageView) findViewById(R.id.number);

        frt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tipsandtrics.this, SlideActivity.class));
            }
        });

        fd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tipsandtrics.this, Links.class));
            }
        });
    }

}
