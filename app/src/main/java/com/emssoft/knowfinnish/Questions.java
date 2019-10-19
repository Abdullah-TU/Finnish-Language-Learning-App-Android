package com.emssoft.knowfinnish;

/**
 * Created by Mamun on 6/29/2018.
 */

public class Questions {


    public String mQuestion [] ={

            "Seis",
            "Soittakaa poliisille",
            "Onnea",
            "Hyvää huomenta",
            "Please speak more slowly",

            "Leave me alone",
            "How much is this?",
            "I miss you",
            "Happy Birthday",
            "What is your phone number? ",

            "Where is the metro station?",
            "Sormikkaat",
            "Solmio",
            "Kengät",
            "Punainen",

            "Käyttöjärjestelmä",
            "Vellikin on ruokaa. What is the meaning of Ruokaa?",
            "Where are you from?",
            "Do you speak English?",
            "Where is the toilet?",

            "I love you",
            "Apua",
            "Luokkahuone",
            "Kirjasto",
            "Anteeksi",

            "Kiitos",
            "Ole varovainen",
            "Ole hiljaa",
            "Pää kiinni",
            "Lopeta se",

            "Älä viitsi",
            "Todellako?",
            "Oletko varma?",
            "Uskomatonta",
            "Ihana ajatus",

            "Hold on please",
            "Sinä --- englanti.",
            "Hän --- Espanjaa.",
            "I do not understand",
            "Pekka on minun poikani. What is the meaning of Poika?"


    } ;


    private String mchoices [][] ={

            {"Call the police", "Stop", "Congratulations","Good morning"},
            { "Stop", "Congratulations","Good morning","Call the police"  },
            {"Good morning" , "Stop", "Congratulations","Call the police"  },
            {"Stop", "Congratulations","Call the police", "Good morning" },
            {"Paljonko tämä maksaa?", "Minulla on sinua ikävä", "Puhuisitteko hieman hitaammin?", "Jätä minut rauhaan" },

            {"Puhuisitteko hieman hitaammin?", "Jätä minut rauhaan","Paljonko tämä maksaa?","Minulla on sinua ikävä" },
            { "Paljonko tämä maksaa?","Puhuisitteko hieman hitaammin","Minulla on sinua ikävä","Jätä minut rauhaan" },
            {"Paljonko tämä maksaa?",  "Jätä minut rauhaan","Minulla on sinua ikävä","Puhuisitteko hieman hitaammin" },
            {"Jätä minut rauhaan", "Hyvää syntymäpäivää", "Mikä on sinun puhelinnumerosi", "Missä on metroasema?" },
            { "Missä on metroasema?","Hyvää syntymäpäivää", "Mikä on sinun puhelinnumerosi", "Jätä minut rauhaan" },

            {"Mikä on sinun puhelinnumerosi", "Jätä minut rauhaan", "Hyvää syntymäpäivää",  "Missä on metroasema?" },
            { "Gloves", "Tie", "Shoes", "Red" },
            { "Shoes", "Red", "Gloves", "Tie" },
            { "Tie", "Gloves",  "Shoes", "Red" },
            { "Shoes", "Tie", "Red", "Gloves" },

            { "Food", "Operating system",  "Help", "mars"  },
            { "Operating system", "Food", "Help", "mars" },
            { "Mistä olet kotoisin?", "Minä rakastan sinua.", "Puhutteko englantia? ", "Missä on vessa?"},
            { "Mistä olet kotoisin?","Puhutteko englantia? ", "Missä on vessa?", "Minä rakastan sinua." },
            { "Mistä olet kotoisin?", "Missä on vessa?", "Minä rakastan sinua.","Puhutteko englantia? " },


            { "Missä on vessa?", "Minä rakastan sinua.","Mistä olet kotoisin?","Puhutteko englantia?"  },
            { "Operating system", "Food", "Help", "mars" },
            {"Sorry", "Help","Classroom","Library" },
            { "Help","Classroom","Library", "Sorry"},
            {"Library", "Sorry", "Help","Classroom"},

            {"Help","Classroom","Thanks", "Library" },
            { "Shut up","Be quiet","Be careful","Thanks" },
            { "Thanks","Be careful","Be quiet","Shut up" },
            { "Shut up","Be quiet","Be careful","Thanks" },
            { "Thanks","Be careful","Be quiet","Stop it" },


            {"Be serious","Really?", "Stop it","Are you sure?"},
            { "Stop it","Are you sure?","Be serious","Really?"},
            {"Really?", "Stop it", "Be serious","Are you sure?"},
            {"Be serious","Really?", "Unbelievable","Are you sure?"},
            {"Unbelievable","Good idea","Puhut","puhuu"},

            {"Puhut","puhuu","Odota hetki","Good idea"},
            {"Unbelievable","Good idea","Puhut","puhuu"},
            {"puhuvat","Good idea","Puhut","puhuu"},
            { "Missä on vessa?", "Minä rakastan sinua.","En ymmärrä","Puhutteko englantia? "  },
            { "puhuvat", "Good idea","Son", "Unbelievable" },
    } ;


    private String mCorrectanswer [] ={

            "Stop",
            "Call the police",
            "Congratulations",
            "Good morning",
            "Puhuisitteko hieman hitaammin?",

            "Jätä minut rauhaan",
            "Paljonko tämä maksaa?",
            "Minulla on sinua ikävä",
            "Hyvää syntymäpäivää",
            "Mikä on sinun puhelinnumerosi",

            "Missä on metroasema?",
            "Gloves",
            "Tie",
            "Shoes",
            "Red",


            "Operating system",
            "Food",
            "Mistä olet kotoisin?",
            "Puhutteko englantia? ",
            "Missä on vessa?",

            "Minä rakastan sinua.",
            "Help",
            "Classroom",
            "Library",
            "Sorry",

            "Thanks",
            "Be careful",
            "Be quiet",
            "Shut up",
            "Stop it",

            "Be serious",
            "Really?",
            "Are you sure?",
            "Unbelievable",
            "Good idea",

            "Odota hetki",
            "Puhut",
            "puhuu",
            "En ymmärrä",
            "Son"




    } ;


    public String getQuestion (int a){
                  String question = mQuestion[a];
                  return question;
    }



    public String getChoices1 (int a){
        String choice = mchoices[a][0];
        return choice;
    }

    public String getChoices2 (int a){
        String choice = mchoices[a][1];
        return choice;
    }

    public String getChoices3 (int a){
        String choice = mchoices[a][2];
        return choice;
    }
    public String getChoices4 (int a){
        String choice = mchoices[a][3];
        return choice;
    }



    public String getCorrectAnswer (int a){
        String answer = mCorrectanswer[a];
        return answer;

    }
}