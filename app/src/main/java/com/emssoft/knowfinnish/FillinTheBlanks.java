package com.emssoft.knowfinnish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class FillinTheBlanks extends AppCompatActivity {

    public List<String> suggestSource = new ArrayList<>();

    public GridViewAnswerAdapter answerAdapter;
    public GridViewSuggestAdapter suggestAdapter;

    public Button btnSubmit;

    public GridView gridViewAnswer,gridViewSuggest;

    public ImageView imgViewQuestion;

    int[] image_list={

            R.drawable.coffee,
            R.drawable.bird,
            R.drawable.coriander,
            R.drawable.burger,
            R.drawable.calculator,

            R.drawable.duck,
            R.drawable.banana,
            R.drawable.earth,
            R.drawable.jeans,
            R.drawable.hat,

            R.drawable.skiing,
            R.drawable.mouse,
            R.drawable.window,
            R.drawable.cake,
            R.drawable.kiwi,

            R.drawable.dog,
            R.drawable.cucumber,
            R.drawable.salmon,
            R.drawable.waterlily,
            R.drawable.hockey,

            R.drawable.milk,
            R.drawable.meat,
            R.drawable.liquid,
            R.drawable.livingroom,
            R.drawable.apple,

            R.drawable.doo,
            R.drawable.bean,
            R.drawable.potato,
            R.drawable.vaccine,
            R.drawable.rat,

            R.drawable.rose,
            R.drawable.hospital,
            R.drawable.salad,
            R.drawable.dictionary,
            R.drawable.onion,

            R.drawable.tomato,
            R.drawable.tuna,
            R.drawable.tulip,
            R.drawable.garlic,
            R.drawable.watermelon




    };

    public char[] answer;

    String correct_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fillintheblanks);

        //Init View
        initView();


    }

    private void initView() {
        gridViewAnswer = (GridView)findViewById(R.id.gridViewAnswer);
        gridViewSuggest = (GridView)findViewById(R.id.gridViewSuggest);

        imgViewQuestion = (ImageView)findViewById(R.id.imgLogo);

        //Add SetupList Here
        setupList();

        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result="";
                for(int i=0;i< Common.user_submit_answer.length;i++)
                    result+=String.valueOf(Common.user_submit_answer[i]);
                if(result.equals(correct_answer))
                {

                    Common.count = 0;
                    Common.user_submit_answer = new char[correct_answer.length()];

                    //Set Adapter
                    GridViewAnswerAdapter answerAdapter = new GridViewAnswerAdapter(setupNullList(),getApplicationContext());
                    gridViewAnswer.setAdapter(answerAdapter);
                    answerAdapter.notifyDataSetChanged();

                    GridViewSuggestAdapter suggestAdapter = new GridViewSuggestAdapter(suggestSource,getApplicationContext(),FillinTheBlanks.this);
                    gridViewSuggest.setAdapter(suggestAdapter);
                    suggestAdapter.notifyDataSetChanged();

                    setupList();


                    new SweetAlertDialog(FillinTheBlanks.this, SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("Correct Answer!")
                            .setConfirmText("Next")

                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismiss();


                                }
                            })
                            .show();

                    //Reset

                }
                else
                {
                    new SweetAlertDialog(FillinTheBlanks.this, SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("Incorrect!")
                            .setConfirmText("OK")
                            .setContentText("Correct Answer : "+ correct_answer)
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismiss();


                                }
                            })
                            .show();
                }
            }
        });
    }

    private void setupList() {
        //Random logo
        Random random = new Random();
        int imageSelected = image_list[random.nextInt(image_list.length)];
        imgViewQuestion.setImageResource(imageSelected);

        correct_answer = getResources().getResourceName(imageSelected);
        correct_answer = correct_answer.substring(correct_answer.lastIndexOf("/")+1);

        answer = correct_answer.toCharArray();

        Common.user_submit_answer = new char[answer.length];

        //Add Answer character to List
        suggestSource.clear();
        for(char item:answer)
        {
            //Add logo name to list
            suggestSource.add(String.valueOf(item));
        }

        //Random add some character to list
        for(int i = answer.length;i<answer.length*2;i++)
            suggestSource.add(Common.alphabet_character[random.nextInt(Common.alphabet_character.length)]);

        //Sort random
        Collections.shuffle(suggestSource);

        //Set for GridView
        answerAdapter = new GridViewAnswerAdapter(setupNullList(),this);
        suggestAdapter = new GridViewSuggestAdapter(suggestSource,this,this);

        answerAdapter.notifyDataSetChanged();
        suggestAdapter.notifyDataSetChanged();

        gridViewSuggest.setAdapter(suggestAdapter);
        gridViewAnswer.setAdapter(answerAdapter);


    }

    private char[] setupNullList() {
            char result[] = new char[answer.length];
            for(int i=0;i<answer.length;i++)
                result[i]=' ';
        return result;
    }
}
