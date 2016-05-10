package com.example.seetharaman.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);
    }

    @Override
    public void onClick(View v) {
        /**
         * Set Responses for when each button is clicked
         */
        switch (v.getId()){

            case R.id.b_app1:
                Toast.makeText(v.getContext(), "This will launch the Popular Movies App", Toast.LENGTH_SHORT).show();
                break;

            case R.id.b_app2:
                Toast.makeText(v.getContext(), "This will launch the Stock Hawk App", Toast.LENGTH_SHORT).show();
                break;

            case R.id.b_app3:
                Toast.makeText(v.getContext(), "This will launch the Build It Bigger App", Toast.LENGTH_SHORT).show();
                break;

            case R.id.b_app4:
                Toast.makeText(v.getContext(), "This will launch the Make Your App Material App", Toast.LENGTH_SHORT).show();
                break;

            case R.id.b_app5:
                Toast.makeText(v.getContext(), "This will launch the Go Ubiquitous App", Toast.LENGTH_SHORT).show();
                break;

            case R.id.b_app6:
                Toast.makeText(v.getContext(), "This will launch the Capstone App", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

