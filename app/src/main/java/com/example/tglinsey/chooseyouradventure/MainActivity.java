package com.example.tglinsey.chooseyouradventure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private static String[] choices;
    private static int userChoice;
    TextView displayText;
    Button choice1;
    Button choice2;
    Button choice3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayText = (TextView) findViewById(R.id.storyText);
        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);
        start();


    }


    private void start() {
        choice1.setText("Mountains");
        choice2.setText("Clearing");
        choice3.setText("River");
        displayText.setText("Choose a place to go");
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first();
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                third();
            }
        });
    }

    private void first() {
        choice1.setText("go back to start");
        choice2.setText("To the clearing");
        choice3.setText("To river");
        displayText.setText("Mountains: Mountains Gandalf!");
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                third();
            }
        });
    }

    private void second() {
        choice1.setText("go back to start");
        choice2.setText("To mountains");
        choice3.setText("To river");
        displayText.setText("Clearing: You picked up a Visine");
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first();
            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                third();
            }
        });
    }

    private void third(){
        choice1.setText("back to start");
        choice2.setText("To mountains");
        choice3.setText("To clearing");
        displayText.setText("River: Glub glub");
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first();
            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
    }




}
