package com.siubie.recylcerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.siubie.recylcerview.adapter.MyAdapter;


public class MainActivity extends AppCompatActivity {
    public RecyclerView mRecyclerView;
    public RecyclerView.LayoutManager mLayoutManager;
    public RecyclerView.Adapter mAdapter;
    public String[] mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mData = new String[]{"Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi","Ronaldo", "Messi",};
        mAdapter = new MyAdapter(mData);
        mRecyclerView.setAdapter(mAdapter);
    }
}
