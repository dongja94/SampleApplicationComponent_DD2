package com.begentgroup.sampleapplicationcomponent;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FragmentInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_in);

        Button btn = (Button)findViewById(R.id.btn_one);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager()
                        .beginTransaction();
                OneFragment f = new OneFragment();
                ft.replace(R.id.container, f);
                ft.commit();
            }
        });

        btn = (Button)findViewById(R.id.btn_two);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager()
                        .beginTransaction();
                TwoFragment f = new TwoFragment();
                ft.replace(R.id.container, f);
                ft.commit();
            }
        });
    }
}
