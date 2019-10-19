package com.emssoft.knowfinnish;

/**
 * Created by Mamun on 7/6/2018.
 */


import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    // list of images
    public int[] lst_images = {

            R.drawable.tips,
            R.drawable.image_4,
            R.drawable.handshake,

            R.drawable.tv,
            R.drawable.listen,
            R.drawable.readlogo,

            R.drawable.grammerandpron,
            R.drawable.social,
            R.drawable.online,

            R.drawable.mobile,
            R.drawable.rsz_1stickynotes,
            R.drawable.daymark

    };



    public int[] third_images = {

            R.drawable.rightnadd,
            R.drawable.nocolor,
            R.drawable.nocolor,

            R.drawable.nocolor,
            R.drawable.nocolor,
            R.drawable.nocolor,

            R.drawable.nocolor,
            R.drawable.nocolor,
            R.drawable.nocolor,

            R.drawable.nocolor,
            R.drawable.nocolor,
            R.drawable.nocolor

    };




    // list of titles
    public String[] lst_title = {
            "QUICK TIPS ",
            "SET THE SMART GOALS",
            "FIND A PARTNER ",

            "KEEP WATCHING…",
            "KEEP LISTENING…",
            "READ BOOKS",

            "ENRICH VOCABULARY AND KNOW GRAMMAR",
            "JOIN ONLINE GROUP AND SOCIAL MEDIA",
            "ONLINE COURSES AND WEB BASED LEARNING",

            "MOBILE APPS",
            "STICKY NOTES",
            "FINAL WORDS"

    }   ;
    // list of descriptions
    public String[] lst_description = {
            "❝One language sets you in a corridor for life. Two languages open every door along the way.❞\n" +
                    "‒Frank Smith\n",

                    "SMART Goals are -\n\n" +
                            "*\t Specific *\n\n" +
                            "*\t Measurable *\n\n" +
                            "*\t Attainable *\n\n" +
                            "*\t Relevant *\n\n" +
                            "*\t Time-bound *\n" ,

            "An hour of conversation (with corrections and a dictionary for reference) is as good as five hours in a classroom and 10 hours with a language course by yourself.",


            "TV shows, movies are a good supplementation.",
            "Once you’re able to speak and listen without thinking about it, you’ll begin to actually think in the foreign language itself without effort. ❝Useful Links❞ can be helpful for you",
            "Reading a book is a good habit. Reading newspapers and magazines are a good supplementation.",

            "Start with the 100 most common words and then make sentences with them over and over again.",
            "Find a language buddy online and join in a social media. ",
            "There are a lot of study materials in online for free. Take some online courses. Continue searching for good online materials.",

            "Install few best mobile apps.  Some apps might help you a lot.",
            "To take sticky notes is a perfect way for learning Finnish",
            "*\t Learn every day even if it is a single word. *\n\n" +
                    "*\t Learning new skills that require a longer-term commitment *\n\n" +
                    "*\t Don’t give up, practice more and more *\n\n" +

            "*\t Its good to take a course if you are in Finland. Check places where you can find courses *\n\n"

    };


    // list of background colors
    public int[]  lst_backgroundcolor = {


            Color.rgb(0,153,153),
            Color.rgb(0,77,64),
            Color.rgb(1,87,155),

            Color.rgb(126,87,194),
            Color.rgb(74,20,140),
            Color.rgb(110,49,89),

            Color.rgb(239,85,85),
            Color.rgb(0,96,100),
            Color.rgb(0,153,153),

            Color.rgb(110,49,89),
            Color.rgb(121, 36,75),
            Color.rgb(1,87,155)
    };

    public SlideAdapter(Context context) {
        this.context = context;


    }

    @Override
    public int getCount() {
        return lst_title.length;



    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(RelativeLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        RelativeLayout layoutslide = (RelativeLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView)  view.findViewById(R.id.slideimg);

        ImageView another2 = (ImageView)  view.findViewById(R.id.another2);
        TextView txttitle= (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);

        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);

        another2.setImageResource(third_images[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);


        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);


    }
        }