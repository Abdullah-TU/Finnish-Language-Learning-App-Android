package com.emssoft.knowfinnish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MoreInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);



        TextView textView4=(TextView)findViewById(R.id.neeview);





        textView4.setText(getIntent().getExtras().getString("description"));

}
}
