package com.Foodery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WhoActivity extends AppCompatActivity {

    Button sellerButton, buyerButton, driverButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who);

        sellerButton = findViewById(R.id.sellerButton);
        buyerButton = findViewById(R.id.buyerButton);
        driverButton = findViewById(R.id.driverButton);

        sellerButton.setOnClickListener(v -> startActivity(new Intent(WhoActivity.this, SellerActivity.class)));

        buyerButton.setOnClickListener(v -> startActivity(new Intent(WhoActivity.this, MainActivity.class)));

        driverButton.setOnClickListener(v -> {
//                startActivity(new Intent(WhoActivity.this, .class));
        });

    }
}