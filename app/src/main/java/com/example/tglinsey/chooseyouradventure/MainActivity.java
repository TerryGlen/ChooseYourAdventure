package com.example.tglinsey.chooseyouradventure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

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

  /*  private void updateDisplay(String storyText, HashMap<String, Integer> choicesMap) {
        View.OnClickListener clickListener;
        displayText.setText(storyText);
        for (final Map.Entry<String, Integer> choice : choicesMap.entrySet()) {
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

    private void switchfunction(int value) {
        switch (value) {
            case 1:
                first();
            case 2:
                second();
            case 3:
                third();
        }
    }*/
    /**for (Map.Entry<String, Object> entry : map.entrySet()) {
    String key = entry.getKey();
    Object value = entry.getValue();
    // ...
}**/
    private void start() {
        //HashMap<String, Integer> choicesMap  = new HashMap<String, Integer>();
        //choicesMap.put("Mountains", 12);
      //  choicesMap.put("Clearing", 10);
        //choicesMap.put("River", 4);
        storyText = "Choose a place to go" ;
        displayText.setText(storyText);
        //updateDisplay(storyText, choicesMap);
        choice1.setText("Mountains");
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

    //CHANGE THE SETONCLICKLISTENER LINKS AFTER MAKING FUNCTIONS
    //ON INVISIBLE CHOICES, DO YOU NEED TO EVEN DEFINE SETTEXT AND ONCLICKLISTENER?

    private void welcome_intro(){
        displayText.setText("Welcome Adventurer! To prove your worth to the guild you must go on a quest");
        choice1.setText("");
        choice2.setText("...");
        choice3.setText("");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
        choice1.setVisibility(View.INVISIBLE);
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
        choice3.setVisibility(View.INVISIBLE);
    }

    private void welcome_intro2(){
        displayText.setText("On this quest we need you to recover a..");
        choice1.setText("");
        choice2.setText("...");
        choice3.setText("");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
        choice1.setVisibility(View.INVISIBLE);
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
        choice3.setVisibility(View.INVISIBLE);
    }

    private void welcome_intro3(){
        displayText.setText("Treasure!");
        choice1.setText("");
        choice2.setText("...");
        choice3.setText("");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
        choice1.setVisibility(View.INVISIBLE);
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
        choice3.setVisibility(View.INVISIBLE);
    }

    private void welcome_intro4(){
        displayText.setText("Before you go forth on your quest, you must answer a few questions.");
        choice1.setText("");
        choice2.setText("...");
        choice3.setText("");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
        choice1.setVisibility(View.INVISIBLE);
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
        choice3.setVisibility(View.INVISIBLE);
    }

    private void fighter_choice(){
        displayText.setText("Are you a fighter?");
        choice1.setText("Yes");
        choice2.setText("");
        choice3.setText("No");

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
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
    }

    private void weapon_choice(){
        displayText.setText("So you believe in fighting for a purpose? What is the weapon you wield?");
        choice1.setText("Sword");
        choice2.setText("Bow");
        choice3.setText("Mace");

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

    private void tool_choice(){
        displayText.setText("So you believe violence is not the way? What is the tool you wield?");
        choice1.setText("Staff");
        choice2.setText("Lute");
        choice3.setText("Wand");

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

    private void start_choice() {
        displayText.setText("You leave the guild house and find that it is early evening. Do you choose to find an inn and rest for the evening or set off immediately?");
        choice1.setText("Go to Inn");
        choice2.setText("");
        choice3.setText("Set out");

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
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
    }

    private void inn_choice(){
        displayText.setText("You wake up well rested and set off on your adventure. Which direction do you travel?");
        choice1.setText("North");
        choice2.setText("");
        choice3.setText("South");

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
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
    }

    private void setout_choice(){
        displayText.setText("You set off on your adventure. Which direction do you travel?");
        choice1.setText("East");
        choice2.setText("");
        choice3.setText("West");

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
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
    }

    private void north_choice(){
        displayText.setText("You head north and after hours of travel you come across a cave opening. Do you enter?");
        choice1.setText("Yes");
        choice2.setText("");
        choice3.setText("No");

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
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
    }

    private void south_choice(){
        displayText.setText("You head south and find yourself with a fast moving river blocking your path. Do you head back the way you came or follow the river?");
        choice1.setText("Go back");
        choice2.setText("");
        choice3.setText("Follow river");

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
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
    }

    private void east_choice(){
        displayText.setText("You head east and find yourself with a fast moving river blocking your path. Do you head back the way you came or follow the river?");
        choice1.setText("Go back");
        choice2.setText("");
        choice3.setText("Follow river");

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
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
    }

    private void west_choice(){
        displayText.setText("You head west and find yourself at a crossroad. Do you head to the town of Edgar or the town of Alm?");
        choice1.setText("Edgar");
        choice2.setText("");
        choice3.setText("Alm");

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
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
    }

    private void enter_cave(){
        displayText.setText("You choose to enter the cave and see that this cave leads to a tunnel. You follow the tunnel till you see" +
                "the light of day and when you exit the tunnel you see a sign welcoming you to the town of Alm. Do you enter the town or head" +
                "into the neighboring woods?");
        choice1.setText("Enter Alm");
        choice2.setText("");
        choice3.setText("Enter Woods");

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
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
    }

    private void not_enter_cave(){
        displayText.setText("You choose to not enter the cave and to instead follow the side of the mountain and into the woods." +
                "You soon find yourself at a road with a sign 'this way to Edgar'. Do you choose to head to Edgar or go in the " +
                "opposite direction?");
        choice1.setText("To Edgar");
        choice2.setText("");
        choice3.setText("Opposite way");

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
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
    }

    private void river_go_back(){
        displayText.setText("You choose to go back, turning away from the river and the dangers of its rapidly moving waters. As you" +
                "walk back the way you came you see a traveler needing assistance fixing his cart. Do you choose to assist the traveler?");
        choice1.setText("Assist him");
        choice2.setText("");
        choice3.setText("Ignore him");

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
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
    }

    private void follow_river(){
        displayText.setText("You choose to follow the river in hope the dangers of the water will hold a great prize. As you follow" +
                "the river, you come across a calm spot along the bank. You see bubble on the surface of the water. Do you investigate the" +
                "bubbles, or continue?");
        choice1.setText("Investigate");
        choice2.setText("");
        choice2.setVisibility(View.INVISIBLE);
        choice3.setText("Carry on");

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
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
    }
}
