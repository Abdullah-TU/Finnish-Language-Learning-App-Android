package com.emssoft.knowfinnish;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import cn.pedant.SweetAlert.SweetAlertDialog;



/**
 * Created by Mamun on 7/1/2018.
 */

public class ImagetofinnishActivity extends AppCompatActivity {
    Button ans1, ans2, ans3, ans4;
    TextView questionCountLabel,score;
    private int mScore =0;
    int currentPosition = 0;
    ProgressBar mProgressBar;
    List <Statemodel> list;
    Random r;
    int turn = 1;
    ImageView flags;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.imagetofinnish_main);
        r =new Random();


        flags =(ImageView) findViewById(R.id.imageView1);

        ans1=(Button) findViewById(R.id.button9);
        ans2=(Button) findViewById(R.id.button10);
        ans3 =(Button) findViewById(R.id.button11);
        ans4=(Button) findViewById(R.id.button12);
        score =(TextView) findViewById(R.id.score);
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
        questionCountLabel = findViewById(R.id.noQuestion);


        score.setText("Score: " +mScore+" /40  " );

        final int[] count = {0};
        mProgressBar.setMax(40);
        mProgressBar.setProgress(0);

        list= new ArrayList<>();
        for(int i=0; i<new Databasee().answers.length;i++) {
            list.add(new Statemodel(new Databasee().answers[i], new Databasee().flags[i]));

        }


        Collections.shuffle(list);
        newQuestion(turn);

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (ans1.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                   
                    new SweetAlertDialog(ImagetofinnishActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("Good job!")
                            .setContentText("Right Asswer")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sweetAlertDialog) {

                                    sweetAlertDialog.dismiss();
                                }
                            })
                            .show();



                    if(turn<list.size()){
                        turn++;
                    newQuestion(turn);

                        if(count[0] <40){
                            count[0]++;
                            mProgressBar.setProgress(count[0]);
                        }
                        mScore++;
                        score.setText("Score: " +mScore+" /40  " );

                    }else {
                        GameOver();

                    }

                }else{



                  
                    new SweetAlertDialog(ImagetofinnishActivity.this, SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("Wrong Answer")
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismiss();


                                }
                            })
                            .show();

                    if (turn<list.size()){
                        turn++;
                        newQuestion(turn);

                        if(count[0] <40){
                            count[0]++;
                            mProgressBar.setProgress(count[0]);
                        }

                    }else {
                        GameOver();


                    }
                }
            }
        });




        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (ans2.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){





                    new SweetAlertDialog(ImagetofinnishActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("Good job!")
                            .setContentText("Right Answer")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sweetAlertDialog) {

                                    sweetAlertDialog.dismiss();
                                }
                            })
                            .show();



                    if(turn<list.size()){
                        turn++;
                        newQuestion(turn);

                        if(count[0] <40){
                            count[0]++;
                            mProgressBar.setProgress(count[0]);
                        }
                        mScore++;
                        score.setText("Score: " +mScore+" /40  " );


                    }else {
                        GameOver();


                    }

                }else{


                    new SweetAlertDialog(ImagetofinnishActivity.this, SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("Wrong Answer")
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismiss();


                                }
                            })
                            .show();

                    if (turn<list.size()){
                        turn++;
                        newQuestion(turn);

                        if(count[0] <40){
                            count[0]++;
                            mProgressBar.setProgress(count[0]);
                        }

                    }else {
                        GameOver();

                    }
                }
            }
        });


        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (ans3.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){

                    new SweetAlertDialog(ImagetofinnishActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("Good job!")
                            .setContentText("Right Answer")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sweetAlertDialog) {

                                    sweetAlertDialog.dismiss();
                                }
                            })
                            .show();


                    if(turn<list.size()){
                        turn++;
                        newQuestion(turn);


                        if(count[0] <40){
                            count[0]++;
                            mProgressBar.setProgress(count[0]);
                        }
                        mScore++;
                        score.setText("Score: " +mScore+" /40  " );

                    }else {
                        GameOver();

                    }

                }else{



                    new SweetAlertDialog(ImagetofinnishActivity.this, SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("Wrong Answer")
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismiss();


                                }
                            })
                            .show();

                    if (turn<list.size()){
                        turn++;
                        newQuestion(turn);


                        if(count[0] <40){
                            count[0]++;
                            mProgressBar.setProgress(count[0]);
                        }

                    }else {
                        GameOver();


                    }
                }
            }
        });

        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (ans4.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){




                    new SweetAlertDialog(ImagetofinnishActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("Good job!")
                            .setContentText("Right Asswer")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sweetAlertDialog) {

                                    sweetAlertDialog.dismiss();
                                }
                            })
                            .show();


                    if(turn<list.size()){
                        turn++;
                        newQuestion(turn);


                        if(count[0] <40){
                            count[0]++;
                            mProgressBar.setProgress(count[0]);
                        }
                        mScore++;
                        score.setText("Score: " +mScore+" /40  " );


                    }else {
                        GameOver();
                    }

                }else{

                    new SweetAlertDialog(ImagetofinnishActivity.this, SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("Wrong Answer")
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismiss();


                                }
                            })
                            .show();

                    if (turn<list.size()){
                        turn++;
                        newQuestion(turn);


                        if(count[0] <40){
                            count[0]++;
                            mProgressBar.setProgress(count[0]);
                        }

                    }else{
                        GameOver();


                    }
                }
            }
        });
    }




    private void newQuestion(int number){
        flags.setImageResource(list.get(number -1).getImage());


        int correct_answer = r.nextInt(4)+1;

        int firstButton =number -1;
        int secondButton;
        int thirdButton;
        int fourthButton;;

        switch(correct_answer){
            case 1:
                ans1.setText(list.get(firstButton).getName());

                do {
                    secondButton = r.nextInt(list.size());
                } while (secondButton == firstButton);
                do {
                    thirdButton = r.nextInt(list.size());
                }while (thirdButton==firstButton || thirdButton ==secondButton);
                do {
                    fourthButton = r.nextInt(list.size());
                }
                while (fourthButton==firstButton|| fourthButton == secondButton || fourthButton == thirdButton );

                ans2.setText(list.get(secondButton).getName());
                ans3.setText(list.get(thirdButton).getName());
                ans4.setText(list.get(fourthButton).getName());

                break;
            case 2:
                ans2.setText(list.get(firstButton).getName());

                do {
                    secondButton = r.nextInt(list.size());
                } while (secondButton == firstButton);
                do {
                    thirdButton = r.nextInt(list.size());
                }while (thirdButton==firstButton || thirdButton ==secondButton);
                do {
                    fourthButton = r.nextInt(list.size());
                }
                while (fourthButton==firstButton|| fourthButton == secondButton || fourthButton == thirdButton );

                ans3.setText(list.get(secondButton).getName());
                ans1.setText(list.get(thirdButton).getName());
                ans4.setText(list.get(fourthButton).getName());

                break;
            case 3:
                ans3.setText(list.get(firstButton).getName());

                do {
                    secondButton = r.nextInt(list.size());
                } while (secondButton == firstButton);
                do {
                    thirdButton = r.nextInt(list.size());
                }while (thirdButton==firstButton || thirdButton ==secondButton);
                do {
                    fourthButton = r.nextInt(list.size());
                }
                while (fourthButton==firstButton|| fourthButton == secondButton || fourthButton == thirdButton );

                ans2.setText(list.get(secondButton).getName());
                ans1.setText(list.get(thirdButton).getName());
                ans4.setText(list.get(fourthButton).getName());

                break;
            case 4:
                ans4.setText(list.get(firstButton).getName());

                do {
                    secondButton = r.nextInt(list.size());
                } while (secondButton == firstButton);
                do {
                    thirdButton = r.nextInt(list.size());
                }while (thirdButton==firstButton || thirdButton ==secondButton);
                do {
                    fourthButton = r.nextInt(list.size());
                }
                while (fourthButton==firstButton|| fourthButton == secondButton || fourthButton == thirdButton );

                ans2.setText(list.get(secondButton).getName());
                ans3.setText(list.get(thirdButton).getName());
                ans1.setText(list.get(fourthButton).getName());
                break;
        }
    }



    private void GameOver() { AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ImagetofinnishActivity.this, R.style.DialogeTheme);
        alertDialogBuilder
                .setTitle("Total Score")
                .setIcon(R.drawable.webribon)
                .setCancelable (false)
                .setMessage("Your score is : " + mScore +"  out of 40 ")

                .setPositiveButton(
                        "Restart",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),ImagetofinnishActivity.class));

                            }
                        })

                .setNegativeButton("Close",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                System.exit(0);
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();


        alertDialog.show();


    }



}

