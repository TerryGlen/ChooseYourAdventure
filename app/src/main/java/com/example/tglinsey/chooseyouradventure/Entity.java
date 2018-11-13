package com.example.tglinsey.chooseyouradventure;

import java.util.ArrayList;

public class Entity {
    private int mMaxHP;
    private int maxAtk;
    private int minAtk;
    private int currentHP;
    public boolean playerDead;


    Entity(){
        maxAtk = 10;
        minAtk = 2;
        mMaxHP = 10;
        currentHP = mMaxHP;
        playerDead = false;


    }

    public void takeDamage(int damageTaken){
        mMaxHP -= damageTaken;
        if(currentHP <= 0 ){
            playerDead = true;
        }

    }
    public int attack(){
        return (int) (Math.random() * ((maxAtk - minAtk)+1)+minAtk);
    }
}
