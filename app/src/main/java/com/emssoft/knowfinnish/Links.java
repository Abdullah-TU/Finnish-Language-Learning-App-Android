package com.emssoft.knowfinnish;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.varunest.sparkbutton.SparkButton;

public class Links extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.links);

        SparkButton atasteoffinnish = (SparkButton)findViewById(R.id.atasteoffinnish);

        atasteoffinnish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tasteoffinnish.fi/"));
                startActivity(Getintent);

            }
        });



        SparkButton tavataantaas = (SparkButton)findViewById(R.id.tavataantaas);

        tavataantaas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://donnerwetter.kielikeskus.helsinki.fi/FinnishForForeigners/"));
                startActivity(Getntent);

            }
        });


        SparkButton language_training = (SparkButton)findViewById(R.id.language_training);

        language_training.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Gettent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expat-finland.com/living_in_finland/language_training.html"));
                startActivity(Gettent);

            }
        });


        SparkButton finnishcourses = (SparkButton)findViewById(R.id.finnishcourses);

        finnishcourses.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.finnishcourses.fi/en"));
                startActivity(Getintent);

            }
        });





        SparkButton finnjoy = (SparkButton)findViewById(R.id.finnjoy);

        finnjoy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.finnjoy.fi/"));
                startActivity(Getntent);

            }
        });


        SparkButton onnenkieli = (SparkButton)findViewById(R.id.onnenkieli);

        onnenkieli.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Gettent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.onnenkieli.fi/en/"));
                startActivity(Gettent);

            }
        });




        SparkButton leilawhiteagrammarbookoffinnish = (SparkButton)findViewById(R.id.leilawhiteagrammarbookoffinnish);

        leilawhiteagrammarbookoffinnish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://finnlectura.fi/oppimateriaalit/a-grammar-book-of-finnish"));
                startActivity(Getintent);

            }
        });



        SparkButton suomenmestari1 = (SparkButton)findViewById(R.id.suomenmestari1);

        suomenmestari1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://suomenmestari.fi/aanitteet/suomen-mestari-1/"));
                startActivity(Getntent);

            }
        });


        SparkButton kuulostaahyvalta1 = (SparkButton)findViewById(R.id.kuulostaahyvalta1);

        kuulostaahyvalta1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Gettent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.goodreads.com/book/show/17704394-kuulostaa-hyv-lt---sounds-good"));
                startActivity(Gettent);

            }
        });


        SparkButton hyvinmenee1 = (SparkButton)findViewById(R.id.hyvinmenee1);

        hyvinmenee1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://oppimisenpalvelut.otava.fi/tuotteet/ammatti-ja-aikuiskoulutus/hyvin-menee/"));
                startActivity(Getintent);

            }
        });



        SparkButton omasuomi1 = (SparkButton)findViewById(R.id.omasuomi1);

        omasuomi1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://oppimisenpalvelut.otava.fi/tuotteet/ammatti-ja-aikuiskoulutus/oma-suomi-uutuus/"));
                startActivity(Getintent);

            }
        });


        SparkButton kielikayttoon1 = (SparkButton)findViewById(R.id.kielikayttoon1);

        kielikayttoon1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gaudeamus.fi/kenttala-kieli-kayttoon-2/"));
                startActivity(Getintent);

            }
        });

        SparkButton sanakirja = (SparkButton)findViewById(R.id.sanakirja);

        sanakirja.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sanakirja.org/"));
                startActivity(Getntent);

            }
        });


        SparkButton kielitoimistonsanakirjaa = (SparkButton)findViewById(R.id.kielitoimistonsanakirja);

        kielitoimistonsanakirjaa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Gettent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kielitoimistonsanakirja.fi/"));
                startActivity(Gettent);

            }
        });







        SparkButton linguajoy = (SparkButton)findViewById(R.id.linguajoy);

        linguajoy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linguajoy.fi/en/"));
                startActivity(Getintent);

            }
        });



        SparkButton finnishlanguagehelsinkiregion = (SparkButton)findViewById(R.id.finnishlanguagehelsinkiregion);

        finnishlanguagehelsinkiregion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/finnishlanguagehelsinkiregion/about/"));
                startActivity(Getntent);

            }
        });


        SparkButton groups13522116475 = (SparkButton)findViewById(R.id.groups13522116475);

        groups13522116475.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Gettent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/13522116475/10152720548886476/"));
                startActivity(Gettent);

            }
        });


        SparkButton groups2064891 = (SparkButton)findViewById(R.id.groups2064891);

        groups2064891.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/206489146172458"));
                startActivity(Getintent);

            }
        });



        SparkButton opiskelemmesuomea = (SparkButton)findViewById(R.id.opiskelemmesuomea);

        opiskelemmesuomea.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/groups/OpiskelemmeSuomea/?ref=group_header&view=group"));
                startActivity(Getntent);

            }
        });


        SparkButton finnishlanguageclub4bd = (SparkButton)findViewById(R.id.finnishlanguageclub4bd);

        finnishlanguageclub4bd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Gettent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/Finnishlanguageclub4BD/"));
                startActivity(Gettent);

            }
        });









        SparkButton vocabulary = (SparkButton)findViewById(R.id.vocabulary);

        vocabulary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Gettent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uusikielemme.fi/vocabulary.html"));
                startActivity(Gettent);

            }
        });


        SparkButton grammar = (SparkButton)findViewById(R.id.grammar);

        grammar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uusikielemme.fi/grammar.html"));
                startActivity(Getintent);

            }
        });



        SparkButton finnishpod101 = (SparkButton)findViewById(R.id.finnishpod101);

        finnishpod101.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.finnishpod101.com/finnish-vocabulary-words/"));
                startActivity(Getntent);

            }
        });


        SparkButton verbix = (SparkButton)findViewById(R.id.verbix);

        verbix.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Gettent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.verbix.com/languages/finnish.html"));
                startActivity(Gettent);

            }
        });



        SparkButton news = (SparkButton)findViewById(R.id.news);

        news.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expat-finland.com/living_in_finland/news.html"));
                startActivity(Getintent);

            }
        });



        SparkButton osasto = (SparkButton)findViewById(R.id.osasto);

        osasto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://yle.fi/uutiset/osasto/news/"));
                startActivity(Getntent);

            }
        });


        SparkButton hs = (SparkButton)findViewById(R.id.hs);

        hs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Gettent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hs.fi/"));
                startActivity(Gettent);

            }
        });








        SparkButton areena= (SparkButton)findViewById(R.id.areena);

        areena.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Gettent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://areena.yle.fi/tv/ohjelmat/kaikki?l=fi&r=world"));
                startActivity(Gettent);

            }
        });



        SparkButton linkki = (SparkButton)findViewById(R.id.linkki);

        linkki.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ruutu.fi/"));
                startActivity(Getintent);

            }
        });



        SparkButton telecommunications = (SparkButton)findViewById(R.id.telecommunications);

        telecommunications.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expat-finland.com/telecommunications_and_media/television.html"));
                startActivity(Getntent);

            }
        });









        SparkButton listenlive = (SparkButton)findViewById(R.id.listenlive);

        listenlive.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.listenlive.eu/finland.html"));
                startActivity(Getntent);

            }
        });


        SparkButton radio = (SparkButton)findViewById(R.id.radio);

        radio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Gettent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expat-finland.com/telecommunications_and_media/radio.html"));
                startActivity(Gettent);

            }
        });






        SparkButton language_trainin = (SparkButton)findViewById(R.id.language_trainin);

        language_trainin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expat-finland.com/living_in_finland/language_training.html"));
                startActivity(Getntent);

            }
        });


        SparkButton finnishcourse = (SparkButton)findViewById(R.id.finnishcourse);

        finnishcourse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Gettent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.finnishcourses.fi/"));
                startActivity(Gettent);

            }
        });




    }
}