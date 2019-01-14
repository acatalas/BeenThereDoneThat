package com.example.ale.triviagame;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

public class QuizActivity extends Activity {
    public static final String GAME_PREFERENCES = "GamePrefs";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences settings = getSharedPreferences(GAME_PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor prefEditor = settings.edit();
        prefEditor.putString("UserName", "JaneDoe");
        prefEditor.putInt("UserAge", 22);
        prefEditor.commit();

        if (settings.contains("UserName")){
            String user = settings.getString("UserName", "Default");
        }
    }



}
