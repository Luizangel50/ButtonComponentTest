package com.luizangel.buttoncomponenttest;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.luizangel.buttoncomponenttest.databinding.ActivityMainBinding;
import com.luizangel.buttoncomponenttest.views.LoginButtonView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setListener();
    }

    protected void setListener() {
        final Context context = this;
        binding.requestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.requestButton.setState(LoginButtonView.STATE_LOADING, context);
                Toast.makeText(context, "button clicked", Toast.LENGTH_LONG).show();
            }
        });
    }


}
