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

public class Tenses extends AppCompatActivity {


    TextView jr;
    ImageView conso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.tenses);

        conso= (ImageView) findViewById(R.id.pre2);

        jr = (TextView) findViewById(R.id.textView5);
        conso.setImageResource(R.drawable.tensuu);




        conso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Tenses.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.alphasoot);
                photoView.setImageResource(R.drawable.tensuu);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
    }

}