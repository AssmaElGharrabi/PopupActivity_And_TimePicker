package com.example.popactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction manager = getSupportFragmentManager().beginTransaction();
        popActivity pop = new popActivity();
        pop.show(manager, null);
    }

    public void SetData(String data){
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(data);
    }
}