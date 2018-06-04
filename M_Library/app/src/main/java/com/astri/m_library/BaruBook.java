package com.astri.m_library;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class BaruBook extends AppCompatActivity {


    String [] titles={"Algoritma Pemrograman", "Android", "AutoCad", "Mekanik", "Matematika Distrik", };
    String [] deskrif={"Merupakan buku yang mempelajari tentang logika", "merupakan buku tentang pemrograman android", "mempelajari tentang design 3D", "mempelajari tentang mesin","mempelajari tentang matematika distrik"};
    int [] images = {R.drawable.alprog, R.drawable.android, R.drawable.autocad, R.drawable.mekanik, R.drawable.mtk_diskrit};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baru_book);

        listView = (ListView) findViewById(R.id.idlistview);
        MyAdapter adapter = new MyAdapter(this,titles, deskrif,images);
        listView.setAdapter(adapter);
    }
}
class MyAdapter extends ArrayAdapter{
    int [] imageArray;
    String [] titleArray;
    String [] deskArray;
    public MyAdapter(Context context, String[] titles1, String[] deskrifsi1, int [] img1){
        super(context, R.layout.barunewbuku, R.id.idtitle, titles1);
        this.imageArray = img1;
        this.titleArray = titles1;
        this.deskArray = deskrifsi1;
    }
    @NonNull
    @Override
    public View getView(int position, View convertview, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.barunewbuku, parent, false);

        ImageView imageView = (ImageView) row.findViewById(R.id.idfic);
        TextView textView = (TextView) row.findViewById(R.id.idtitle);
        TextView textView1 = (TextView) row.findViewById(R.id.iddesk);

        imageView.setImageResource(imageArray[position]);
        textView.setText(titleArray[position]);
        textView1.setText(deskArray[position]);
        return row;
    }
}
