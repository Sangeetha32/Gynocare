package com.example.apple.gynocare3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class form6 extends AppCompatActivity {

    private static TextView btnNext6;
    private static TextView btnPrev6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form6);
        onBtnNext6();
        onBtnPrev6();
    }
    public void onBtnNext6()
    {
        btnNext6=(TextView)findViewById(R.id.next_page6);
        btnNext6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form7");
                startActivity(intent);
            }
        });
    }

    public void onBtnPrev6()
    {
        btnPrev6=(TextView)findViewById(R.id.previous_page6);
        btnPrev6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form5");
                startActivity(intent);
            }
        });
    }
}
