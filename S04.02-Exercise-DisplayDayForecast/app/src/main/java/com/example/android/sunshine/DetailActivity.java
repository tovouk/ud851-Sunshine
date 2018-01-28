package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private String mWeatherData;
    private TextView mDisplayWeatherData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mDisplayWeatherData = (TextView)findViewById(R.id.tv_display_weather);

        Intent prevIntent = getIntent();
        if(prevIntent != null && prevIntent.hasExtra(Intent.EXTRA_TEXT)){
            mWeatherData = prevIntent.getStringExtra(Intent.EXTRA_TEXT);
            mDisplayWeatherData.setText(mWeatherData);
        }
    }
}