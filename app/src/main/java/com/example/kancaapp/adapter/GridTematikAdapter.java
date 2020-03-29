package com.example.kancaapp.adapter;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.kancaapp.R;
import com.example.kancaapp.SubtemaActivity;
import com.example.kancaapp.fragments.TematikFragment;
import com.example.kancaapp.model.TematikAttribute;

import java.util.ArrayList;

public class GridTematikAdapter extends RecyclerView.Adapter<GridTematikAdapter.GridViewHolder> {
    private ArrayList<TematikAttribute> listTematik = new ArrayList<>();

    private ArrayList<TematikAttribute> getData(){
        return listTematik;
    }


    public void setData(ArrayList<TematikAttribute> items){
        listTematik.clear();
        listTematik.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tematik, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridTematikAdapter.GridViewHolder holder, final int position) {
        TematikAttribute tematikAttribute = listTematik.get(position);

        Glide.with(holder.itemView.getContext()).load(tematikAttribute.getIconTematik()).into(holder.iconTematik);
        holder.titleTematik.setText(tematikAttribute.getTitleTematik());

    }

    @Override
    public int getItemCount() {
        return listTematik.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView iconTematik;
        TextView titleTematik;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);

            iconTematik = itemView.findViewById(R.id.image_icon);
            titleTematik = itemView.findViewById(R.id.text_description);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            TematikAttribute tematikAttribute = listTematik.get(position);

            Intent intent = new Intent(itemView.getContext(), SubtemaActivity.class);
            intent.putExtra(SubtemaActivity.EXTRA_ITEM, tematikAttribute);
            intent.putExtra(SubtemaActivity.EXTRA_POSITION, position);
            view.getContext().startActivity(intent);

        }
    }
}
