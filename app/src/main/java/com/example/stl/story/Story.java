package com.example.stl.story;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Story extends AppCompatActivity {

    TextView textView;

    public static String Final_Info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story);



        Final_Info = " One day, the Warrior named " + MainActivity.Name + " who was a " + Profession.profession + " was traveling through the countryside. " +
                "Suddenly, a " + Villain.name + " came out to attack the local farmers! " + MainActivity.Name + " jumped to the" +
                " rescue to Fight with a, " + Weapon.weapon + "Once the Dragon was defeated, " +
                "The local farmers gave " + MainActivity.Name + "a " + Reward.reward + "! The End!";

        textView = (TextView)findViewById(R.id.final_text);
        textView.setText(Final_Info);
    }
}


