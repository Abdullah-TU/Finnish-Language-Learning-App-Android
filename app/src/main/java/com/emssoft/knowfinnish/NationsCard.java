package com.emssoft.knowfinnish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.wajahatkarim3.easyflipview.EasyFlipView;

public class NationsCard extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.nationscard);

    final EasyFlipView easyFlipView = (EasyFlipView) findViewById(R.id.easyFlipView);
    easyFlipView.setFlipDuration(1000);
    easyFlipView.setFlipEnabled(true);

    findViewById(R.id.imgFrontCard).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Front Card", Toast.LENGTH_SHORT).show();
        easyFlipView.flipTheView();
      }
    });

    findViewById(R.id.imgBackCard).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Back Card", Toast.LENGTH_SHORT).show();
        easyFlipView.flipTheView();
      }
    });



    final EasyFlipView easyFlipVie = (EasyFlipView) findViewById(R.id.easyFlipView1);
    easyFlipVie.setFlipDuration(1000);
    easyFlipVie.setFlipEnabled(true);

    findViewById(R.id.imgFrontCard1).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Front Card", Toast.LENGTH_SHORT).show();
        easyFlipVie.flipTheView();
      }
    });

    findViewById(R.id.imgBackCard1).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Back Card", Toast.LENGTH_SHORT).show();
        easyFlipVie.flipTheView();
      }
    });




    final EasyFlipView easyFlipVi = (EasyFlipView) findViewById(R.id.easyFlipView2);
    easyFlipVi.setFlipDuration(1000);
    easyFlipVi.setFlipEnabled(true);

    findViewById(R.id.imgFrontCard2).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Front Card", Toast.LENGTH_SHORT).show();
        easyFlipVi.flipTheView();
      }
    });

    findViewById(R.id.imgBackCard2).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Back Card", Toast.LENGTH_SHORT).show();
        easyFlipVi.flipTheView();
      }
    });


    final EasyFlipView easyFlipV = (EasyFlipView) findViewById(R.id.easyFlipView3);
    easyFlipV.setFlipDuration(1000);
    easyFlipV.setFlipEnabled(true);

    findViewById(R.id.imgFrontCard3).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Front Card", Toast.LENGTH_SHORT).show();
        easyFlipV.flipTheView();
      }
    });

    findViewById(R.id.imgBackCard3).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Back Card", Toast.LENGTH_SHORT).show();
        easyFlipV.flipTheView();
      }
    });




    final EasyFlipView easyFlip = (EasyFlipView) findViewById(R.id.easyFlipView4);
    easyFlip.setFlipDuration(1000);
    easyFlip.setFlipEnabled(true);

    findViewById(R.id.imgFrontCard4).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Front Card", Toast.LENGTH_SHORT).show();
        easyFlip.flipTheView();
      }
    });

    findViewById(R.id.imgBackCard4).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Back Card", Toast.LENGTH_SHORT).show();
        easyFlip.flipTheView();
      }
    });


    final EasyFlipView easyFli = (EasyFlipView) findViewById(R.id.easyFlipView5);
    easyFli.setFlipDuration(1000);
    easyFli.setFlipEnabled(true);

    findViewById(R.id.imgFrontCard5).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Front Card", Toast.LENGTH_SHORT).show();
        easyFli.flipTheView();
      }
    });

    findViewById(R.id.imgBackCard5).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Back Card", Toast.LENGTH_SHORT).show();
        easyFli.flipTheView();
      }
    });


    final EasyFlipView easyFl = (EasyFlipView) findViewById(R.id.easyFlipView6);
    easyFl.setFlipDuration(1000);
    easyFl.setFlipEnabled(true);

    findViewById(R.id.imgFrontCard6).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Front Card", Toast.LENGTH_SHORT).show();
        easyFl.flipTheView();
      }
    });

    findViewById(R.id.imgBackCard6).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Back Card", Toast.LENGTH_SHORT).show();
        easyFl.flipTheView();
      }
    });


    final EasyFlipView easyF = (EasyFlipView) findViewById(R.id.easyFlipView7);
    easyF.setFlipDuration(1000);
    easyF.setFlipEnabled(true);

    findViewById(R.id.imgFrontCard7).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Front Card", Toast.LENGTH_SHORT).show();
        easyF.flipTheView();
      }
    });

    findViewById(R.id.imgBackCard7).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(NationsCard.this, "Back Card", Toast.LENGTH_SHORT).show();
        easyF.flipTheView();
      }
    });



    easyFlipView.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
      @Override
      public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
        Toast.makeText(NationsCard.this,
          " " + newCurrentSide, Toast.LENGTH_LONG).show();
      }
    });



    easyFlipVie.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
      @Override
      public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
        Toast.makeText(NationsCard.this,
                " " + newCurrentSide, Toast.LENGTH_LONG).show();
      }
    });


    easyFlipVi.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
      @Override
      public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
        Toast.makeText(NationsCard.this,
                " " + newCurrentSide, Toast.LENGTH_LONG).show();
      }
    });


    easyFlipV.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
      @Override
      public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
        Toast.makeText(NationsCard.this,
                " " + newCurrentSide, Toast.LENGTH_LONG).show();
      }
    });



    easyFlip.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
      @Override
      public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
        Toast.makeText(NationsCard.this,
                " " + newCurrentSide, Toast.LENGTH_LONG).show();
      }
    });

      easyFl.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
          @Override
          public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
              Toast.makeText(NationsCard.this,
                      " " + newCurrentSide, Toast.LENGTH_LONG).show();
          }
      });
      easyFl.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
          @Override
          public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
              Toast.makeText(NationsCard.this,
                      " " + newCurrentSide, Toast.LENGTH_LONG).show();
          }
      });
      easyF.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
          @Override
          public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
              Toast.makeText(NationsCard.this,
                      " " + newCurrentSide, Toast.LENGTH_LONG).show();
          }
      });

  }
}