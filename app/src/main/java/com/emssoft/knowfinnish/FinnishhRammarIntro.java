package com.emssoft.knowfinnish;

import android.os.Bundle;
import android.view.Window;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mamun on 4/18/2018.
 */

public class FinnishhRammarIntro extends AppCompatActivity {


    TextView jr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.introgrammar);



        jr = (TextView) findViewById(R.id.textView5);


    }

}