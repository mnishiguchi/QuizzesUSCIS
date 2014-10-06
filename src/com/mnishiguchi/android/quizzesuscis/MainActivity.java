package com.mnishiguchi.android.quizzesuscis;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        boolean returnValue = true;
        
        switch(item.getItemId() )
        {
            case R.id.menu_item_info:  // Defined in res/menu/main.xml
            {
                Intent i = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(i);
            }
            break;
                    
            default:  // Else, do nothing.
                returnValue = super.onOptionsItemSelected(item);
            break;
        }
            return returnValue;
    }
    
}
