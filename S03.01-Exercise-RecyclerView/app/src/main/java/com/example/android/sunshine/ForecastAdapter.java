package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by envek on 1/24/2018.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{

    private String[] mWeatherData;

    public ForecastAdapter(){

    }

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{
        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View view){
            super(view);
            mWeatherTextView = (TextView)view.findViewById(R.id.tv_weather_data);
        }

    }
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        Context context = viewGroup.getContext();
        int layoutId = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean attachRightAway = false;

        View view = inflater.inflate(layoutId,viewGroup,attachRightAway);
        return new ForecastAdapterViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder forecastAdapterViewHolder, int position){
        String weatherString = mWeatherData[position];
        forecastAdapterViewHolder.mWeatherTextView.setText(weatherString);
    }
    @Override
    public int getItemCount(){
        if(mWeatherData == null){
            return 0;
        }
        return mWeatherData.length;
    }

    public void setWeatherData(String[] WeatherData){
        this.mWeatherData = WeatherData;
        notifyDataSetChanged();
    }

}
