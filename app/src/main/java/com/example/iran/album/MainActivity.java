package com.example.iran.album;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView image1 = (ImageView)findViewById(R.id.image1);
        ImageView image2 = (ImageView) findViewById(R.id.image2);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id) {
            case R.id.image1:
                Intent intent = new Intent(MainActivity.this, ShomalActivity.class);
                startActivity(intent);
                break;

            case R.id.image2:
                Intent intentt = new Intent(MainActivity.this , KishActivity.class);
                startActivity(intentt);


        }
    }
}
