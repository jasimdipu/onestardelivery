package com.example.onestardelivery.View.UI.BakalaCategory.HomeFrag;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.onestardelivery.R;
import com.example.onestardelivery.View.Adapter.CategoryCardAdapter;
import com.example.onestardelivery.View.Adapter.CategoryCardHelperModel;
import com.example.onestardelivery.View.Adapter.ProductCardAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class BakalaHomeFragment extends Fragment {

    private RecyclerView bakala_category_home_fragment, bakala_brands_home_fragment, bakala_products_home_fragment;
    private CategoryCardAdapter categoryCardAdapter;
    private ProductCardAdapter productCardAdapter;
    private CardView cat_card_bakala;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bakala_home, container, false);


        bakala_category_home_fragment = view.findViewById(R.id.bakala_category_home_fragment);
        bakala_brands_home_fragment = view.findViewById(R.id.bakala_brands_home_fragment);
        bakala_products_home_fragment = view.findViewById(R.id.bakala_products_home_fragment);
        cat_card_bakala = view.findViewById(R.id.cat_card_bakala);

        bakalaCategory();
        brandCategory();
        productList();

        return view;
    }

    private void bakalaCategory() {
        bakala_category_home_fragment.setHasFixedSize(true);
        int columnsNumber = 4;
        bakala_category_home_fragment.setLayoutManager(new GridLayoutManager(getContext(), columnsNumber));

        ArrayList<CategoryCardHelperModel> arrayList = new ArrayList<>();
        arrayList.add(new CategoryCardHelperModel(R.drawable.filter,
                R.drawable.baby, "Baby Care", "Filer Item"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.floor,
                R.drawable.facecare, "Parul Jahan", "Floor Care"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.harbalshampoo,
                R.drawable.harbalshampoo, "Shamol Hasan", "Harbal Shampoo"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.juice,
                R.drawable.juice, "Faruqe Ahmed", "Juice"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.milk,
                R.drawable.milk, "Tahmina Parvin", "Milk"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.milk,
                R.drawable.milk, "Tahmina Parvin", "Milk"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.baby,
                R.drawable.baby, "Baby Care", "Baby Care"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.facecare,
                R.drawable.facecare, "Parul Jahan", "Face Care"));

        categoryCardAdapter = new CategoryCardAdapter(arrayList);
        bakala_category_home_fragment.setAdapter(categoryCardAdapter);
    }

    private void brandCategory(){
        bakala_brands_home_fragment.setHasFixedSize(true);
        int columnsNumber = 4;
        bakala_brands_home_fragment.setLayoutManager(new GridLayoutManager(getContext(), columnsNumber));

        ArrayList<CategoryCardHelperModel> arrayList = new ArrayList<>();
        arrayList.add(new CategoryCardHelperModel(R.drawable.baby,
                R.drawable.baby, "Baby Care", "Jhonson"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.facecare,
                R.drawable.facecare, "Parul Jahan", "Nivea"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.harbalshampoo,
                R.drawable.harbalshampoo, "Shamol Hasan", "Himalya"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.juice,
                R.drawable.juice, "Faruqe Ahmed", "Amul"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.milkpowder,
                R.drawable.milk, "Tahmina Parvin", "NO-1"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.milk,
                R.drawable.milk, "Tahmina Parvin", "Milk"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.baby,
                R.drawable.baby, "Baby Care", "Baby Care"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.facecare,
                R.drawable.facecare, "Parul Jahan", "Face Care"));

        categoryCardAdapter = new CategoryCardAdapter(arrayList);
        bakala_brands_home_fragment.setAdapter(categoryCardAdapter);
    }

    private void productList(){

        bakala_products_home_fragment.setHasFixedSize(true);
        int columnsNumber = 2;
        bakala_products_home_fragment.setLayoutManager(new GridLayoutManager(getContext(), columnsNumber));

        ArrayList<CategoryCardHelperModel> arrayList = new ArrayList<>();
        arrayList.add(new CategoryCardHelperModel(R.drawable.baby,
                R.drawable.baby, "110", "Jhonson"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.facecare,
                R.drawable.facecare, "552", "Nivea"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.harbalshampoo,
                R.drawable.harbalshampoo, "Shamol Hasan", "Himalya"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.juice,
                R.drawable.juice, "135", "Amul"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.milkpowder,
                R.drawable.milk, "764", "NO-1"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.milk,
                R.drawable.milk, "875", "Milk"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.baby,
                R.drawable.baby, "567", "Baby Care"));
        arrayList.add(new CategoryCardHelperModel(R.drawable.facecare,
                R.drawable.facecare, "780", "Face Care"));

        productCardAdapter = new ProductCardAdapter(arrayList);
        bakala_products_home_fragment.setAdapter(productCardAdapter);
    }
}