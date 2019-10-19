package com.emssoft.knowfinnish;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mamun on 4/29/2018.
 */

public class MyAdapter extends BaseAdapter
{
    Context applicationContext;
    List<RowData> rowDatas;
    private MediaPlayer mediaPlayer;
    private Boolean flag = true;



    public MyAdapter(Context applicationContext, List<RowData> rowDatas) {
        this.applicationContext=applicationContext;
        this.rowDatas=rowDatas;
    }

    @Override
    public int getCount() {
        return rowDatas.size();
    }

    @Override
    public Object getItem(int i) {
        return rowDatas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private class MyViewHolder
    {
        ImageView imageView, ivPlay, ivStop;
        TextView textView1;
        TextView textView2;



    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final MyViewHolder myViewHolder;

        if(view==null)
        {
            LayoutInflater layoutInflater=(LayoutInflater) applicationContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(R.layout.row_data,null);
            myViewHolder=new MyViewHolder();
            myViewHolder.imageView=(ImageView) view.findViewById(R.id.list_image);
            myViewHolder.textView1=(TextView) view.findViewById(R.id.title);
            myViewHolder.textView2=(TextView) view.findViewById(R.id.subtilte);
            myViewHolder.ivPlay = (ImageView) view.findViewById(R.id.ivPlay);
            myViewHolder.ivStop = (ImageView) view.findViewById(R.id.ivStop);

            view.setTag(myViewHolder);

        }
        else
        {

            myViewHolder=(MyViewHolder)view.getTag();
        }
        final RowData rowData=rowDatas.get(i);

        myViewHolder.imageView.setImageResource(rowData.getImg_title());
        myViewHolder.textView1.setText(rowData.getMain_title());
        myViewHolder.textView2.setText(rowData.getSub_title());


        final MyViewHolder finalMyViewHolder = myViewHolder;
        myViewHolder.ivPlay.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View v) {
                if(flag){

                    mediaPlayer = MediaPlayer.create(applicationContext, rowData.getSong());
                    flag = false;
                }
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    finalMyViewHolder.ivPlay.setImageResource(R.drawable.play);
                } else {
                    mediaPlayer.start();
                    finalMyViewHolder.ivPlay.setImageResource(R.drawable.pausee);
                }
            }
        });

        final MyViewHolder finalMyViewHolder1 = myViewHolder;
        myViewHolder.ivStop.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View v) {
                if(!flag) {

                    mediaPlayer.reset();
                    mediaPlayer.release();
                    flag = true;
                }
                finalMyViewHolder1.ivPlay.setImageResource(R.drawable.play);
            }
        });



        return view;
    }



}
