package com.dmi3coder.bindingexample.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.dmi3coder.bindingexample.R;

public class SimpleActivity extends AppCompatActivity implements View.OnClickListener {
    private Button firstCatButton;
    private Button secondCatButton;
    private Button thirdCatButton;
    private ImageView catImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        firstCatButton = (Button) findViewById(R.id.button_cat_1);
        secondCatButton = (Button) findViewById(R.id.button_cat_2);
        thirdCatButton = (Button) findViewById(R.id.button_cat_3);
        catImage = (ImageView) findViewById(R.id.image_cat);
        firstCatButton.setOnClickListener(this);
        secondCatButton.setOnClickListener(this);
        thirdCatButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_cat_1:
                catImage.setImageResource(R.drawable.simple_cat1);
                break;
            case R.id.button_cat_2:
                catImage.setImageResource(R.drawable.simple_cat2);
                break;
            case R.id.button_cat_3:
                catImage.setImageResource(R.drawable.simple_cat3);
                break;
        }
    }
}
