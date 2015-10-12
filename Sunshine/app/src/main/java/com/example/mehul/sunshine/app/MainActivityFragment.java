package com.example.mehul.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String [] foreCastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/40",
                "Weds - Cloudy - 72/63",
                "Thrus - Asteroids - 75/65",
                "Fri - Heavy Rain - 65/56",
                "Sat - HELP TRAPPED IN WEATHER STATION - 60/51",
                "Sun - Sunny - 80/68"
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(foreCastArray));
       ArrayAdapter<String > mForecastAdapter = new ArrayAdapter<String>(
               getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview,weekForecast
       );
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView weekForecastListView = (ListView)rootView.findViewById(R.id.listview_forecast);
        weekForecastListView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
