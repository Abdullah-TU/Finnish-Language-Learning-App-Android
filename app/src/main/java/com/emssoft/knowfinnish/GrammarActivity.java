package com.emssoft.knowfinnish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Mamun on 4/18/2018.
 */

public class GrammarActivity extends AppCompatActivity {

    ImageView finnishhrammarintro, scriptandortho, vowelhar, consonantgrd, prepostion, casess,  pronouns,adjectives,verb, tenses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.finnishgr);



        finnishhrammarintro= (ImageView) findViewById(R.id.finnishhrammarintro);
        scriptandortho= (ImageView) findViewById(R.id.scriptandortho);
        vowelhar= (ImageView) findViewById(R.id.vowelhar);
        consonantgrd= (ImageView) findViewById(R.id.consonantgrd);
        prepostion= (ImageView) findViewById(R.id.prepostion);
        casess= (ImageView) findViewById(R.id.casess);
        pronouns= (ImageView) findViewById(R.id.pronouns);
        adjectives= (ImageView) findViewById(R.id.adjectives);
        verb= (ImageView) findViewById(R.id.verb);
        tenses= (ImageView) findViewById(R.id.tenses);







        finnishhrammarintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GrammarActivity.this, FinnishhRammarIntro.class));
            }
        });

        scriptandortho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GrammarActivity.this, Scriptandortho.class));
            }
        });
        vowelhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GrammarActivity.this, Vowelhar.class));
            }
        });

        consonantgrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GrammarActivity.this, Consonantgrd.class));
            }
        });

        prepostion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GrammarActivity.this, Prepostion.class));
            }
        });

        casess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GrammarActivity.this, Casess.class));
            }
        });

        pronouns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GrammarActivity.this, Pronouns.class));
            }
        });

        adjectives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GrammarActivity.this, Adjectives.class));
            }
        });

        verb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GrammarActivity.this, Verb.class));
            }
        });

        tenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GrammarActivity.this, Tenses.class));
            }
        });
    }

}
