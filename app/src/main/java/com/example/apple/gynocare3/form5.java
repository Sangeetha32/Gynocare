package com.example.apple.gynocare3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class form5 extends AppCompatActivity {

    private static TextView btnNext5;
    private static TextView btnPrev5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form5);
        onBtnNext5();
        onBtnPrev5();
    }
    public void onBtnNext5()
    {
        btnNext5=(TextView)findViewById(R.id.next_page5);
        btnNext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form6");
                startActivity(intent);
            }
        });
    }

    public void onBtnPrev5()
    {
        btnPrev5=(TextView)findViewById(R.id.previous_page5);
        btnPrev5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form4");
                startActivity(intent);
            }
        });
    }
}
