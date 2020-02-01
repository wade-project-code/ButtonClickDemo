package com.example.buttonclickdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Wade on 2020/2/1.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtn02;
    private Button mBtn03;
    private Button mBtn04;
    private Button mBtn05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        mBtn02 = findViewById(R.id.mBtn02);
        mBtn03 = findViewById(R.id.mBtn03);
        mBtn04 = findViewById(R.id.mBtn04);
        mBtn05 = findViewById(R.id.mBtn05);

        mBtn02.setOnClickListener(mBtn02_click);

        mBtn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Button03 click");
            }
        });

        mBtn04.setOnClickListener(this);

        mBtn05.setOnClickListener(new mBtn05_click());
    }

    public void onButClick(View view) {
        showToast("Button01 click");
    }

    private View.OnClickListener mBtn02_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            showToast("Button02 click");
        }
    };

    @Override
    public void onClick(View view) {
        showToast("Button04 click");
    }

    private void showToast(String msg){
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
    }

    private class mBtn05_click implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            showToast("Button05 click");
        }
    }
}
