package com.emssoft.knowfinnish;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mamun on 4/27/2018.
 */

public class Nations extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    ListView listView;
    List<RowData> rowDatas;

    String main_tile[],sub_title[], new_title[];
    TypedArray img_tile, song;
    ImageView filintheblnks, toolbartn,toolbarbt;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ctivity_main);
        listView=(ListView)findViewById(R.id.listview);
        listView.setOnItemClickListener(this);
        rowDatas=new ArrayList<RowData>();
        main_tile=getResources().getStringArray(R.array.nationsandnationalities_title);
        sub_title=getResources().getStringArray(R.array.nationsandnationalitiessub_title);

        img_tile=getResources().obtainTypedArray(R.array.nationsandnationalitiesimage_title);
        new_title=getResources().getStringArray(R.array.nationsandnationalitiesnew_title);
        song=getResources().obtainTypedArray(R.array.nationsandnationalitiessong);



        filintheblnks = (ImageView) findViewById(R.id.flahcards);


        filintheblnks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Nations.this, NationsCard.class));
            }
        });

        toolbartn = (ImageView) findViewById(R.id.text2text);


        toolbartn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Nations.this, NationsText.class));
            }
        });

        toolbarbt = (ImageView) findViewById(R.id.text2image);


        toolbarbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Nations.this, NationsImage.class));
            }
        });


        //hide actionbar
        Nations.this.getSupportActionBar().hide();
        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        //Get rid of the title drawn by the toolbar automatically
        toolbar.setTitle("Nations");
        TextView toolbarTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);


        for(int i=0;i<main_tile.length;i++)
        {

            RowData rowData=new RowData(main_tile[i],sub_title[i],img_tile.getResourceId(i,-1), song.getResourceId(i,-1));
            rowDatas.add(rowData);
        }

        MyAdapter myAdapter=new MyAdapter(getApplicationContext(),rowDatas);
        myAdapter.notifyDataSetChanged();
        listView.setAdapter(myAdapter);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Intent intent=new Intent(Nations.this, MoreInfo.class);


        switch(i){
            case 0:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[0]);


                break;
            case 1:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[1]);

                break;

            case 2:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[2]);

                break;
            case 3:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[3]);
                break;
            case 4:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[4]);
                break;
            case 5:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[5]);
                break;
            case 6:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[6]);
                break;
            case 7:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[7]);
                break;
            case 8:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[8]);
                break;
            case 9:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[9]);
                break;

            case 10:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[10]);
                break;
            case 11:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[11]);
                break;
            case 12:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[12]);
                break;
            case 13:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[13]);
                break;
            case 14:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[14]);
                break;
            case 15:
                intent.putExtra("description",getResources().getStringArray(R.array.nationsandnationalitiesnew_title)[15]);

        }

        startActivity(intent);

    }

}

