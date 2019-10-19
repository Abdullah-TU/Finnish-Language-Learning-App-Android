package com.emssoft.knowfinnish;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class Texttotext extends AppCompatActivity {

    Button answer1,answer2,answer3,answer4;
    TextView question, score;
    private int mMaxmQues =0;
    private Questions mQuestion = new Questions();
    private String mAnswer;
    private int mScore =0;
    private int mQuestionsLentgth = mQuestion.mQuestion.length;
    Random r;
    ProgressBar mProgressBar;
    int currentPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.texttotext);
        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);

        answer2 = (Button) findViewById(R.id.answer2);

        answer3 = (Button) findViewById(R.id.answer3);

        answer4 = (Button) findViewById(R.id.answer4);
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);

        question = (TextView) findViewById(R.id.question);
        score = (TextView) findViewById(R.id.score);

        score.setText("Score: " +mScore+" /40  " );

        updateQuestion(r.nextInt(mQuestionsLentgth));
        final int[] count = {0};
        mProgressBar.setMax(40);
        mProgressBar.setProgress(0);
        

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText() == mAnswer){

                    new SweetAlertDialog(Texttotext.this, SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("Good job!")
                            .setContentText("Right Asswer")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sweetAlertDialog) {

                                    sweetAlertDialog.dismiss();
                                }
                            })
                            .show();
                    if(count[0] <40){
                        count[0]++;
                        mProgressBar.setProgress(count[0]);
                    }
                    mScore++;


                    score.setText("Score: " +mScore+" /40  " );


                    updateQuestion(r.nextInt(mQuestionsLentgth));
                }else {
                    new SweetAlertDialog(Texttotext.this, SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("Wrong Answer")
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismiss();


                                }
                            })
                            .show();
                    updateQuestion(r.nextInt(mQuestionsLentgth));

                    if(count[0] <40){
                        count[0]++;
                        mProgressBar.setProgress(count[0]);
                    }
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText() == mAnswer){
                        new SweetAlertDialog(Texttotext.this, SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("Good job!")
                            .setContentText("Right Asswer")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sweetAlertDialog) {

                                    sweetAlertDialog.dismiss();
                                }
                            })
                            .show();
                    mScore++;
                    score.setText("Score: " +mScore+" /40  " );

                    if(count[0] <40){
                        count[0]++;
                        mProgressBar.setProgress(count[0]);
                    }
                    updateQuestion(r.nextInt(mQuestionsLentgth));
                    reloadQuizQuestions();
                }else {
                    new SweetAlertDialog(Texttotext.this, SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("Wrong Answer")
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismiss();


                                }
                            })
                            .show();
                    updateQuestion(r.nextInt(mQuestionsLentgth));
                    reloadQuizQuestions();
                    if(count[0] <40){
                        count[0]++;
                        mProgressBar.setProgress(count[0]);
                    }
            }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3.getText() == mAnswer){
                    new SweetAlertDialog(Texttotext.this, SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("Good job!")
                            .setContentText("Right Asswer")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sweetAlertDialog) {

                                    sweetAlertDialog.dismiss();
                                }
                            })
                            .show();
                    mScore++;
                    score.setText("Score: " +mScore+" /40  " );

                    if(count[0] <40){
                        count[0]++;
                        mProgressBar.setProgress(count[0]);
                    }
                    updateQuestion(r.nextInt(mQuestionsLentgth));
                    reloadQuizQuestions();
                }else {
                    new SweetAlertDialog(Texttotext.this, SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("Wrong Answer")
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismiss();


                                }
                            })
                            .show();
                    updateQuestion(r.nextInt(mQuestionsLentgth));
                    reloadQuizQuestions();
                    if(count[0] <40){
                        count[0]++;
                        mProgressBar.setProgress(count[0]);
                    }
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4.getText() == mAnswer){
                    new SweetAlertDialog(Texttotext.this, SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("Good job!")
                            .setContentText("Right Asswer")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sweetAlertDialog) {

                                    sweetAlertDialog.dismiss();
                                }
                            })
                            .show();
                    mScore++;
                    score.setText("Score: " +mScore+" /40  " );

                    if(count[0] <40){
                        count[0]++;
                        mProgressBar.setProgress(count[0]);
                    }
                    updateQuestion(r.nextInt(mQuestionsLentgth));
                    reloadQuizQuestions();
                }else {
                    new SweetAlertDialog(Texttotext.this, SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("Wrong Answer")
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismiss();


                                }
                            })
                            .show();
                    updateQuestion(r.nextInt(mQuestionsLentgth));
                    reloadQuizQuestions();
                    if(count[0] <40){
                        count[0]++;
                        mProgressBar.setProgress(count[0]);
                    }

                }
            }
        });
    }



    private void reloadQuizQuestions() {
        mMaxmQues = (mMaxmQues + 1) % mQuestionsLentgth;


        if (mMaxmQues == 0) {



            GameOver();
        }
    }

    private void GameOver() { AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Texttotext.this, R.style.DialogeTheme);
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
                                startActivity(new Intent(getApplicationContext(),Texttotext.class));

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

    private  void updateQuestion(int num){
      question.setText(mQuestion.getQuestion(num));
        answer1.setText(mQuestion.getChoices1(num));
       answer2.setText(mQuestion.getChoices2(num));
       answer3.setText(mQuestion.getChoices3(num));
       answer4.setText(mQuestion.getChoices4(num));
        mAnswer = mQuestion.getCorrectAnswer(num);

    }
}
