package com.example.tglinsey.chooseyouradventure;

import java.util.UUID;

public class Story {

    private String mStoryText;
    private UUID mId;
    private String mStoryName;
    private int[] mChoices;


    public Story( String storyName, String storyText, int[] choices){
        this.mId = UUID.randomUUID();
        this.mStoryName = storyName;
        this.mStoryText = storyText;
        this.mChoices = choices;
    }

    public String getmStoryText() {
        return mStoryText;
    }

    public UUID getmId() {
        return mId;
    }

    public String getmStoryName() {
        return mStoryName;
    }

    public int[] getmChoices(){
        return mChoices;
    }



}
