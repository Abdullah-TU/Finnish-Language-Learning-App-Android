package com.emssoft.knowfinnish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mamun on 4/6/2018.
 */

public class DetailsItem extends AppCompatActivity {

    private TextView txtName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itemlistview);




            txtName = (TextView) findViewById(R.id.txtName);

        txtName.setText(getIntent().getExtras().getString("description"));



    }
}

