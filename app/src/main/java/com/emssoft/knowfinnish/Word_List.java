package com.emssoft.knowfinnish;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import Database.DatabaseHelper;
import Database.VideoDetails;

@SuppressWarnings("unchecked")
public class Word_List extends AppCompatActivity {
    DatabaseHelper db;
    VideoDetails wird_list = null;
    ArrayList<VideoDetails> word;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordlists);
        wird_list = new VideoDetails();

        db = new DatabaseHelper(Word_List.this);
        word =  db.getAllVideoDetailsFromTable(DatabaseHelper.TABLE_VIDEOS);

        db.closeDB();

        ListView lv = (ListView) findViewById(R.id.listView);

        // Change MyActivity.this and myListOfItems to your own values
        CustomListAdapterDialog clad = new CustomListAdapterDialog(Word_List.this, word);
  lv.setAdapter(clad);

    }


    private class CustomListAdapterDialog extends ArrayAdapter<String> {

        private Context context;
        LayoutInflater inflater;

        public CustomListAdapterDialog(Context con, ArrayList values) {
            super(con, R.layout.word_list_style, values);
            this.context = con;
            inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolderDialog holder = null;



            if (convertView == null) {
                holder = new ViewHolderDialog();
                convertView = inflater.inflate(R.layout.word_list_style, null);

                holder.english = (TextView) convertView
                        .findViewById(R.id.english);
                holder.finnish = (TextView) convertView
                        .findViewById(R.id.finnish);

                convertView.setTag(holder);
            } else {
                holder = (ViewHolderDialog) convertView.getTag();

            }
            holder.english.setTextColor(Color.WHITE);
            holder.finnish.setTextColor(Color.WHITE);
            holder.english.setText(word.get(position).word);
            holder.finnish.setText(word.get(position).meaning);



            return convertView;

        }

    }

    class ViewHolderDialog {


        TextView english, finnish;

    }
}
