package com.aro.arorastory;

public class StoryModel {

    String title;
    String choice1;
    String choice2;
    Integer choice1Destination;
    Integer choice2Destination;

    StoryModel(String title, String choice1, String choice2, int choice1Destination, int choice2Destination)
    {
        this.title = title;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice1Destination = choice1Destination;
        this.choice2Destination = choice2Destination;
    }



}
