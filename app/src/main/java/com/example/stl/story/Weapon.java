package com.example.stl.story;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Weapon extends AppCompatActivity {


        TextView textView;
        EditText editText;
        Button button4;
        public static String weapon;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.weapon);


            textView = (TextView) findViewById(R.id.text_job);
            editText = (EditText) findViewById(R.id.editText_job);
            button4 = (Button) findViewById(R.id.button4);

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    weapon = editText.getText().toString();
                    Intent intent = new Intent(Weapon.this, Villain.class);
                    startActivity(intent);
                }
            });
        }
    }


