package com.hong.dubbo.interfaces.callback;

/**
 * Created by Hongwei on 2015/11/7.
 */
public interface CallbackService {
    void addListener(String key, CallbackListener listener);
}
