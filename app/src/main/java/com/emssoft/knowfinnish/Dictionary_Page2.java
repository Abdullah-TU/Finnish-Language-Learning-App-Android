package com.emssoft.knowfinnish;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import Database.DatabaseHelper;
import Database.VideoDetails;

import static android.widget.Toast.LENGTH_SHORT;

public class Dictionary_Page2 extends AppCompatActivity {
    ImageView word_list, button8;

    TextView edit_show;


    Button btn1;
    EditText word, meaning;
    VideoDetails add=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Context context = this;
        setContentView(R.layout.dicpage2);
        add=new VideoDetails();
        word_list=(ImageView) findViewById(R.id.button5);





        word_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dictionary_Page2.this, Word_List.class));

            }
        });



        button8=(ImageView) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Quiz_Easy1.class);
                startActivity(intent);
            }

        });


        btn1 = (Button) findViewById(R.id.button13);
        word = (EditText) findViewById(R.id.editText3);
        meaning = (EditText) findViewById(R.id.editText4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add.word=word.getText().toString();
                add.meaning=meaning.getText().toString();
                Toast.makeText(getApplicationContext(), "Words added to the dictionary.",
                        Toast.LENGTH_LONG).show();
                DatabaseHelper db;
                db = new DatabaseHelper(Dictionary_Page2.this);
                db.createVideo(add, DatabaseHelper.TABLE_VIDEOS);
                db.closeDB();

            }
        });
    }

    }



