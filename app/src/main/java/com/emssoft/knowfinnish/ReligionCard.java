package com.emssoft.knowfinnish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.wajahatkarim3.easyflipview.EasyFlipView;

public class ReligionCard extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.religioncard);

    final EasyFlipView easyFlipView = (EasyFlipView) findViewById(R.id.easyFlipView);
    easyFlipView.setFlipDuration(1000);
    easyFlipView.setFlipEnabled(true);

    findViewById(R.id.imgFrontCard).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(ReligionCard.this, "Front Card", Toast.LENGTH_SHORT).show();
        easyFlipView.flipTheView();
      }
    });

    findViewById(R.id.imgBackCard).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(ReligionCard.this, "Back Card", Toast.LENGTH_SHORT).show();
        easyFlipView.flipTheView();
      }
    });



    final EasyFlipView easyFlipVie = (EasyFlipView) findViewById(R.id.easyFlipView1);
    easyFlipVie.setFlipDuration(1000);
    easyFlipVie.setFlipEnabled(true);

    findViewById(R.id.imgFrontCard1).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(ReligionCard.this, "Front Card", Toast.LENGTH_SHORT).show();
        easyFlipVie.flipTheView();
      }
    });

    findViewById(R.id.imgBackCard1).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(ReligionCard.this, "Back Card", Toast.LENGTH_SHORT).show();
        easyFlipVie.flipTheView();
      }
    });




    final EasyFlipView easyFlipVi = (EasyFlipView) findViewById(R.id.easyFlipView2);
    easyFlipVi.setFlipDuration(1000);
    easyFlipVi.setFlipEnabled(true);

    findViewById(R.id.imgFrontCard2).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(ReligionCard.this, "Front Card", Toast.LENGTH_SHORT).show();
        easyFlipVi.flipTheView();
      }
    });

    findViewById(R.id.imgBackCard2).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(ReligionCard.this, "Back Card", Toast.LENGTH_SHORT).show();
        easyFlipVi.flipTheView();
      }
    });


    final EasyFlipView easyFlipV = (EasyFlipView) findViewById(R.id.easyFlipView3);
    easyFlipV.setFlipDuration(1000);
    easyFlipV.setFlipEnabled(true);

    findViewById(R.id.imgFrontCard3).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(ReligionCard.this, "Front Card", Toast.LENGTH_SHORT).show();
        easyFlipV.flipTheView();
      }
    });

    findViewById(R.id.imgBackCard3).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(ReligionCard.this, "Back Card", Toast.LENGTH_SHORT).show();
        easyFlipV.flipTheView();
      }
    });




    final EasyFlipView easyFlip = (EasyFlipView) findViewById(R.id.easyFlipView4);
    easyFlip.setFlipDuration(1000);
    easyFlip.setFlipEnabled(true);

    findViewById(R.id.imgFrontCard4).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(ReligionCard.this, "Front Card", Toast.LENGTH_SHORT).show();
        easyFlip.flipTheView();
      }
    });

    findViewById(R.id.imgBackCard4).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(ReligionCard.this, "Back Card", Toast.LENGTH_SHORT).show();
        easyFlip.flipTheView();
      }
    });



    easyFlipView.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
      @Override
      public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
        Toast.makeText(ReligionCard.this,
          "" + newCurrentSide, Toast.LENGTH_LONG).show();
      }
    });



    easyFlipVie.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
      @Override
      public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
        Toast.makeText(ReligionCard.this,
                "" + newCurrentSide, Toast.LENGTH_LONG).show();
      }
    });


    easyFlipVi.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
      @Override
      public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
        Toast.makeText(ReligionCard.this,
                "" + newCurrentSide, Toast.LENGTH_LONG).show();
      }
    });


    easyFlipV.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
      @Override
      public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
        Toast.makeText(ReligionCard.this,
                "" + newCurrentSide, Toast.LENGTH_LONG).show();
      }
    });



    easyFlip.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
      @Override
      public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
        Toast.makeText(ReligionCard.this,
                "" + newCurrentSide, Toast.LENGTH_LONG).show();
      }
    });

  }
}