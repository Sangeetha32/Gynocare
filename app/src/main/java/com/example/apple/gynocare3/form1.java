package com.example.apple.gynocare3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class form1 extends AppCompatActivity {

    private static TextView btnNext1;
    private static TextView btnPrev1;
    EditText name;
    EditText regno;
    EditText wifeof;
    EditText mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form1);

        onButton();

        onBtnPrev1();
    }

    public void onButton()
    {
        btnNext1=(TextView) findViewById(R.id.next_page1);
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ValidationSuccess()){
                    onBtnNext1();


                }
            }
        });
    }

    private boolean ValidationSuccess(){

        name=(EditText)findViewById(R.id.name_box);
        regno=(EditText)findViewById(R.id.reg_box);
        wifeof=(EditText)findViewById(R.id.wife_box);
        mobile=(EditText)findViewById(R.id.mobile_box);

        if (name.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(getApplicationContext(),"please enter name",Toast.LENGTH_SHORT).show();
            name.setError("Please enter name");

            return false;
        }

        if (regno.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(getApplicationContext(),"please enter registration number",Toast.LENGTH_SHORT).show();
            regno.setError("Please enter registration number");

            return false;
        }
        if (wifeof.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(getApplicationContext(),"please enter name",Toast.LENGTH_SHORT).show();
            wifeof.setError("Please enter name");

            return false;
        }

        if (mobile.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(getApplicationContext(),"please enter mobile number",Toast.LENGTH_SHORT).show();
            mobile.setError("Please enter mobile number");

            return false;
        }



        return true;


    }

    public void onBtnNext1()
    {
        btnNext1=(TextView)findViewById(R.id.next_page1);
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.form2");
                startActivity(intent);
            }
        });
    }
    public void onBtnPrev1()
    {
        btnPrev1=(TextView)findViewById(R.id.previous_page1);
        btnPrev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.apple.gynocare3.MainActivity");
                startActivity(intent);
            }
        });
    }
}
