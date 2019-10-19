package com.emssoft.knowfinnish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Quizy extends AppCompatActivity {

    ImageView frt, fd, bang, sri;
    LinearLayout rela,relasafe;
    Animation uptodown,downtoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.quizy);

        rela = ( LinearLayout) findViewById(R.id.lin1);
        relasafe = ( LinearLayout) findViewById(R.id.lin2);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        rela.setAnimation(uptodown);
        relasafe.setAnimation(downtoup);

        frt= (ImageView) findViewById(R.id.alpha);
        fd= (ImageView) findViewById(R.id.number);

        bang= (ImageView) findViewById(R.id.aslpha);
        sri= (ImageView) findViewById(R.id.numsber);

        frt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quizy.this, Writingmain.class));
            }
        });

        fd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quizy.this, FillinTheBlanks.class));
            }
        });

      bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quizy.this, ImagetofinnishActivity.class));
            }
        });

      sri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quizy.this, Texttotext.class));
            }
        });
    }

}
