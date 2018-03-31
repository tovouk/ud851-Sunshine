package com.example.android.sunshine.sync;


import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class SunshineSyncIntentService extends IntentService{
    public SunshineSyncIntentService(){
        super(SunshineSyncIntentService.class.getName());
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        SunshineSyncTask.synWeather(this);
    }
}