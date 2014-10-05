package com.example.quizzesuscis;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Create an onClickListener.
        View.OnClickListener handler = new View.OnClickListener() {
            public void onClick(View v)
            {
                switch (v.getId() )
                {
                    case R.id.btn_show_list:
                    {
                        Toast.makeText( MainActivity. this, String.format( "Show List was chosen") ,
                                Toast. LENGTH_SHORT ) .show() ;
                        Intent i = new Intent(MainActivity.this, ListActivity.class);
                        startActivity(i);
                    }
                    break;
                    case R.id.btn_random_pick:
                    {
                        Toast.makeText( MainActivity. this, String.format( "Random Pick was chosen") ,
                                Toast. LENGTH_SHORT ) .show() ;
                        Intent i = new Intent(MainActivity.this, RandomPickActivity.class);
                        startActivity(i);
                    }
                    break;
                }
            }
        };
        
        // Get IDs of UI buttons and set the OnClickListener.
        findViewById(R.id.btn_show_list).setOnClickListener(handler);
        findViewById(R.id.btn_random_pick).setOnClickListener(handler);
    }

}
