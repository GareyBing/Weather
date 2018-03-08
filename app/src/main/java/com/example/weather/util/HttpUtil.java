package com.example.weather.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;


/**
 * Created by hugb on 3/5/18.
 */

public class HttpUtil {
    public static void sendHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        Log.e("hgb" ,"request = "+request);
        client.newCall(request).enqueue(callback);

    }
}
