package com.siubie.recylcerview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.siubie.recylcerview.R;
import com.siubie.recylcerview.models.MyEmail;


import java.util.List;

/**
 * Created by siubie on 18/09/16.
 */
public class MyEmailAdapter extends RecyclerView.Adapter<MyEmailAdapter.ViewHolder> {
    public List<MyEmail> myEmails;
    public MyEmailAdapter(List<MyEmail> myEmails) {
        this.myEmails = myEmails;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_email,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MyEmail email = myEmails.get(position);
        holder.pengirim.setText(email.getPengirim());
        holder.ringkasan.setText(email.getRingkasan());
        holder.waktu.setText(email.getWaktu());
        holder.subject.setText(email.getSubject());
    }

    @Override
    public int getItemCount() {
        return myEmails.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView pengirim,subject,ringkasan,waktu;
        public ViewHolder(View itemView) {
            super(itemView);
            pengirim = (TextView) itemView.findViewById(R.id.pengirim);
            subject = (TextView) itemView.findViewById(R.id.subject);
            ringkasan = (TextView) itemView.findViewById(R.id.ringkasan);
            waktu = (TextView) itemView.findViewById(R.id.waktu);
        }
    }
}
