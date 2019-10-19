package com.emssoft.knowfinnish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

import Database.DatabaseHelper;
import Database.VideoDetails;

public class Quiz_Easy1 extends AppCompatActivity {
    DatabaseHelper db;
    VideoDetails search_word1,search_word2,search_word3;
    TextView txt_question,score ;
    CheckBox checkBox1,checkBox2,checkBox3;

    public static int point=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy1);
        point=0;
        txt_question=(TextView)findViewById(R.id.textView16);
        checkBox1=(CheckBox)findViewById(R.id.checkBox);
        checkBox2=(CheckBox)findViewById(R.id.checkBox2);
        checkBox3=(CheckBox)findViewById(R.id.checkBox3);
        score=(TextView)findViewById(R.id.textView4);
        get_qustion();
    }

    void get_qustion() {
        score.setText(point+"");
        db = new DatabaseHelper(Quiz_Easy1.this);
        search_word1=new VideoDetails();
        search_word2=new VideoDetails();
        search_word3=new VideoDetails();
        list2 = new ArrayList<>();
        for (int j=0; j<db.getCountForTable(DatabaseHelper.TABLE_VIDEOS); j++) {
            list2.add(new Integer(j));
        }
        Collections.shuffle(list2);

        search_word1=db.getAllVideoDetailsFromTable(DatabaseHelper.TABLE_VIDEOS).get(list2.get(0));
        search_word2=db.getAllVideoDetailsFromTable(DatabaseHelper.TABLE_VIDEOS).get(list2.get(1));
        search_word3=db.getAllVideoDetailsFromTable(DatabaseHelper.TABLE_VIDEOS).get(list2.get(2));


        db.closeDB();
        txt_question.setText("  " + search_word1.meaning + "  ");
        random();
    }

    ArrayList<Integer> list2;




    public void random() {

        list = new ArrayList<>();
        for (int j=0; j<3; j++) {
            list.add(new Integer(j));
        }
        Collections.shuffle(list);
        String[] data={search_word1.word,search_word2.word,search_word3.word};
        checkBox1.setText(data[list.get(0)]);
        checkBox2.setText(data[list.get(1)]);
        checkBox3.setText(data[list.get(2)]);
        checkBox1.setChecked(false);
        checkBox2.setChecked(false);
        checkBox3.setChecked(false);
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox1.getText().toString().equals(search_word1.word)){
                    point++;
                }else {
                    Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_LONG ).show();
                }
                get_qustion();
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox2.getText().toString().equals(search_word1.word)){
                    point++;
                }else {
                    Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_LONG ).show();
                }
                get_qustion();
            }
        });
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox3.getText().toString().equals(search_word1.word)) {
                    point++;
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_LONG).show();
                }
                get_qustion();
            }
        });
    }
    ArrayList<Integer> list;
}
