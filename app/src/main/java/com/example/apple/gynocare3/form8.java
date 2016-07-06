package com.example.apple.gynocare3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class form8 extends AppCompatActivity {

    private static TextView btnNext8;
    private static TextView btnPrev8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form8);
        onBtnNext8();
        onBtnPrev8();
    }
    public void onBtnNext8()
    {
        btnNext8=(TextView)findViewById(R.id.next_page8);
        btnNext8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form9");
                startActivity(intent);
            }
        });
    }

    public void onBtnPrev8()
    {
        btnPrev8=(TextView)findViewById(R.id.previous_page8);
        btnPrev8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form7");
                startActivity(intent);
            }
        });
    }
}
