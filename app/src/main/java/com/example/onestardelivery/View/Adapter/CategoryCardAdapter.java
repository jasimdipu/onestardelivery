package com.example.onestardelivery.View.Adapter;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.onestardelivery.R;
import com.example.onestardelivery.View.Adapter.CategoryCardHelperModel;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryCardAdapter extends RecyclerView.Adapter<CategoryCardAdapter.CategoryCardViewHold> {

    ArrayList<CategoryCardHelperModel> arrayList;

    public CategoryCardAdapter(ArrayList<CategoryCardHelperModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public CategoryCardViewHold onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_card_bakala_home_fragment, parent, false);
        return new CategoryCardViewHold(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  CategoryCardViewHold holder, int position) {
        CategoryCardHelperModel categoryCardHelperModel = arrayList.get(position);
        holder.thumbnailImage_home_fragment.setImageResource(categoryCardHelperModel.getThumbnailImage());
        holder.title_category_home_fragment.setText(categoryCardHelperModel.getCategoryCardTitle());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class CategoryCardViewHold extends RecyclerView.ViewHolder {

        ImageView thumbnailImage_home_fragment;
        TextView instructorName_home_fragment, title_category_home_fragment;

        public CategoryCardViewHold(@NonNull  View itemView) {
            super(itemView);

            thumbnailImage_home_fragment = itemView.findViewById(R.id.thumbnailImage_home_fragment);
            title_category_home_fragment = itemView.findViewById(R.id.title_category_home_fragment);

            Typeface typeface = ResourcesCompat.getFont(itemView.getContext(), R.font.quicksandbold);
            title_category_home_fragment.setTypeface(typeface);
        }
    }
}
