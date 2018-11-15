package com.example.tglinsey.chooseyouradventure.Entities.Enemies;

import com.example.tglinsey.chooseyouradventure.Entities.Entity;

public class Orc extends Entity {
    public Orc() {
        super();
        this.setMaxHP(55);
        this.setMaxAtk(8);
        this.setMinAtk(6);
        this.setCurrentHP(this.getMaxHP());
        this.setFlavorText("An Orc? Let's hope he's smarter than you look.");
    }
}
