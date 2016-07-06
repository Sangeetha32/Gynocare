package com.example.apple.gynocare3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class form3 extends AppCompatActivity {

    private static TextView btnNext3;
    private static TextView btnPrev3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form3);
        onBtnNext3();
        onBtnPrev3();
    }

    public void onBtnNext3()
    {
        btnNext3=(TextView)findViewById(R.id.next_page3);
        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form4");
                startActivity(intent);
            }
        });
    }

    public void onBtnPrev3()
    {
        btnPrev3=(TextView)findViewById(R.id.previous_page3);
        btnPrev3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form2");
                startActivity(intent);
            }
        });
    }
}
