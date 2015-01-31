package com.coolweather.coolweather.app.util;

/**
 * Created by Administrator on 2015/1/31.
 */
public interface HttlCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
