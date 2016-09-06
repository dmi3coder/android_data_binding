package com.dmi3coder.bindingexample.simple;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.dmi3coder.bindingexample.R;
import com.dmi3coder.bindingexample.databinding.ActivitySimpleBinding;

public class SimpleActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivitySimpleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_simple);
        binding.buttonCat1.setOnClickListener(this);
        binding.buttonCat2.setOnClickListener(this);
        binding.buttonCat3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_cat_1:
                binding.imageCat.setImageResource(R.drawable.simple_cat1);
                break;
            case R.id.button_cat_2:
                binding.imageCat.setImageResource(R.drawable.simple_cat2);
                break;
            case R.id.button_cat_3:
                binding.imageCat.setImageResource(R.drawable.simple_cat3);
                break;
        }
    }
}
