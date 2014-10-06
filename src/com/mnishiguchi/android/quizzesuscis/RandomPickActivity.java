package com.mnishiguchi.android.quizzesuscis;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.CompoundButton;

public class RandomPickActivity extends ActionBarActivity
{
    // CONSTANTS
    private static final String TAG = "RandomPickActivity";
    private static final String KEY_QUIZ_INDEX = "quiz_index";
    
    //  INSTANCE VARIABLES
    Quiz mQuiz;
    TextView mTextView;
    ToggleButton mAnswerToggle;
    Button mRandomButton;
    Random mRandom = new Random();
    int mIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_pick);
        
        // Get access to the UI components.
        mTextView = (TextView) findViewById(R.id.tv_quiz);     
        mAnswerToggle = (ToggleButton)findViewById(R.id.btn_question_answer);
        mRandomButton = (Button)findViewById(R.id.btn_random_pick);
        
        if (savedInstanceState == null)
        {
            // Random-pick a first quiz.
            mIndex = mRandom.nextInt(100);
        }
        else
        {
            // Retrieved the saved index if any.
            mIndex = savedInstanceState.getInt(KEY_QUIZ_INDEX, 0);
        }
        // Show the quiz.
        mQuiz = Quiz.getQuiz(mIndex);
        mTextView.setText(mQuiz.getQuestion() );
        
        // Set an onClickListener on the Random Button
        mRandomButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View clickedView)
            {
                // Random-pick a next quiz and show it.
                mIndex = mRandom.nextInt(100);
                mQuiz = Quiz.getQuiz(mIndex);
                mTextView.setText(mQuiz.getQuestion() );
                        
                // If the toggle on, turn it off.
                 if (mAnswerToggle.isChecked() ) mAnswerToggle.setChecked(false);
            }
        });
        
         // Set an OnCheckedChangeListener on the Answer Toggle.
        mAnswerToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked) mTextView.setText(mQuiz.getAnswer() );  // show answer
                else mTextView.setText(mQuiz.getQuestion() );  // show question
            }
        });
    }
    
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
        // Log.i(TAG, "onSaveInstanceState");
        savedInstanceState.putInt(KEY_QUIZ_INDEX, mIndex);
    }

}
