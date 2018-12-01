package com.example.stl.story;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Profession extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button2;
    public static String profession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profession);


        textView = (TextView)findViewById(R.id.text_dob);
        editText = (EditText)findViewById(R.id.editText_dob);
        button2 = (Button)findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                profession = editText.getText().toString();
                Intent intent = new Intent(Profession.this, Hobby.class);
                startActivity(intent);
            }
        });

    }
}


