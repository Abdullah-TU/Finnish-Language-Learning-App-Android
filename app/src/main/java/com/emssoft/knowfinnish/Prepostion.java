package com.emssoft.knowfinnish;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

/**
 * Created by Mamun on 4/18/2018.
 */

public class Prepostion extends AppCompatActivity {


    TextView jr;
    ImageView conso, pr1, pr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.prepostions);



        jr = (TextView) findViewById(R.id.textView5);
        pr1= (ImageView) findViewById(R.id.pre1);
       pr2= (ImageView) findViewById(R.id.pre2);

      pr1.setImageResource(R.drawable.preposition1);

      pr2.setImageResource(R.drawable.preposition2);


      pr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Prepostion.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.alphasoot);
                photoView.setImageResource(R.drawable.preposition1);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


       pr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Prepostion.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.alphasoot);
                photoView.setImageResource(R.drawable.preposition2);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


    }

}