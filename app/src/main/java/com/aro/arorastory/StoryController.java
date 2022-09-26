package com.aro.arorastory;

import java.util.ArrayList;
import java.util.Arrays;

public class StoryController {


    Integer currentStoryNum = 0;

    ArrayList<StoryModel> stories = new ArrayList<StoryModel>(Arrays.asList(
            new StoryModel("Your car has blown a tire on a winding road in the middle of nowhere with no cell phone reception. You decide to hitchhike. A rusty pickup truck rumbles to a stop next to you. A man with a wide brimmed hat with soulless eyes opens the passenger door for you and asks: 'Need a ride, boy?'"
                    ,"I'll hop in. Thanks for the help!",
                    "Better ask him if he's a murderer first.",
                    2, 1),
            new StoryModel("He nods slowly, unfazed by the question"
                    ,"At least he's honest. I'll climb in.",
                    "Wait, I know how to change a tire.",
                    2, 3),
            new StoryModel("As you begin to drive, the stranger starts talking about his relationship with his mother. He gets angrier and angrier by the minute. He asks you to open the glovebox. Inside you find a bloody knife, two severed fingers, and a cassette tape of Elton John. He reaches for the glove box."
                    ,"I love Elton John! Hand him the cassette tape.",
                    "It's him or me! You take the knife and stab him.",
                    5, 4),
            new StoryModel("What? Such a cop out! Did you know traffic accidents are the second leading cause of accidental death for most adult age groups?"
                    ,"The",
                    "End",
                    0, 0),
            new StoryModel("As you smash through the guardrail and careen towards the jagged rocks below you reflect on the dubious wisdom of stabbing someone while they are driving a car you are in."
                    ,"The",
                    "End",
                    0, 0),
            new StoryModel("You bond with the murderer while crooning verses of 'Can you feel the love tonight'. He drops you off at the next town. Before you go he asks you if you know any good places to dump bodies. You reply: 'Try the pier."
                    ,"The",
                    "End",
                    0, 0)
    ));



    public Integer progressStoryNumChoiceOne(){

        currentStoryNum = stories.get(currentStoryNum).choice1Destination;

        return currentStoryNum;
    }

    public Integer progressStoryNumChoiceTwo(){

        currentStoryNum = stories.get(currentStoryNum).choice2Destination;

        return currentStoryNum;
    }


}

