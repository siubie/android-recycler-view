package com.siubie.recylcerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.siubie.adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] myDataset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setHasFixedSize(true );
        mLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setLayoutManager(mLayoutManager);
        myDataset = createData();
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }

    public String[] createData(){
        String[] contact = {
                "Abundance",
                "Anxiety",
                "Bruxism",
                "Discipline",
                "Drug Addiction",
                "Abundance",
                "Abundance",
                "Abundance",
                "Abundance",
                "Abundance",
                "Abundance",
                "Abundance",
                "Anxiety",
                "Bruxism",
                "Discipline",
                "Drug Addiction",
                "Anxiety",
                "Bruxism",
                "Discipline",
                "Drug Addiction",
                "Anxiety",
                "Bruxism",
                "Discipline",
                "Drug Addiction",
                "Anxiety",
                "Bruxism",
                "Discipline",
                "Drug Addiction",
                "Anxiety",
                "Bruxism",
                "Discipline",
                "Drug Addiction",
                "Anxiety",
                "Bruxism",
                "Discipline",
                "Drug Addiction",
                "Anxiety",
                "Bruxism",
                "Discipline",
                "Drug Addiction",
        };
        return contact;
    }
}
