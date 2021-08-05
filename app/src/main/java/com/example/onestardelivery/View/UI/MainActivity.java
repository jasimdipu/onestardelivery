package com.example.onestardelivery.View.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.onestardelivery.R;
import com.example.onestardelivery.View.UI.BakalaCategory.BakalaActivity;
import com.example.onestardelivery.View.UI.SuperShopCategory.SuperShopActivity;

public class MainActivity extends AppCompatActivity {

    private CardView bakalaCategory, superShopCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bakalaCategory = findViewById(R.id.bakala_category);
        superShopCategory = findViewById(R.id.super_shop_category);

        bakalaCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BakalaActivity.class));
            }
        });

        superShopCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SuperShopActivity.class));
            }
        });



    }
}