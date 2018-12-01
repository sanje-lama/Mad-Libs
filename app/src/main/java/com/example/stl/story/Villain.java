package com.example.stl.story;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Villain extends AppCompatActivity {



    TextView textView1, textView2;
    EditText editText;
    Button button1;

    public static String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView)findViewById(R.id.text_welcome);
        textView2 = (TextView)findViewById(R.id.text_name);
        editText = (EditText)findViewById(R.id.editText_name);
        button1 = (Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = editText.getText().toString();
                Intent i = new Intent(Villain.this, Story.class);
                startActivity(i);
            }
        });
    }
}

