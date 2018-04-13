package com.example.shiyan42;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        View view1 = View.inflate(MainActivity.this, R.layout.tile, null);
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "默认的Toast", Toast.LENGTH_SHORT).show();
            };
        });
        builder.setView(view1);
        builder.show();
    }
//    // 创建对话框构建器
//    AlertDialog.Builder builder = new AlertDialog.Builder(this);
//    // 获取布局
//    View view2 = View.inflate(MainActivity.this, R.layout.tile, null);
//    // 获取布局中的控件
//    final EditText username = (EditText) view2.findViewById(R.id.usr);
//    final EditText password = (EditText) view2.findViewById(R.id.pass);
//    final Button button = (Button) view2.findViewById(R.id.button);
//    final AlertDialog alertDialog = builder.create();
//
//    alertDialog
//    public void showNormalDialog(View v)
//    {
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        View view1 = View.inflate(MainActivity.this, R.layout.tile, null);
//        builder.setView(v);
//        builder.show();
//
//    }




}







