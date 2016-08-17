package com.example.ansen.buttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_click_one).setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btn_click_one:
                    Toast.makeText(MainActivity.this,"Button点击事件1",Toast.LENGTH_LONG).show();
                    break;
            }
        }
    };


    public void click(View v){
        switch (v.getId()){
            case R.id.btn_click_two:
                Toast.makeText(MainActivity.this,"Button点击事件2",Toast.LENGTH_LONG).show();
                break;
        }
    }


}
