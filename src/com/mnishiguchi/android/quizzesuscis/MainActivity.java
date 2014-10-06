package com.mnishiguchi.android.quizzesuscis;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends ActionBarActivity
{    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an onClickListener.
        View.OnClickListener handler = new View.OnClickListener() {
            public void onClick(View clickedView)
            {
                switch (clickedView.getId() )
                {
                    case R.id.btn_list_mode:
                    {
                        Intent i = new Intent(MainActivity.this, QuizListActivity.class);
                        startActivity(i);
                    }
                    break;
                    
                    case R.id.btn_random_mode:
                    {
                        Intent i = new Intent(MainActivity.this, RandomPickActivity.class);
                        startActivity(i);
                    }
                    break;
                }
            }
        };       
        // Get IDs of UI buttons and set the OnClickListener.
        findViewById(R.id.btn_list_mode).setOnClickListener(handler);
        findViewById(R.id.btn_random_mode).setOnClickListener(handler);
    }
    
}
