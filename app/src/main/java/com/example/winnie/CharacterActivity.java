package com.example.winnie;

public class CharacterActivity extends Character {

    public String eatFood(Character c1){
        if(c1.activityPoint>10){
            c1.weight++;
            c1.activityPoint--;
            return "Its so delicious!";
        }
        else
            return "Not enough activity point.";
    }

    public String goFight(Character c1){
        if(c1.activityPoint>10){
            c1.attackForce++;
            c1.activityPoint--;
            return "Fucked him succesfuly :)";
        }
        else
            return "Not enough activity point";

    }

    public String goSleep(Character c1){

        c1.activityPoint+=5;
        if(c1.activityPoint>20)
            c1.activityPoint=20;
        return "It was a nice sleep";

    }
    public String toString(Character c1){
        return "Name: " + c1.name
                +"Attack Force: " +c1.attackForce
                +"Activity Point: "+ c1.activityPoint
                + "Weight: " + c1.weight;
    }

}
