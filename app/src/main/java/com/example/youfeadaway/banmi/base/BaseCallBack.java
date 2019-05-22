package com.example.youfeadaway.banmi.base;

public interface BaseCallBack<T> {
    void onSucceed(T bean);

    void onError(String error);
}
