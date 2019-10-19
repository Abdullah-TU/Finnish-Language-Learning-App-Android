package com.emssoft.knowfinnish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Writingmain extends AppCompatActivity {

    TextView questionLabel, questionCountLabel, scoreLabel;
    EditText answerEdt;
    Button submitButton;
    ProgressBar progressBar;
    ArrayList<QuestionModel> questionModelArraylist;


    int currentPosition = 0;
    int numberOfCorrectAnswer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.writingmain);





        questionCountLabel = findViewById(R.id.noQuestion);
        questionLabel = findViewById(R.id.question);
        scoreLabel = findViewById(R.id.score);

        answerEdt = findViewById(R.id.answer);
        submitButton = findViewById(R.id.submit);
        progressBar = findViewById(R.id.progress_bar);

        questionModelArraylist = new ArrayList<>();

        setUpQuestion();

        setData();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkAnswer();
            }
        });

        answerEdt.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                Log.e("event.getAction()",event.getAction()+"");
                Log.e("event.keyCode()",keyCode+"");
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {

                    checkAnswer();
                    return true;
                }
                return false;
            }
        });

    }
    public void checkAnswer(){
        String answerString  = answerEdt.getText().toString().trim();




        if(answerString.equalsIgnoreCase(questionModelArraylist.get(currentPosition).getAnswer())){
            numberOfCorrectAnswer ++;



            new SweetAlertDialog(Writingmain.this, SweetAlertDialog.SUCCESS_TYPE)
                    .setTitleText("Good job!")
                    .setContentText("Right Answer")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                            currentPosition ++;

                            setData();
                            answerEdt.setText("");
                            sweetAlertDialog.dismiss();
                        }
                    })
                    .show();


        }else {

            new SweetAlertDialog(Writingmain.this, SweetAlertDialog.ERROR_TYPE)
                    .setTitleText("Wrong Answer")
                    .setContentText("The right answer is : "+questionModelArraylist.get(currentPosition).getAnswer())
                    .setConfirmText("OK")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {
                            sDialog.dismiss();

                            currentPosition ++;

                            setData();
                            answerEdt.setText("");
                        }
                    })
                    .show();
        }





        int x = ((currentPosition+1) * 100) / questionModelArraylist.size();

        progressBar.setProgress(x);



    }




    public void setUpQuestion(){


        questionModelArraylist.add(new QuestionModel("Tervetuloa ","Welcome"));
        questionModelArraylist.add(new QuestionModel("Mitä kuuluu? ","How are you?"));
        questionModelArraylist.add(new QuestionModel("Hyvää yötä","Good night"));
        questionModelArraylist.add(new QuestionModel("Tulipalo","Fire"));
        questionModelArraylist.add(new QuestionModel("Mouse ","Hiiri"));

        questionModelArraylist.add(new QuestionModel("Happi ","Oxygen"));
        questionModelArraylist.add(new QuestionModel("Näyttö","Monitor"));
        questionModelArraylist.add(new QuestionModel("Tulipalo","Fire"));
        questionModelArraylist.add(new QuestionModel("Sanakirja","Dictionary"));


        questionModelArraylist.add(new QuestionModel("Minä --- Intiassa. ","asun"));
        questionModelArraylist.add(new QuestionModel("Sinä --- englanti. ","puhut"));
        questionModelArraylist.add(new QuestionModel("Hän --- Espanjaa.","puhuu"));
        questionModelArraylist.add(new QuestionModel("He ---  Venaja.","puhuvat"));
        questionModelArraylist.add(new QuestionModel("Mikä sinun etunimi on? What is the meaning of etunimi? ","First name"));


        questionModelArraylist.add(new QuestionModel("Sormikkaat ","Gloves"));
        questionModelArraylist.add(new QuestionModel("Solmio","Tie "));
        questionModelArraylist.add(new QuestionModel("Kengät","Shoes"));
        questionModelArraylist.add(new QuestionModel("Punainen","Red"));
        questionModelArraylist.add(new QuestionModel("Käyttöjärjestelmä ","Operating system "));

        questionModelArraylist.add(new QuestionModel("Yliopisto ","University"));
        questionModelArraylist.add(new QuestionModel("Luokkahuone","Classroom"));
        questionModelArraylist.add(new QuestionModel("Kirjasto","Library"));
        questionModelArraylist.add(new QuestionModel("Anteeksi","Sorry"));

        questionModelArraylist.add(new QuestionModel("Kiitos","Thanks"));
        questionModelArraylist.add(new QuestionModel("Ole varovainen","Be careful"));
        questionModelArraylist.add(new QuestionModel("Ole hiljaa","Be quiet"));
        questionModelArraylist.add(new QuestionModel("Pää kiinni","Shut up"));
        questionModelArraylist.add(new QuestionModel("Lopeta se","Stop it"));

        questionModelArraylist.add(new QuestionModel("Älä viitsi", "Be serious"));
        questionModelArraylist.add(new QuestionModel("Todellako?","Really?"));
        questionModelArraylist.add(new QuestionModel("Oletko varma?","Are you sure?"));
        questionModelArraylist.add(new QuestionModel("Uskomatonta","Unbelievable"));
        questionModelArraylist.add(new QuestionModel("Ihana ajatus","Good idea"));


        questionModelArraylist.add(new QuestionModel(" Se on kuuma.","It\\'\\s hot."));
        questionModelArraylist.add(new QuestionModel("Ympäristö","Environment"));
        questionModelArraylist.add(new QuestionModel("Talvi","Winter"));
        questionModelArraylist.add(new QuestionModel("Kesä","Summer"));
        questionModelArraylist.add(new QuestionModel("Lumi","Snow"));

        questionModelArraylist.add(new QuestionModel("Minä --- Intiassa. ","asun"));
        questionModelArraylist.add(new QuestionModel("Sinä --- englanti. ","puhut"));
        questionModelArraylist.add(new QuestionModel("Hän --- Espanjaa.","puhuu"));
        questionModelArraylist.add(new QuestionModel("He ---  Venaja.","puhuvat"));
        questionModelArraylist.add(new QuestionModel("Mikä sinun etunimi on? What is the meaning of etunimi? ","First name"));

        questionModelArraylist.add(new QuestionModel("Hän on veljeni. What is the meaning of Veli?","Brother"));
        questionModelArraylist.add(new QuestionModel("Pekka on minun poikani. What is the meaning of Poika?","Son"));
        questionModelArraylist.add(new QuestionModel("Vellikin on ruokaa. What is the meaning of Ruokaa?","Food"));
        questionModelArraylist.add(new QuestionModel("Vehnä","Wheat"));
        questionModelArraylist.add(new QuestionModel("Hampurilainen","Burger"));


    }

    public void setData(){


        if(questionModelArraylist.size()>currentPosition) {

            questionLabel.setText(questionModelArraylist.get(currentPosition).getQuestionString());

            scoreLabel.setText("Score :" + numberOfCorrectAnswer + "/" + questionModelArraylist.size());
            questionCountLabel.setText("Question No : " + (currentPosition + 1));


        }else{


            new SweetAlertDialog(Writingmain.this, SweetAlertDialog.SUCCESS_TYPE)
                    .setTitleText("You have successfully completed the quiz")
                    .setContentText("Your score is : "+ numberOfCorrectAnswer + "/" + questionModelArraylist.size())
                    .setConfirmText("Restart")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {

                            sDialog.dismissWithAnimation();
                            currentPosition = 0;
                            numberOfCorrectAnswer = 0;
                            progressBar.setProgress(0);
                            setData();
                        }
                    })
                    .setCancelText("Close")
                    .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {

                            sDialog.dismissWithAnimation();
                            finish();
                        }
                    })
                    .show();

        }

    }



}
