package com.emssoft.knowfinnish;
import android.os.Bundle;
import android.view.Window;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class About extends AppCompatActivity {


    TextView jr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.about);



        jr = (TextView) findViewById(R.id.textView5);


    }

}