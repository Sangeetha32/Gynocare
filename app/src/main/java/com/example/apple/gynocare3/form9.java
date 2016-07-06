package com.example.apple.gynocare3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class form9 extends AppCompatActivity {

    private static TextView btnPrev9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form9);
        onBtnPrev9();
    }

    public void onBtnPrev9()
    {
        btnPrev9=(TextView)findViewById(R.id.previous_page9);
        btnPrev9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form8");
                startActivity(intent);
            }
        });
    }
}
