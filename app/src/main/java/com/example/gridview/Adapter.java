package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter  extends BaseAdapter {
    Context context;
    int[] img;
    String[] name;
    LayoutInflater inflater;
    public Adapter(Context applicationContext, int[] img, String[] name) {
        this.context=applicationContext;
        this.img=img;
        this.name=name;
        inflater=(LayoutInflater.from(applicationContext)) ;

    }

    @Override
    public int getCount() {
        return img.length;

    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.gridlayout, null); // inflate the layout
        ImageView icon =  view.findViewById(R.id.img101);// get the reference of ImageView
        TextView textView =view.findViewById(R.id.txt101);
        icon.setImageResource(img[i]);// set logo images
       textView.setText((String)name[i]);
        return view;

    }
}
