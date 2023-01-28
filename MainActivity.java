package com.example.bendemeermakan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button kopitiam;
    Button morekopitiam;
    Button market;
    Button fastfood;
    Button restaurants;
    Button morerestaurant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kopitiam = findViewById(R.id.kopitiam);
        kopitiam.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,KopiTiamActivity.class);
                        startActivity(i);
                    }
                }
        );

        morekopitiam = findViewById(R.id.morekoptiam);
        morekopitiam.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,MoreKopiTiamMainActivity.class);
                        startActivity(i);
                    }
                }
        );

        market = findViewById(R.id.market);
        market.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,MarketActivity.class);
                        startActivity(i);
                    }
                }
        );

        fastfood = findViewById(R.id.fastfood);

        fastfood.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,FastFoodActivity.class);
                        startActivity(i);
                    }
                }
        );

        restaurants = findViewById(R.id.restaurant);

        restaurants.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,RestaurantActivity.class);
                        startActivity(i);
                    }
                }
        );

        morerestaurant = findViewById(R.id.morerestaurant);

        morerestaurant.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,MoreRestaurantActivity.class);
                        startActivity(i);
                    }
                }
        );



    }
}