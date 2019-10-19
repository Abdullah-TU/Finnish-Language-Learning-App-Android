package com.emssoft.knowfinnish;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;

/**
 * Created by Mamun on 4/18/2018.
 */

public class Scriptandortho extends AppCompatActivity {


    TextView jr;
    ImageView alphabets, audioal, learnm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.scriptandort);



        jr = (TextView) findViewById(R.id.textView5);
        alphabets =(ImageView) findViewById(R.id.alphabet);
        audioal = (ImageView) findViewById(R.id.audiobutton1);
        learnm = (ImageView) findViewById(R.id.addmoreword);



       alphabets.setImageResource(R.drawable.alphabetbig);


        final MediaPlayer mp = MediaPlayer.create(this, R.raw.finnishalphabets);
       audioal.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                if(mp.isPlaying()) {
                    mp.pause();


                } else {
                    mp.start();
                }
            }
        });





        alphabets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Scriptandortho.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.alphasoot);
                photoView.setImageResource(R.drawable.alphabetbig);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
       learnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Scriptandortho.this, Alphabet.class));

            }
        });

    }

}