package com.example.lockandunlock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.polyak.iconswitch.IconSwitch;
import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class Main2Activity extends AppCompatActivity {
    private SlidrInterface slidr;
    private IconSwitch iconSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        iconSwitch = findViewById(R.id.iconSwitch);
        slidr = Slidr.attach(this);


        iconSwitch.setCheckedChangeListener(new IconSwitch.CheckedChangeListener() {
            @Override
            public void onCheckChanged(IconSwitch.Checked current) {
                switch (current){
                    case RIGHT:
                        slidr.lock();
                        break;
                    case LEFT:
                        slidr.unlock();
                        break;
                }
            }
        });

    }


}
