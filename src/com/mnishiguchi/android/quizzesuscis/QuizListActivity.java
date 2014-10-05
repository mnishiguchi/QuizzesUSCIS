package com.mnishiguchi.android.quizzesuscis;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

// If the only control in an activity, use the ListActivity class (rather than Activity).
public class QuizListActivity extends ListActivity
{
    ArrayList<String> mQuestions;
    ArrayList<String> mAnswers = Quiz.getAnswers();
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        // Delete the setContentView statement from the onCreate method
        // because ListActivity doesn't need a layout xml file of the entire activity.
        
        // Prepare the data to show on the list.
        mQuestions = Quiz.getQuestions();
                
        // Create a new ArrayAdapter to hold the elements that will be displayed in the ListView.
        this.setListAdapter(new ArrayAdapter<String> (this,
                R.layout.list_item, R.id.list_item, mQuestions ) );
        
            /* ArrayAdapter<String> Context context, int resource, int textViewResourceId, String[] objects)
             * context - The instance of ListActivity class that is currently running.
             * resource - The resource ID for the list item layout file.
             * textViewResourceId - The id of the TextView within the layout resource to be populated
             * objects - The objects to use as a data source.
             * */

        // Get a ListView instance and set an onItemClickListener
        ListView lv = getListView();
        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick( AdapterView<?> adapter, View v, int position, long id ) {
            String answer = mAnswers.get(position);
            Toast.makeText(QuizListActivity.this, String.format("Answer: %s", answer),
                    Toast.LENGTH_SHORT).show();
            }
        });
    }
    
}
