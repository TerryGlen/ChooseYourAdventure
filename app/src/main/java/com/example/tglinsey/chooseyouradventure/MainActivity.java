package com.example.tglinsey.chooseyouradventure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private static String[] choices;
    private static int userChoice;
    TextView displayText;
    Button choice1;
    Button choice2;
    Button choice3;
    String storyText;

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

    private void updateDisplay(String storyText,  HashMap<String, Integer> choicesMap)
    {
        View.OnClickListener clickListener;
        displayText.setText(storyText);
        for (final Map.Entry<String, Integer> choice :choicesMap.entrySet()){
            clickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switchfunction(choice.getValue());
                }
            };
            choice.getKey();
            choice.getValue();
        }
    }
    private void switchfunction(int value){
        switch(value){
            case 1:
                first();
            case 2:
                second();
            case 3:
                third();
        }
    }
    /**for (Map.Entry<String, Object> entry : map.entrySet()) {
    String key = entry.getKey();
    Object value = entry.getValue();
    // ...
}**/
    private void start() {
        HashMap<String, Integer> choicesMap  = new HashMap<String, Integer>();
        choicesMap.put("Mountains", 12);
        choicesMap.put("Clearing", 10);
        choicesMap.put("River", 4);
        storyText = "Choose a place to go" ;
        
        updateDisplay(storyText, choicesMap);
        /*choice1.setText("Mountains");
        choice2.setText("Clearing");
        choice3.setText("River");
       
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
        });*/
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
