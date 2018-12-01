package com.example.stl.story;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Hobby extends AppCompatActivity {


    TextView textView;
    EditText editText;
    Button button3;
    public static String hobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hobby);


        textView = (TextView)findViewById(R.id.text_address);
        editText = (EditText)findViewById(R.id.editText_address);
        button3 = (Button)findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hobby = editText.getText().toString();
                Intent i = new Intent(Hobby.this, Weapon.class);
                startActivity(i);
            }
        });

    }
}
