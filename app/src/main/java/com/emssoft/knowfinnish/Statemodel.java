package com.emssoft.knowfinnish;

/**
 * Created by Mamun on 7/1/2018.
 */

public class Statemodel {

    String name;
    int image;
    public Statemodel(String name, int image){
        this.name=name;
        this.image=image;

    }

    public String getName(){
        return name;
    }
    public int getImage(){
        return image;
    }

}
