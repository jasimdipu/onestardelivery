package com.example.onestardelivery.View.Adapter;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onestardelivery.R;

import java.util.ArrayList;

public class ProductCardAdapter  extends RecyclerView.Adapter<ProductCardAdapter.ProductCardViewHold> {

    ArrayList<CategoryCardHelperModel> arrayList;

    public ProductCardAdapter(ArrayList<CategoryCardHelperModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ProductCardViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_card, parent, false);
        return new ProductCardViewHold(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductCardViewHold holder, int position) {
        CategoryCardHelperModel categoryCardHelperModel = arrayList.get(position);
        holder.thumbnailImage_home_fragment.setImageResource(categoryCardHelperModel.getThumbnailImage());
        holder.title_product_home_fragment.setText(categoryCardHelperModel.getCategoryCardTitle());
        holder.title_product_price_home_fragment.setText(categoryCardHelperModel.getInstructorName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ProductCardViewHold extends RecyclerView.ViewHolder {

        ImageView thumbnailImage_home_fragment;
        TextView title_product_home_fragment, title_product_price_home_fragment;

        public ProductCardViewHold(@NonNull  View itemView) {
            super(itemView);

            thumbnailImage_home_fragment = itemView.findViewById(R.id.thumbnailImage_home_fragment);
            title_product_home_fragment = itemView.findViewById(R.id.title_product_home_fragment);
            title_product_price_home_fragment = itemView.findViewById(R.id.title_product_price_home_fragment);

        }
    }

}
