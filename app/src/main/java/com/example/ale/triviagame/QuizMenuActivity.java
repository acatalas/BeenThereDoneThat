package com.example.ale.triviagame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class QuizMenuActivity extends QuizActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        ListView menuList = (ListView) findViewById(R.id.ListView_Menu);
        String[] items = {getResources().getString(R.string.menu_item_play),
                            getResources().getString(R.string.menu_item_scores),
                            getResources().getString(R.string.menu_item_settings),
                            getResources().getString(R.string.menu_item_help) };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.menu_item, items);
        menuList.setAdapter(adapter);
        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView)view;
                String strText = textView.getText().toString();
                if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_play))) {
                    // Launch the Game Activity
                    startActivity(new Intent(QuizMenuActivity.this, QuizGameActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_help))) {
                    // Launch the Help Activity
                    startActivity(new Intent(QuizMenuActivity.this, QuizHelpActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_settings))) {
                    // Launch the Settings Activity
                    startActivity(new Intent(QuizMenuActivity.this, QuizSettingsActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_scores))) {
                    // Launch the Scores Activity
                    startActivity(new Intent(QuizMenuActivity.this, QuizScoresActivity.class));
                }
            }
        });
    }
}
