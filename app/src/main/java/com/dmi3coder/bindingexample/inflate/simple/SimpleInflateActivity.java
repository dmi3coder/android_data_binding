package com.dmi3coder.bindingexample.inflate.simple;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dmi3coder.bindingexample.R;
import com.dmi3coder.bindingexample.databinding.ActivitySimpleInflateBinding;

import java.util.Date;

public class SimpleInflateActivity extends AppCompatActivity {
        ActivitySimpleInflateBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_inflate);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_inflate);
        binding.setProfile(new Profile("Android","Best cat in 8Wizards company",true,new Date(),351,false));
    }
}
