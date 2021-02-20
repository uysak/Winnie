package com.example.winnie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener,EditText.OnEditorActionListener {

    Character c;
    CharacterActivity cA;

    Button bEatFood;
    Button bFight;
    Button bSleep;
    TextView tvCharacterSpecs;
    TextView tvCharacterDoing;

    EditText eText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCharacterSpecs = findViewById(R.id.characterSpecsText);
        tvCharacterDoing = findViewById(R.id.characterDoingText);


        eText = findViewById(R.id.EditTextCrName);


        bEatFood = findViewById(R.id.eatButton);
        bSleep   = findViewById(R.id.sleepButton);
        bFight   = findViewById(R.id.fightButton);

        bEatFood.setOnClickListener(this);
        bFight.setOnClickListener(this);
        bSleep.setOnClickListener(this);


        c = new Character();

        c.activityPoint = 10;
        c.attackForce = 15;
        c.weight = 23;

     // 4788  tvCharacterSpecs.setText(cA.toString(c));

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == bEatFood.getId() ){
            tvCharacterDoing.setText(cA.eatFood(c));
        }
        if(v.getId() == bFight.getId()){
            tvCharacterDoing.setText(cA.goFight(c));
        }
        if(v.getId() == bSleep.getId()){
            tvCharacterDoing.setText(cA.goSleep(c));
        }
      //  tvCharacterSpecs.setText(cA.toString(c));
    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

        c.name = eText.getText().toString();
        tvCharacterSpecs.setText(cA.toString(c));
        return false;
    }
}