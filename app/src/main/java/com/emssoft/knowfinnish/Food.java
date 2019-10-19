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

public class Food extends AppCompatActivity implements AdapterView.OnItemClickListener
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
        main_tile=getResources().getStringArray(R.array.food_title);
        sub_title=getResources().getStringArray(R.array.foodsub_title);

        img_tile=getResources().obtainTypedArray(R.array.foodimage_title);
        new_title=getResources().getStringArray(R.array.foodnew_title);
        song=getResources().obtainTypedArray(R.array.foodsong);


        filintheblnks = (ImageView) findViewById(R.id.flahcards);


        filintheblnks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Food.this, FoodCard.class));
            }
        });

        toolbartn = (ImageView) findViewById(R.id.text2text);


        toolbartn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Food.this, FoodText.class));
            }
        });

        toolbarbt = (ImageView) findViewById(R.id.text2image);


        toolbarbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Food.this, FoodImage.class));
            }
        });


        //hide actionbar
        Food.this.getSupportActionBar().hide();
        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        //Get rid of the title drawn by the toolbar automatically
        toolbar.setTitle("Food");
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

        Intent intent=new Intent(Food.this, MoreInfo.class);


        switch(i){
            case 0:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[0]);
                break;
            case 1:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[1]);
                break;

            case 2:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[2]);
                break;
            case 3:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[3]);
                break;
            case 4:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[4]);
                break;
            case 5:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[5]);
                break;
            case 6:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[6]);
                break;
            case 7:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[7]);
                break;
            case 8:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[8]);
                break;
            case 9:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[9]);
                break;

            case 10:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[10]);

                break;
            case 11:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[11]);
                break;
            case 12:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[12]);
                break;
            case 13:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[13]);
                break;
            case 14:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[14]);
                break;
            case 15:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[15]);
                break;
            case 16:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[16]);
                break;
            case 17:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[17]);
                break;
            case 18:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[18]);
                break;
            case 19:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[19]);
                break;
            case 20:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[20]);


                break;

            case 21:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[21]);
                break;
            case 22:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[22]);
                break;
            case 23:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[23]);
                break;
            case 24:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[24]);
                break;
            case 25:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[25]);
                break;
            case 26:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[26]);
                break;
            case 27:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[27]);
                break;
            case 28:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[28]);
                break;
            case 29:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[29]);
                break;
            case 30:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[30]);


                break;


            case 31:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[31]);
                break;
            case 32:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[32]);
                break;
            case 33:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[33]);
                break;
            case 34:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[34]);
                break;
            case 35:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[35]);
                break;
            case 36:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[36]);
                break;
            case 37:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[37]);
                break;
            case 38:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[38]);
                break;
            case 39:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[39]);
                break;
            case 40:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[40]);

                break;


            case 41:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[41]);
                break;
            case 42:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[42]);
                break;
            case 43:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[43]);
                break;
            case 44:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[44]);
                break;
            case 45:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[45]);
                break;
            case 46:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[46]);
                break;
            case 47:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[47]);
                break;
            case 48:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[48]);
                break;
            case 49:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[49]);
                break;
            case 50:
                intent.putExtra("description",getResources().getStringArray(R.array.foodnew_title)[50]);


        }
        startActivity(intent);

    }

}

