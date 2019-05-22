package com.example.youfeadaway.banmi.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class SimplActivity extends AppCompatActivity {

    private Unbinder bind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View inflate = LayoutInflater.from(this).inflate(createLayout(), null);
        setContentView(inflate);
        bind = ButterKnife.bind(this);
        createView(inflate);
        initData();
    }

    protected abstract void initData();

    protected abstract void createView(View inflate);

    protected abstract int createLayout();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (bind == null) {
            bind.unbind();

        }
    }
}
