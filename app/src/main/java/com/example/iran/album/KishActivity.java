package com.example.iran.album;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KishActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kish);

        Button btn1 = findViewById(R.id.homee);
        Button btn2 = findViewById(R.id.shomal);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){

            case R.id.homee:
                Intent intent1 = new Intent(KishActivity.this,MainActivity.class);
                startActivity(intent1);
                break;

            case R.id.shomal:
                Intent intent2 = new Intent(KishActivity.this , ShomalActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
