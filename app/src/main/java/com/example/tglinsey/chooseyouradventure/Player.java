package com.example.tglinsey.chooseyouradventure;

import java.util.ArrayList;

public class Player extends Entity {


    private ArrayList<String> Items;


    Player(){
        

    }

    public void addItem(String item){
        Items.add(item);
    }
    public void removeItem(String item){
        Items.remove(item);
    }

}
