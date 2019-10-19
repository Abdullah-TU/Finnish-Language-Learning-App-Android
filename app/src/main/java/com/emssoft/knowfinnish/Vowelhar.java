package com.emssoft.knowfinnish;

import android.os.Bundle;
import android.view.Window;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mamun on 4/18/2018.
 */

public class Vowelhar extends AppCompatActivity {


    TextView jr, rr;
    ImageView mm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.vowelhar);



        jr = (TextView) findViewById(R.id.textView5);
        rr = (TextView) findViewById(R.id.textView6);
        mm= (ImageView) findViewById(R.id.alphabet);


    }

}