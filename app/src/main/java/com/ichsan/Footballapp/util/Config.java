package com.ichsan.Footballapp.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Config {

    public static final String BASE_URL = "https://api.football-data.org";
    public static final String BASE_KEY = "X-Auth-Token: 3ffb04139ffb4dbb9377ef6644d4e10e";

    private static Config instance = new Config();
    private static Context context;

    public static Config getInstance(Context c) {
        context = c.getApplicationContext();
        return instance;
    }

    public boolean isConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        assert connectivityManager != null;
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return networkInfo != null && networkInfo.isConnected();
    }
}
