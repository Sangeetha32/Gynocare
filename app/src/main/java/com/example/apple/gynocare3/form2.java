package com.example.apple.gynocare3;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

        import org.w3c.dom.Text;

public class form2 extends AppCompatActivity {

    private static TextView btnNext2;
    private static TextView btnPrev2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form2);
        onBtnNext2();
        onBtnPrev2();
    }

    public void onBtnNext2()
    {
        btnNext2=(TextView)findViewById(R.id.next_page2);
        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form3");
                startActivity(intent);
            }
        });
    }

    public void onBtnPrev2()
    {
        btnPrev2=(TextView)findViewById(R.id.previous_page2);
        btnPrev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form1");
                startActivity(intent);
            }
        });
    }
}
