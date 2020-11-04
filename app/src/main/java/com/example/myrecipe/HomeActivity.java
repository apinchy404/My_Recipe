package com.example.myrecipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button btnBurger,btnBiriyani,btnCake,btnPizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnBurger=findViewById(R.id.btn_burger);
        btnBiriyani=findViewById(R.id.btn_biriyani);
        btnCake=findViewById(R.id.btn_cake);
        btnPizza=findViewById(R.id.btn_pizza);

        btnBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("recipe","burger");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Falafel Burger", Toast.LENGTH_SHORT).show();
            }
        });

        btnBiriyani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("recipe","biriyani");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Chicken Biriyani", Toast.LENGTH_SHORT).show();
            }
        });
        btnCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("recipe","cake");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Chocklate Cake", Toast.LENGTH_SHORT).show();
            }
        });
        btnPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("recipe","pizza");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Mexican Pizza", Toast.LENGTH_SHORT).show();
            }
        });

    }
}