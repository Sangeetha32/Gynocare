package com.example.apple.gynocare3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class form4 extends AppCompatActivity {

    private static TextView btnNext4;
    private static TextView btnPrev4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form4);
        onBtnNext4();
        onBtnPrev4();

    }

    public void onBtnNext4()
    {
        btnNext4=(TextView)findViewById(R.id.next_page4);
        btnNext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form5");
                startActivity(intent);
            }
        });
    }

    public void onBtnPrev4()
    {
        btnPrev4=(TextView)findViewById(R.id.previous_page4);
        btnPrev4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form3");
                startActivity(intent);
            }
        });
    }
}
