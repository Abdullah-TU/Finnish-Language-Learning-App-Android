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

public class Consonantgrd extends AppCompatActivity {

    TextView jr;
    ImageView conso, typ1, typ2,typ3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.consonantgrde);

       conso= (ImageView) findViewById(R.id.alphabet);
        typ1= (ImageView) findViewById(R.id.type1);
        typ2= (ImageView) findViewById(R.id.type2);
        typ3= (ImageView) findViewById(R.id.type3);


        jr = (TextView) findViewById(R.id.textView5);

        conso.setImageResource(R.drawable.rsz_consofinal);

     typ1.setImageResource(R.drawable.rsz_type1final);
       typ2.setImageResource(R.drawable.rsz_type2final);
        typ3.setImageResource(R.drawable.rsz_type4final);




        conso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Consonantgrd.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.alphasoot);
                photoView.setImageResource(R.drawable.rsz_consofinal);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


      typ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Consonantgrd.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.alphasoot);
                photoView.setImageResource(R.drawable.rsz_type1final);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


        typ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Consonantgrd.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.alphasoot);
                photoView.setImageResource(R.drawable.rsz_type2final);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        typ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Consonantgrd.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.alphasoot);
                photoView.setImageResource(R.drawable.rsz_type4final);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
    }
}