package com.bioapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        EditText hobbies=findViewById(R.id.textHobbies);
        EditText f=findViewById(R.id.res);


       final String res=hobbies.getText().toString();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f.setVisibility(view.VISIBLE);

           f.setText(hobbies.getText().toString());



            }
        });
    }







}