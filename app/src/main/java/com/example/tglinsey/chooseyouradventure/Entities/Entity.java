package com.example.tglinsey.chooseyouradventure.Entities;

public class Entity {


    private int mMaxHP;
    private int maxAtk;
    private int minAtk;
    private int currentHP;
    public boolean isDead;
    private String flavorText;

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }




    public Entity(){
        isDead = false;


    }

    public void takeDamage(int damageTaken){
        currentHP -= damageTaken;
        if(currentHP <= 0 ){
            isDead = true;
        }

    }
    public int attack(){
        return (int) (Math.random() * ((maxAtk - minAtk)+1)+minAtk);
    }

    public int getCurrentHP() {
        return currentHP;
    }
    public int getMaxHP() {
        return mMaxHP;
    }

    public void setMaxHP(int maxHP) {
        mMaxHP = maxHP;
    }

    public int getMaxAtk() {
        return maxAtk;
    }

    public void setMaxAtk(int maxAtk) {
        this.maxAtk = maxAtk;
    }
    public int getMinAtk() {
        return minAtk;
    }

    public void setMinAtk(int minAtk) {
        this.minAtk = minAtk;
    }
    public int getMagicAtk() {
        return magicAtk;
    }

    public void setMagicAtk(int magicAtk) {
        this.magicAtk = magicAtk;
    }

    private int magicAtk;

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

}
