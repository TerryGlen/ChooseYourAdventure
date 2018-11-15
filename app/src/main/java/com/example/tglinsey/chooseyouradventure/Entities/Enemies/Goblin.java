package com.example.tglinsey.chooseyouradventure.Entities.Enemies;

import com.example.tglinsey.chooseyouradventure.Entities.Entity;

public class Goblin extends Entity {
    public Goblin() {
        super();
        this.setMaxHP(35);
        this.setMaxAtk(7);
        this.setMinAtk(5);
        this.setCurrentHP(this.getMaxHP());
        this.setFlavorText("Aww a little Goblin appears, maybe he wants to be friends?");
    }
}
