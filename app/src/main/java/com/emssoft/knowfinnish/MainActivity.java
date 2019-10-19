package com.emssoft.knowfinnish;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.creativityapps.gmailbackgroundlibrary.BackgroundMail;

public class MainActivity extends AppCompatActivity {
    ImageView btn1, btn2, btn4, sentence, gameact, wordbnk ;

    LinearLayout relasafe;
    Animation uptodown,downtoup;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);



        relasafe = (LinearLayout) findViewById(R.id.relativesafe);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);

        relasafe.setAnimation(downtoup);


        btn1 = (ImageView) findViewById(R.id.button);

        btn2 = (ImageView) findViewById(R.id.button2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Dictionary_Page2.class);
                startActivity(myIntent);


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, GrammarActivity.class);
                startActivity(myIntent);


            }
        });


        btn4 = (ImageView) findViewById(R.id.button4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, VocabularyActivity.class);
                startActivity(myIntent);

            }
        });

        sentence = (ImageView) findViewById(R.id.sentenceButton);

        sentence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, Tipsandtrics.class);
                startActivity(myIntent);


            }
        });


        gameact = (ImageView) findViewById(R.id.game);

        gameact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Quizy.class);
                startActivity(myIntent);


            }
        });

        wordbnk = (ImageView) findViewById(R.id.wordbankbutton);

        wordbnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, DicMainAc.class);
                startActivity(myIntent);


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.alphabet_menu) {

            Intent intent = new Intent(MainActivity.this, Scriptandortho.class);
            startActivity(intent);

            return true;
        }else if(id == R.id.bookmark_menu) {
            Intent Email = new Intent(Intent.ACTION_SEND);
            Email.setType("text/email");
            Email.putExtra(Intent.EXTRA_EMAIL, new String[] { "knowfinnish@gmail.com" });
            Email.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
            Email.putExtra(Intent.EXTRA_TEXT, "Dear ...," + "");
            startActivity(Intent.createChooser(Email, "Send Feedback:"));
            return true;
        }
        else if(id == R.id.rate_menu) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=" + getPackageName())));
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
            }
            //startActivity(rateIntent);
            //  https://stackoverflow.com/questions/12998268/how-to-implement-rate-us-in-android
            return true;
        }else if(id == R.id.fb_menu) {
            Intent rateIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/690828807941108/" ));
            startActivity(rateIntent);

            return true;
        }else if(id == R.id.share_menu) {

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Know Finnish");
            shareIntent.putExtra(Intent.EXTRA_TEXT, "This is great app. You should try it out!");
            startActivity(Intent.createChooser(shareIntent,"Share Via: "));

            return true;

        }else if(id == R.id.about_menu) {

            Intent intent = new Intent(MainActivity.this, About.class);
            startActivity(intent);

            return true;
        }

        return super.onOptionsItemSelected(item);



    }


}
