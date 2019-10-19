package com.emssoft.knowfinnish;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;

/**
 * Created by Mamun on 4/18/2018.
 */

public class Pronouns extends AppCompatActivity {

    ImageView typ1, typ2,typ3;
    TextView jr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.pronoun);


        typ1= (ImageView) findViewById(R.id.pre1);
        typ2= (ImageView) findViewById(R.id.pre2);
        typ3= (ImageView) findViewById(R.id.pre4);

        jr = (TextView) findViewById(R.id.textView5);



        typ1.setImageResource(R.drawable.pro111);
        typ2.setImageResource(R.drawable.pro222);
        typ3.setImageResource(R.drawable.pro333);







        typ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Pronouns.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.alphasoot);
                photoView.setImageResource(R.drawable.pro111);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


        typ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Pronouns.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.alphasoot);
                photoView.setImageResource(R.drawable.pro222);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        typ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Pronouns.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.alphasoot);
                photoView.setImageResource(R.drawable.pro333);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
    }

}