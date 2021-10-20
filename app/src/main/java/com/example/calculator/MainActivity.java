package com.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static int count = 0;
    SimpleDateFormat format;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClick = findViewById(R.id.btn_click);//控件的获取
        btnClick.setOnClickListener(MainActivity.this);
        //需要传入接口实现类的实例。
        //此时接口实现类的实例为MainActivity
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_click:
                Toast.makeText(MainActivity.this,
                        "按钮被点击" + String.valueOf(count++) + "次", Toast.LENGTH_SHORT).show();
                format = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
                Log.v(format.format(new Date()), "按钮被点击");
        }
    }
}