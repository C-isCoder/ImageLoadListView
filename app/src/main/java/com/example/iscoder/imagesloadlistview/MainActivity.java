package com.example.iscoder.imagesloadlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.iscoder.adapter.ImageAdapter;
import com.example.iscoder.model.Images;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
        String[] images = Images.imageUrls;
        ImageAdapter mAdapter = new ImageAdapter(this, 0, images);
        listView.setAdapter(mAdapter);
    }
}
