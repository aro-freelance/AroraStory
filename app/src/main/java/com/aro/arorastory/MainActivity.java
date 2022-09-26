package com.aro.arorastory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    StoryController storyController = new StoryController();

    TextView titleTextView;
    Button resetButton;
    Button choice1Button;
    Button choice2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleTextView = findViewById(R.id.title_textview);
        resetButton = findViewById(R.id.reset_button);
        choice1Button = findViewById(R.id.choice1_button);
        choice2Button = findViewById(R.id.choice2_button);

        updateStoryUI();

        resetButton.setOnClickListener((View v) -> resetButton());


        choice1Button.setOnClickListener((View v) -> choiceOneButton());

        choice2Button.setOnClickListener((View v) -> choiceTwoButton());



    }

    public void resetButton (){

        //todo print reset

        storyController.currentStoryNum = 0;
        updateStoryUI();

    }

    public void choiceOneButton(){

        storyController.currentStoryNum = storyController.progressStoryNumChoiceOne();
        updateStoryUI();
    }

    public void choiceTwoButton(){

        storyController.currentStoryNum = storyController.progressStoryNumChoiceTwo();
        updateStoryUI();
    }

    private void updateStoryUI(){

        if(storyController != null){
            StoryModel story = storyController.stories.get(storyController.currentStoryNum);


            //set title in ui
            titleTextView.setText(story.title);

            //set choice 1 button text
            choice1Button.setText(story.choice1);

            //set choice 2 button text
            choice2Button.setText(story.choice2);
        }
        else{
            Log.d("error", "updateStoryUI: storycontroller null");
        }

    }


}