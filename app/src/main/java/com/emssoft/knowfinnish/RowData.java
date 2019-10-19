package com.emssoft.knowfinnish;

import java.io.Serializable;

/**
 * Created by SHARAD on 11/2/2017.
 */

public class RowData implements Serializable
{

    private String main_title,sub_title, new_title;
    private  int img_title;
    private int song;

    public RowData(String main_title,String sub_title,int img_title, int song)
    {
        this.main_title=main_title;
        this.sub_title=sub_title;
        this.img_title=img_title;
        this.song = song;
        this.new_title = new_title;
    }


    public String getNew_title() {
        return new_title;
    }

    public void setNew_title(String new_title) {
        this.new_title = new_title;
    }

    public String getMain_title() {
        return main_title;
    }

    public void setMain_title(String main_title) {
        this.main_title = main_title;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }



    public int getImg_title() {
        return img_title;
    }

    public void setImg_title(int img_title) {
        this.img_title = img_title;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }





}
