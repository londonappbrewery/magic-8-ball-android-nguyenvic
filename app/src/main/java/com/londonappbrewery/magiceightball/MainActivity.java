package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button askButton = findViewById(R.id.askButton);
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        final int[] ballArray = {R.drawable.ball1,
                           R.drawable.ball2,
                           R.drawable.ball3,
                           R.drawable.ball4,
                           R.drawable.ball5};

        final Random randomNumGenerated =  new Random();

        askButton.setOnClickListener(new View.OnClickListener() { //Action for when button is clicked
            @Override
            public void onClick(View v) {

                int number =  randomNumGenerated.nextInt(5); //num generated from 0~4
                Log.d("8Ball", "The number generated is: " + (number));
                ballDisplay.setImageResource(ballArray[number]);


            }
        });







    }
}
