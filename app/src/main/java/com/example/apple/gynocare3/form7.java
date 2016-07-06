package com.example.apple.gynocare3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class form7 extends AppCompatActivity {

    private static TextView btnNext7;
    private static TextView btnPrev7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form7);
        onBtnPrev7();
        onBtnNext7();
    }
    public void onBtnNext7()
    {
        btnNext7=(TextView)findViewById(R.id.next_page7);
        btnNext7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form8");
                startActivity(intent);
            }
        });
    }

    public void onBtnPrev7()
    {
        btnPrev7=(TextView)findViewById(R.id.previous_page7);
        btnPrev7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form6");
                startActivity(intent);
            }
        });
    }
}
