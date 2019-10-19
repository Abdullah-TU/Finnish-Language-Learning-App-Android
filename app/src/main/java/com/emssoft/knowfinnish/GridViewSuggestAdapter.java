package com.emssoft.knowfinnish;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.util.List;


/**
 * Created by reale on 3/9/2017.
 */

public class GridViewSuggestAdapter extends BaseAdapter {

    private List<String> suggestSource;
    private Context context;
    private FillinTheBlanks fillinTheBlanks;


    public GridViewSuggestAdapter(List<String> suggestSource, Context context, FillinTheBlanks fillinTheBlanks) {
        this.suggestSource = suggestSource;
        this.context = context;
        this.fillinTheBlanks = fillinTheBlanks;
    }

    @Override
    public int getCount() {
        return suggestSource.size();
    }

    @Override
    public Object getItem(int position) {
        return suggestSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Button button;
        GradientDrawable drawable;
        if(convertView == null)
        {
            if(suggestSource.get(position).equals("null"))
            {
                button = new Button(context);
                button.setLayoutParams(new GridView.LayoutParams(85,85));
                button.setPadding(12,12,12,12);
                button.setBackgroundColor(Color.BLUE);

            }
            else
            {
                button = new Button(context);
                button.setLayoutParams(new GridView.LayoutParams(85,85));
                button.setPadding(12,12,12,12);
                button.setBackgroundColor(Color.BLUE);
                button.setTextColor(Color.WHITE);

                button.setText(suggestSource.get(position));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //If correct answer contains character user selected
                        if(String.valueOf(fillinTheBlanks.answer).contains(suggestSource.get(position)))
                        {
                            char compare = suggestSource.get(position).charAt(0); // Get char

                            for(int i =0;i<fillinTheBlanks.answer.length;i++)
                            {
                                if(compare == fillinTheBlanks.answer[i])
                                    Common.user_submit_answer[i] = compare;
                            }

                            //Update UI
                            GridViewAnswerAdapter answerAdapter = new GridViewAnswerAdapter(Common.user_submit_answer,context);
                            fillinTheBlanks.gridViewAnswer.setAdapter(answerAdapter);
                            answerAdapter.notifyDataSetChanged();

                            //Remove from suggest source
                            fillinTheBlanks.suggestSource.set(position,"null");
                            fillinTheBlanks.suggestAdapter = new GridViewSuggestAdapter(fillinTheBlanks.suggestSource,context,fillinTheBlanks);
                            fillinTheBlanks.gridViewSuggest.setAdapter(fillinTheBlanks.suggestAdapter);
                            fillinTheBlanks.suggestAdapter.notifyDataSetChanged();
                        }
                        else // else
                        {
                            //Remove from suggest source
                            fillinTheBlanks.suggestSource.set(position,"null");
                            fillinTheBlanks.suggestAdapter = new GridViewSuggestAdapter(fillinTheBlanks.suggestSource,context,fillinTheBlanks);
                            fillinTheBlanks.gridViewSuggest.setAdapter(fillinTheBlanks.suggestAdapter);
                            fillinTheBlanks.suggestAdapter.notifyDataSetChanged();
                        }
                    }
                });
            }
        }
        else
            button = (Button)convertView;
        return button;

    }
}
