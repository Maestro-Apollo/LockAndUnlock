package com.example.lockandunlock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.flaviofaria.kenburnsview.RandomTransitionGenerator;

public class MainActivity extends AppCompatActivity {

    private KenBurnsView kenBurnsView;
    private boolean move = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        kenBurnsView = findViewById(R.id.kcv);

        AccelerateDecelerateInterpolator interpolator = new AccelerateDecelerateInterpolator();
        RandomTransitionGenerator generator = new RandomTransitionGenerator(2000,interpolator);
        kenBurnsView.setTransitionGenerator(generator);

        kenBurnsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(move){
                    kenBurnsView.pause();
                    move = false;
                }
                else{
                    kenBurnsView.resume();
                    move = true;
                }
            }
        });

    }


}
