package com.example.coffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.Key;

import static com.example.coffe.Drink.drinks;

public class DrinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        TextView name = (TextView)findViewById(R.id.name);
        TextView desc = (TextView)findViewById(R.id.description);
        ImageView image = (ImageView)findViewById(R.id.photo);

        Bundle i2 = getIntent().getExtras();
        int pos2 = i2.getInt("LIST");
        Drink d2 = drinks[pos2];
        name.setText(d2.getName());
        desc.setText(d2.getDesctiption());
        image.setImageResource(d2.getImageDesourceld());



    }



}
