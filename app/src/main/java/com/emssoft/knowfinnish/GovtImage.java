package com.emssoft.knowfinnish;

/**
 * Created by Mamun on 6/17/2018.
 */

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

@SuppressLint("NewApi")
public class GovtImage extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.govtimage);


    }

}
