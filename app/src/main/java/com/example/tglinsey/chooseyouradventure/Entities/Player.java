package com.example.tglinsey.chooseyouradventure.Entities;

import com.example.tglinsey.chooseyouradventure.Entities.Entity;

import java.util.ArrayList;

public class Player extends Entity {


    private ArrayList<String> Items;


    public Player(String className){

        super();
        if(className == "Fighter"){
            this.setMaxHP(125);
            this.setMaxAtk(25);
            this.setMinAtk(15);
            this.setMagicAtk(5);
        }else{
            this.setMaxHP(110);
            this.setMaxAtk(15);
            this.setMinAtk(5);
        }

        this.setCurrentHP(this.getMaxHP());

    }

    public void addItem(String item) {
        Items.add(item);
        switch (item) {
            case "Sword":
                this.setMaxAtk((this.getMaxAtk() + 10));
            case "Bow":
                this.setMaxAtk((this.getMaxAtk() + 2));
            case "Mace":
                this.setMaxAtk(this.getMaxAtk() + 5);
            case "Staff":
                this.setMagicAtk(this.getMagicAtk() + 10);
            case "Want":
                this.setMagicAtk(this.getMagicAtk() + 6);
        }
    }
    public void removeItem(String item){
        Items.remove(item);
    }

}
