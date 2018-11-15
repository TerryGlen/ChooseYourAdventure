package com.example.tglinsey.chooseyouradventure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity{

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
        welcome_intro();


    }

    /**for (Map.Entry<String, Object> entry : map.entrySet()) {
    String key = entry.getKey();
    Object value = entry.getValue();
    // ...
}**/


    //CHANGE THE SETONCLICKLISTENER LINKS AFTER MAKING FUNCTIONS
    //ON INVISIBLE CHOICES, DO YOU NEED TO EVEN DEFINE SETTEXT AND ONCLICKLISTENER?

    private void make_visible(){
        choice1.setVisibility(View.VISIBLE);
        choice2.setVisibility(View.VISIBLE);
        choice3.setVisibility(View.VISIBLE);
    }
    private void welcome_intro(){
        make_visible();
        displayText.setText("Welcome Adventurer! To prove your worth to the guild you must go on a quest");
        choice1.setText("");
        choice2.setText("...");
        choice3.setText("");

        choice1.setVisibility(View.INVISIBLE);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcome_intro2();
            }
        });
        choice3.setVisibility(View.INVISIBLE);
    }

    private void welcome_intro2(){
        make_visible();
        displayText.setText("On this quest we need you to recover a..");
        choice1.setText("");
        choice2.setText("...");
        choice3.setText("");

        choice1.setVisibility(View.INVISIBLE);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcome_intro3();
            }
        });
        choice3.setVisibility(View.INVISIBLE);
    }

    private void welcome_intro3(){
        make_visible();
        displayText.setText("Treasure!");
        choice1.setText("");
        choice2.setText("...");
        choice3.setText("");

        choice1.setVisibility(View.INVISIBLE);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcome_intro4();
            }
        });
        choice3.setVisibility(View.INVISIBLE);
    }

    private void welcome_intro4(){
        make_visible();
        displayText.setText("Before you go forth on your quest, you must answer a few questions.");
        choice1.setText("");
        choice2.setText("...");
        choice3.setText("");


        choice1.setVisibility(View.INVISIBLE);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fighter_choice();
            }
        });
        choice3.setVisibility(View.INVISIBLE);
    }

    private void fighter_choice(){
        make_visible();
        displayText.setText("Are you a fighter?");
        choice1.setText("Yes");
        choice2.setText("");
        choice3.setText("No");

        choice1.setVisibility(View.VISIBLE);
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weapon_choice();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tool_choice();
            }
        });
        choice3.setVisibility(View.VISIBLE);
    }

    private void weapon_choice(){
        make_visible();
        displayText.setText("So you believe in fighting for a purpose? What is the weapon you wield?");
        choice1.setText("Sword");
        choice2.setText("Bow");
        choice3.setText("Mace");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_choice();
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_choice();
            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_choice();
            }
        });
    }

    private void tool_choice(){
        make_visible();
        displayText.setText("So you believe violence is not the way? What is the tool you wield?");
        choice1.setText("Staff");
        choice2.setText("Lute");
        choice3.setText("Wand");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_choice();
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_choice();
            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_choice();
            }
        });
    }

    private void start_choice() {
        make_visible();
        displayText.setText("You leave the guild house and find that it is early evening. Do you choose to find an inn and rest for the evening or set off immediately?");
        choice1.setText("Go to Inn");
        choice2.setText("");
        choice3.setText("Set out");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inn_choice();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setout_choice();
            }
        });
    }

    private void inn_choice(){
        make_visible();
        displayText.setText("You wake up well rested and set off on your adventure. Which direction do you travel?");
        choice1.setText("North");
        choice2.setText("");
        choice3.setText("South");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                north_choice();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                south_choice();
            }
        });
    }

    private void setout_choice(){
        make_visible();
        displayText.setText("You set off on your adventure. Which direction do you travel?");
        choice1.setText("East");
        choice2.setText("");
        choice3.setText("West");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                east_choice();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                west_choice();
            }
        });
    }

    private void north_choice(){
        make_visible();
        displayText.setText("You head north and after hours of travel you come across a cave opening. Do you enter?");
        choice1.setText("Yes");
        choice2.setText("");
        choice3.setText("No");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter_cave();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                not_enter_cave();
            }
        });
    }

    private void south_choice(){
        make_visible();
        displayText.setText("You head south and find yourself with a fast moving river blocking your path. Do you head back the way you came or follow the river?");
        choice1.setText("Go back");
        choice2.setText("");
        choice3.setText("Follow river");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                river_go_back();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                follow_river();
            }
        });
    }

    private void east_choice(){
        make_visible();
        displayText.setText("You head east and find yourself with a fast moving river blocking your path. Do you head back the way you came or follow the river?");
        choice1.setText("Go back");
        choice2.setText("");
        choice3.setText("Follow river");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                river_go_back();
            }
        });

        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                follow_river();
            }
        });
    }

    private void west_choice(){
        make_visible();
        displayText.setText("You head west and find yourself at a crossroad. Do you head to the town of Edgar or the town of Alm?");
        choice1.setText("Edgar");
        choice2.setText("");
        choice3.setText("Alm");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                travel_Edgar();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                travel_Alm();
            }
        });
    }

    private void enter_cave(){
        make_visible();
        displayText.setText("You choose to enter the cave and see that this cave leads to a tunnel. You follow the tunnel 'til you see" +
                " the light of day and when you exit the tunnel you see a sign welcoming you to the town of Alm. Do you enter the town or head" +
                " into the neighboring woods?");
        choice1.setText("Enter Alm");
        choice2.setText("");
        choice3.setText("Enter Woods");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                travel_Alm();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                woods_choice();
            }
        });
    }

    private void not_enter_cave(){
        make_visible();
        displayText.setText("You choose to not enter the cave and to instead follow the side of the mountain and into the woods." +
                " You soon find yourself at a road with a sign 'this way to Edgar'. Do you choose to head to Edgar or go in the " +
                "opposite direction?");
        choice1.setText("To Edgar");
        choice2.setText("");
        choice3.setText("Opposite way");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                travel_Edgar();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opposite_direction();
            }
        });
    }

    private void opposite_direction(){
        make_visible();
        displayText.setText("You choose to go back, turning away from the town. As you follow the path away from the town you see a " +
                "traveler in need of assistance with his cart. Do you choose to assist the traveler?");
        choice1.setText("Assist him");
        choice2.setText("");
        choice3.setText("Ignore him");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assist_traveler();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ignore_traveler();
            }
        });
    }

    private void ignore_traveler(){
        make_visible();
        displayText.setText("You choose not to assist the traveler in need. While ignoring the traveler he yells out that he knows " +
                "of what you seek and where to find it only if you help him. Do you choose to assist him or head into the woods?");
        choice1.setText("Assist him");
        choice2.setText("");
        choice3.setText("To woods");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assist_traveler();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                woods_choice();
            }
        });
    }

    private void assist_traveler(){
        make_visible();
        displayText.setText("You choose to assist the traveler in need. After assisting the traveler with his cart, the traveler offers " +
                "you some advice: 'You will find what you have sought where things may be bought.' Do you choose to take the mysterious advice " +
                "of the traveler or continue into the woods?");
        choice1.setText("Take advice");
        choice2.setText("");
        choice3.setText("To woods");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                travel_Edgar();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                woods_choice();
            }
        });
    }

    private void river_go_back(){
        make_visible();
        displayText.setText("You choose to go back, turning away from the river and the dangers of its rapidly moving waters. As you " +
                "walk back the way you came you see a traveler needing assistance fixing his cart. Do you choose to assist the traveler?");
        choice1.setText("Assist him");
        choice2.setText("");
        choice3.setText("Ignore him");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assist_traveler();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ignore_traveler();
            }
        });
    }

    private void follow_river(){
        make_visible();
        displayText.setText("You choose to follow the river in hope the dangers of the water will hold a great prize. As you follow " +
                "the river, you come across a calm spot along the bank. You see bubble on the surface of the water. Do you investigate the " +
                "bubbles, or continue?");
        choice1.setText("Investigate");
        choice2.setText("");
        choice3.setText("Carry on");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                investigate_bubbles();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ignore_bubbles();
            }
        });
    }

    private void travel_Edgar(){
        make_visible();
        displayText.setText("You choose to travel to then nearby town of Edgar. As you enter town you see that there isn't much here." +
                " The small town consists of a small shop, a bar, and an inn. What would you like to do?");
        choice1.setText("To shop");
        choice2.setText("To bar");
        choice3.setText("To inn");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shop_choice();
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar_choice();
            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inn_choice2();
            }
        });
    }

    private void travel_Alm(){
        make_visible();
        displayText.setText("You choose to travel to Alm. As you enter town you cannot help but see the large fountain in the middle" +
                " of the town. The town is busy with people out enjoying the day. You are overwhelmed with the amount of people and " +
                "shops in this town. Do you choose to take a closer look at the fountain, go look at a nearby shop, or ask a passerby" +
                " about the town?");
        choice1.setText("Fountain");
        choice2.setText("Shop");
        choice3.setText("Passerby");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fountain_choice();
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shop_choice();
            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passerby_choice();
            }
        });
    }

    private void woods_choice(){
        make_visible();
        displayText.setText("You choose to travel into the woods. You find yourself in a clearing with small berry bushes around the edge." +
                        " Do you eat some of the berries or continue through the clearing?");
        choice1.setText("Eat some");
        choice2.setText("");
        choice3.setText("Ignore berries");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                berries_choice();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ignore_berries();
            }
        });
    }

    private void ignore_berries(){
        make_visible();
        displayText.setText("You decide to ignore the berry bushes and continue on your journey. On the far side of the clearing you come to a road with a sign" +
                "'this way to Edgar, this way to Alm'. Do you choose to travel to Edgar or Alm?");
        choice1.setText("To Edgar");
        choice2.setText("");
        choice3.setText("To Alm");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                travel_Edgar();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                travel_Alm();
            }
        });
    }
    private void berries_choice(){
        make_visible();
        displayText.setText("You decided to eat the berries from the bushes in the clearing. You suddenly feel ill...");
        choice1.setText("");
        choice2.setText("...");
        choice3.setText("");

        choice1.setVisibility(View.INVISIBLE);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                berries_death();
            }
        });
        choice3.setVisibility(View.INVISIBLE);
    }

    private void berries_death(){
        make_visible();
        displayText.setText("You feel your strength fading as darkness clouds your vision. The last thought that crosses your mind " +
                "is that the berries may have been poisonous...");
        choice1.setText("");
        choice2.setText("Start Over");
        choice3.setText("");

        choice1.setVisibility(View.INVISIBLE);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcome_intro();
            }
        });
        choice3.setVisibility(View.INVISIBLE);
    }

    private void investigate_bubbles(){
        make_visible();
        displayText.setText("You choose to investigate the bubbles in the calm water. You enter the water curious of where the bubbles are coming from. You reach into" +
                " the water and are promptly attacked by an alligator.");
        choice1.setText("");
        choice2.setText("...");
        choice3.setText("");

        choice1.setVisibility(View.INVISIBLE);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alligator_death();
            }
        });
        choice3.setVisibility(View.INVISIBLE);

    }

    private void alligator_death(){
        make_visible();
        displayText.setText("Although you manage to escape from the alligator, it is not without a cost: You have lost your arm at the shoulder. Although the pain is" +
                " excruciating at first, it soon goes away as darkness envelopes your sight...");
        choice1.setText("");
        choice2.setText("Start Over");
        choice3.setText("");

        choice1.setVisibility(View.INVISIBLE);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcome_intro();
            }
        });
        choice3.setVisibility(View.INVISIBLE);
    }

    private void ignore_bubbles(){
        make_visible();
        displayText.setText("You choose to continue forward and not investigate the bubbles. You soon reach a bridge to cross the river. You find" +
                " yourself at the entrance of the town of Alm. Do you choose to enter or turn back?");
        choice1.setText("To Alm");
        choice2.setText("");
        choice3.setText("Turn Back");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                travel_Alm();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turn_back_Alm();
            }
        });
    }

    private void shop_choice(){
        make_visible();
        displayText.setText("You choose to go into the shop. You are welcomed warmly by the shop owner and are asked if you would like to " +
                "try the town specialty.");
        choice1.setText("Yes");
        choice2.setText("");
        choice3.setText("Yes");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yes_yes();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yes_yes();
            }
        });
    }

    private void bar_choice(){
        make_visible();
        displayText.setText("You choose to go into the bar. You go to enter the bar and here a commotion inside. Do you dare to enter?");
        choice1.setText("Yes");
        choice2.setText("");
        choice3.setText("No");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar_choice2();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leave_bar();
            }
        });
    }

    private void inn_choice2(){
        make_visible();
        displayText.setText("You choose to go into the inn. You decide to get a room for the evening and ask where in the town you" +
                " can get food for the evening. The inn keeper directs you to the local shop.");
        choice1.setText("");
        choice2.setText("Go to shop");
        choice3.setText("");


        choice1.setVisibility(View.INVISIBLE);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shop_choice();
            }
        });
        choice3.setVisibility(View.INVISIBLE);
    }

    private void fountain_choice(){
        make_visible();
        displayText.setText("You choose to go to the fountain. You look around and breathe in the beauty of this magnificent fountain." +
                " As you decide to sit and enjoy the sight, a passerby approaches you and welcomes you to the town. They also ask if you " +
                "have tried any of the town's local goods from the shop. You stand and walk away from the fountain. Do you go to the shop" +
                " or ask the passerby about the town?");
        choice1.setText("To Shop");
        choice2.setText("");
        choice3.setText("Ask Passerby");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shop_choice();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passerby_choice();
            }
        });
    }

    private void passerby_choice(){
        make_visible();
        displayText.setText("You choose to ask a passerby about the town. You approach a small group of people who have stopped nearby" +
                " and ask them about the town.");
        choice1.setText("");
        choice2.setText("...");
        choice3.setText("");

        choice1.setVisibility(View.INVISIBLE);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passerby_choice2();
            }
        });
        choice3.setVisibility(View.INVISIBLE);
    }

    private void passerby_choice2(){
        make_visible();
        displayText.setText("Man #1: This town is a great town! We have the best goods in the region, check them out in the local shop! " +
                "Do you choose to go to the shop or go to the fountain?");
        choice1.setText("To shop");
        choice2.setText("");
        choice3.setText("To fountain");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shop_choice();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fountain_choice();
            }
        });
    }

    private void turn_back_Alm(){
        make_visible();
        displayText.setText("You choose to go back, turning away from the town. As you follow the path away from the town you see a " +
                "traveler needing assistance fixing his cart. Do you choose to assist the traveler or ignore him?");
        choice1.setText("Assist him");
        choice2.setText("");
        choice3.setText("Carry on");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assist_traveler();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ignore_traveler();
            }
        });

    }

    private void bar_choice2(){
        make_visible();
        displayText.setText("You choose to enter the bar. A rather large and drunken man takes a swing at you, which you narrowly dodge." +
                " Do you choose to fight him or turn away and leave?");
        choice1.setText("Fight him");
        choice2.setText("");
        choice3.setText("Turn away");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fight_bar();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leave_bar();
            }
        });
    }

    private void leave_bar(){
        make_visible();
        displayText.setText("You choose to avoid the danger. Do you choose to go to the inn or the shop?");
        choice1.setText("To inn");
        choice2.setText("");
        choice3.setText("To shop");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { inn_choice();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shop_choice();
            }
        });
    }

    private void fight_bar(){
        make_visible();
        displayText.setText("You choose to fight. You get badly injured and decide the bar is not the place to be. Do you choose " +
                "to go to the inn or the shop to seek comfort?");
        choice1.setText("To inn");
        choice2.setText("");
        choice3.setText("To shop");

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inn_choice2();
            }
        });
        choice2.setVisibility(View.INVISIBLE);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shop_choice();
            }
        });
    }

    private void yes_yes(){
        make_visible();
        displayText.setText("You have obtained the LEGENDARY SANDWICH OF OLD! " +
                "You ascend to greatness. And return to the guild a hero.");
        choice1.setText("");
        choice2.setText("Start over");
        choice3.setText("");

        choice1.setVisibility(View.INVISIBLE);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcome_intro();
            }
        });
        choice3.setVisibility(View.INVISIBLE);
    }
}
