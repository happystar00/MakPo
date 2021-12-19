package com.cookandroid.lastexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 sliderViewPager;

    private String[] images = new String[] {
            "res/drawble/apple.png",
            "res/drawble/samsung.png"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<DataPage> list = new ArrayList<>();
        list.add(new DataPage(android.R.drawable.))

        sliderViewPager = findViewById(R.id.adSlider);

        sliderViewPager.setOffscreenPageLimit(1);
        sliderViewPager.setAdapter(new AdSliderAdapter(this, images));

        sliderViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }
        });

        setupIndicator(images, length);
    }

    private void setupIndicator(int count) {
        ImageView[] indicators = new ImageView[count];
        for (int i = 0; i < indicators.length; i++) {
            indicators[i] = new ImageView(this);
            indicators[i].setImageDrawable(ContextCompat.getDrawable(this));
            indicators[i].setLayoutParams(params);
        }
    }

}