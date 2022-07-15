package com.cs50.recycleview2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {
    TextView tV1,tV2;
    ImageView iV1;


    public MyHolder(@NonNull View itemView) {
        super(itemView);
        tV1=(TextView) itemView.findViewById(R.id.tV1);
        tV2=(TextView) itemView.findViewById(R.id.tV2);
        iV1=(ImageView) itemView.findViewById(R.id.iV1);
    }
}
