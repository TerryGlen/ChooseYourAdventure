package com.example.tglinsey.chooseyouradventure.Entities.Enemies;

import com.example.tglinsey.chooseyouradventure.Entities.Entity;

public class Alligator extends Entity {

    public Alligator() {
        super();
        this.setMaxHP(100);
        this.setMaxAtk(14);
        this.setMinAtk(8);
        this.setCurrentHP(this.getMaxHP());
        this.setFlavorText("An Angry Alligator appears. Try not to crap your pants.");
    }
}
