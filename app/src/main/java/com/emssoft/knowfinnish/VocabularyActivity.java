package com.emssoft.knowfinnish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Mamun on 4/10/2018.
 */

public class VocabularyActivity  extends AppCompatActivity {

    ImageView  frt, rlgn, flor, animl, alpha, bdy, chemitry, clr, clth, cmptr, edu, emo,env,fmly,food,govt,healt,hme, math,natio,numb,
            phyc,scince,spce,tand,trans, sprts,biol,commu,langu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.vocabulary);




        frt= (ImageView) findViewById(R.id.fruits);
        frt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Fruits.class));
            }
        });


       rlgn= (ImageView) findViewById(R.id.religin);
       rlgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Religion.class));
            }
        });


       flor= (ImageView) findViewById(R.id.flower);
        flor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Flower.class));
            }
        });


        animl= (ImageView) findViewById(R.id.animal);
        animl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Animal.class));
            }
        });


        alpha= (ImageView) findViewById(R.id.alphabet);
        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Alphabet.class));
            }
        });



        bdy= (ImageView) findViewById(R.id.body);
        bdy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Body.class));
            }
        });


        chemitry= (ImageView) findViewById(R.id.chemistry);
        chemitry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Chemistry.class));
            }
        });


       cmptr= (ImageView) findViewById(R.id.computer);
       cmptr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Computer.class));
            }
        });


       edu= (ImageView) findViewById(R.id.education);
     edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Education.class));
            }
        });



        clr= (ImageView) findViewById(R.id.color);
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Color.class));
            }
        });


        clth= (ImageView) findViewById(R.id.cloth);
        clth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Clothes.class));
            }
        });



       emo= (ImageView) findViewById(R.id.emotions);
        emo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Emotions.class));
            }
        });



        env= (ImageView) findViewById(R.id.environment);
        env.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Environment.class));
            }
        });


        fmly= (ImageView) findViewById(R.id.family);
        fmly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Family.class));
            }
        });


        food= (ImageView) findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Food.class));
            }
        });



        govt= (ImageView) findViewById(R.id.govt);
        govt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Government.class));
            }
        });

       healt= (ImageView) findViewById(R.id.health);
        healt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Health.class));
            }
        });


       hme= (ImageView) findViewById(R.id.home);
        hme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Home.class));
            }
        });


       math= (ImageView) findViewById(R.id.math);
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Math.class));
            }
        });

        natio= (ImageView) findViewById(R.id.nations);
      natio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Nations.class));
            }
        });

        numb= (ImageView) findViewById(R.id.number);
       numb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Numbers.class));
            }
        });




       phyc= (ImageView) findViewById(R.id.physics);
        phyc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Physics.class));
            }
        });


        scince= (ImageView) findViewById(R.id.science);
        scince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Science.class));
            }
        });



        spce= (ImageView) findViewById(R.id.space);
        spce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Space.class));
            }
        });


        tand= (ImageView) findViewById(R.id.time);
        tand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Timeandate.class));
            }
        });



        trans= (ImageView) findViewById(R.id.transport);
        trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Transport.class));
            }
        });



        sprts= (ImageView) findViewById(R.id.sports);
        sprts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Sports.class));
            }
        });



        commu= (ImageView) findViewById(R.id.communication);
        commu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Communication.class));
            }
        });

       biol= (ImageView) findViewById(R.id.biology);
        biol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Biology.class));
            }
        });


       langu= (ImageView) findViewById(R.id.language);
        langu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VocabularyActivity.this, Languages.class));
            }
        });

    }

}