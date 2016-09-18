package com.siubie.recylcerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.siubie.recylcerview.adapters.MyEmailAdapter;
import com.siubie.recylcerview.models.MyEmail;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private List<MyEmail> myEmails = new ArrayList<>();
    private MyEmail email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        email = new MyEmail("Pengirim0","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim1","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim2","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim2","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim0","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim1","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim2","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim2","Subject","Ringkasan .....","09:00");
        myEmails.add(email);
        email = new MyEmail("Pengirim0","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim1","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim2","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim2","Subject","Ringkasan .....","09:00");
        myEmails.add(email);
        email = new MyEmail("Pengirim0","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim1","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim2","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim2","Subject","Ringkasan .....","09:00");
        myEmails.add(email);
        email = new MyEmail("Pengirim0","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim1","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim2","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim2","Subject","Ringkasan .....","09:00");
        myEmails.add(email);
        email = new MyEmail("Pengirim0","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim1","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim2","Subject","Ringkasan .....","09:00");
        myEmails.add(email);

        email = new MyEmail("Pengirim2","Subject","Ringkasan .....","09:00");
        myEmails.add(email);
        mAdapter = new MyEmailAdapter(myEmails);

        mRecyclerView.setAdapter(mAdapter);
    }


}
