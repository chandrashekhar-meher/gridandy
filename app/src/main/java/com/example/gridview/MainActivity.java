package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
 int img[]={R.drawable.cow, R.drawable.bear,R.drawable.elephant,R.drawable.horse,R.drawable.panther,R.drawable.rabbit};
 String[] name={"bear","cow","elephant","horse","panther","rabbit"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView=findViewById(R.id.grid101);
        Adapter adapter=new Adapter(getApplicationContext(),img,name);
        gridView.setAdapter(adapter);

    }
}