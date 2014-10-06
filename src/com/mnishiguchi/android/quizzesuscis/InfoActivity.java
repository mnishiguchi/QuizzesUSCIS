package com.mnishiguchi.android.quizzesuscis;

import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import android.os.Bundle;

public class InfoActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        
        TextView tv = (TextView) findViewById(R.id.tv_info);
        tv.setText(R.string.info_message);
    }

}
