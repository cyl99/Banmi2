package com.example.youfeadaway.banmi.base;

import java.lang.ref.WeakReference;

public class BasePresenter<V> {

    private WeakReference<V> weakReference;
    public V view;

    public void bind(V v) {
        weakReference = new WeakReference<V>(v);

        view = weakReference.get();
    }

    public void destoryView() {
        if (weakReference == null) {
            weakReference.clear();
        }
    }
}
