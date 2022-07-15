package com.cs50.recycleview2;

import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<MyHolder> {

    ArrayList<Model> data;
    Context context;

    public Adapter(ArrayList<Model> data,Context context) {
        this.data = data;
        this.context=context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.singlerowdata,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        final Model temp=data.get(position);
        holder.tV1.setText(data.get(position).getName());
        holder.tV2.setText(data.get(position).getDesc());
        holder.iV1.setImageResource(data.get(position).getImg());

        holder.iV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,secondPage.class);
                intent.putExtra("image",temp.getImg());
                intent.putExtra("header",temp.getName());
                intent.putExtra("desc",temp.getDesc());

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
