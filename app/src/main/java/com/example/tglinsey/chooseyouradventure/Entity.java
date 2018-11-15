package com.example.tglinsey.chooseyouradventure;

public class Entity {
    private int mMaxHP;
    private int maxAtk;
    private int minAtk;
    private int currentHP;
    public boolean isDead = false;


    Entity(){
        maxAtk = 10;
        minAtk = 2;
        mMaxHP = 10;
        currentHP = mMaxHP;
        isDead = false;


    }

    public void takeDamage(int damageTaken){
        mMaxHP -= damageTaken;
        if(currentHP <= 0 ){
            isDead = true;
        }

    }
    public int attack(){
        return (int) (Math.random() * ((maxAtk - minAtk)+1)+minAtk);
    }
}
