package com.example.iran.album;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShomalActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shomal);

        Button btn_home = findViewById(R.id.home);
        Button btn_kish = findViewById(R.id.kish);


        btn_home.setOnClickListener(this);
        btn_kish.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id){
            case R.id.home:
                Intent intent = new Intent(ShomalActivity.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.kish:
                Intent intent3 = new Intent(ShomalActivity.this, KishActivity.class);
                startActivity(intent3);
                break;


        }
    }
}
