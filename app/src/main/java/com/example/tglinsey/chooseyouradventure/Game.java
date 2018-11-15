package com.example.tglinsey.chooseyouradventure;

import com.example.tglinsey.chooseyouradventure.Entities.Enemies.Alligator;
import com.example.tglinsey.chooseyouradventure.Entities.Entity;
import com.example.tglinsey.chooseyouradventure.Entities.Enemies.Goblin;
import com.example.tglinsey.chooseyouradventure.Entities.Player;

import java.util.Scanner;

public class Game {
    private static String[] choices;
    private static int userChoice;
    private static Player player;
    private static Entity enemy;


    public static void main(String[] args) {
        boolean end = false;
        start();

    }

    public static int returnChoice(String[] choices) {

        int i = 0;
        int userChoice = 0;
        for (String choice : choices) {
            i++;
            System.out.println(i + ": " + choice);

        }
        System.out.println("Enter an option");
        Scanner scan = new Scanner(System.in);
        userChoice = scan.nextInt();
        return userChoice;


    }

    public static void start() {
        player = new Player("Fighter") ;
        enemy = new Alligator();
        choices = new String[]{"Go Left", "Go Right", "Go Up"};
        System.out.println("You are at a crossroads");
        userChoice = returnChoice(choices);
        combat(player, enemy);
        switch (userChoice) {
            case 1:
                left();
                break;
            case 2:
                right();
                break;
            case 3:
                up();
                break;
        }


    }

    public static void left() {
        enemy = new Alligator();
        choices = new String[]{"Go Up", "Go Down"};
        System.out.println("You went left");
        userChoice = returnChoice(choices);
        combat(player, enemy);

        switch (userChoice) {
            case 1:
                up();
                break;
            case 2:
                down();
                break;
        }
    }

    public static void right() {
        System.out.println("You went right");
        choices = new String[]{"Go Right", "Go Left", "Go Up" };
        userChoice = returnChoice(choices);



        switch (userChoice) {
            case 1:
                left();
                break;
            case 2:
                right();
                break;
            case 3:
                up();
                break;
        }

    }

    public static void up() {
        System.out.println("You went up");
        choices = new String[]{"Go right", "Go Up", "Go Down"};
        userChoice = returnChoice(choices);

        switch (userChoice) {
            case 1:
                right();
                break;
            case 2:
                up();
                break;
            case 3:
                down();
                break;
        }

    }

    public static void down() {
        System.out.println("You went down");
        choices = new String[]{"Keep going", "Turn Back"};
        userChoice = returnChoice(choices);
        switch (userChoice) {
            case 1:
                die();
                break;
            case 2:
                up();
                break;
        }
    }
    public static void combat(Player player, Entity enemy){
        //While both enemy and entity are alive, continue combat.
        int playerAttack;
        int enemyAttack;
        System.out.println(enemy.getFlavorText());
        while(!player.isDead && !enemy.isDead){
            playerAttack = player.attack();
            enemyAttack = enemy.attack();
            enemy.takeDamage(playerAttack);
            player.takeDamage(enemyAttack);
            System.out.println("Enemy takes " + playerAttack + " damage. HP is " + enemy.getCurrentHP());
            System.out.println("Player takes " + enemyAttack + " damage. HP is " + player.getCurrentHP());


        }
        if(player.isDead){
            die();
        }

    }
    public static void die() {
        System.out.println("You die");
        start();


    }

//        public static void template(String text, ArrayList<String> choices , ){
//
//        }
}