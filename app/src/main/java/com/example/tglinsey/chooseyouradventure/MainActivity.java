package com.example.tglinsey.chooseyouradventure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CreateGame();
    }
    private void CreateGame() {
        int[] choicestest1 = new int[]{001, 002, 003};
        Story test = new Story("Woods", "You are in the woods. Your hand is stuck", choicestest1);
        test.getmId
        Log.d("LOG OF INFO", test.getmStoryName() + test.getmStoryText() + test.getmChoices().toString() );
    }
}

