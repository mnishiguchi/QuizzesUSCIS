package com.mnishiguchi.android.quizzesuscis;

import java.util.ArrayList;
import java.util.Random;

import com.mnishiguchi.android.quizzesuscis.R.layout;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.CompoundButton;

public class RandomPickActivity extends ActionBarActivity
{
    //  INSTANCE VARIABLES
    Quiz mQuiz;
    TextView mQuestionAnswerText;
    ToggleButton mAnswerToggle;
    Button mRandomButton;
    Random mRandom = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_pick);
        
        // Get access to the UI components.
        mQuestionAnswerText = (TextView) findViewById(R.id.tv_quiz);     
        mAnswerToggle = (ToggleButton)findViewById(R.id.btn_question_answer);
        mRandomButton = (Button)findViewById(R.id.btn_random_pick);
        
        // Random-pick a first quiz and show it.
        mQuiz = Quiz.getQuizzes().get(mRandom.nextInt(100) );
        mQuestionAnswerText.setText(mQuiz.getQuestion() );
        
        // Set an onClickListener on the Random Button
        mRandomButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View clickedView)
            {
                // Random-pick a next quiz and show it.
                mQuiz = Quiz.getQuizzes().get(mRandom.nextInt(100) );
                mQuestionAnswerText.setText(mQuiz.getQuestion() );
                        
                // If the toggle on, turn it off.
                 if (mAnswerToggle.isChecked() ) mAnswerToggle.setChecked(false);
            }
        });
        
         // Set an OnCheckedChangeListener on the Answer Toggle.
        mAnswerToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked) mQuestionAnswerText.setText(mQuiz.getAnswer() );  // show answer
                else mQuestionAnswerText.setText(mQuiz.getQuestion() );  // show question
            }
        });
    }

}
