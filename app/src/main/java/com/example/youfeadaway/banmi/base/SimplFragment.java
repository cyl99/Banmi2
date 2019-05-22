package com.example.youfeadaway.banmi.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class SimplFragment extends Fragment {


    private Unbinder bind;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = LayoutInflater.from(BaseApp.getBaseApp()).inflate(createLayout(), null);
        bind = ButterKnife.bind(this, inflate);
        createView(inflate);
        initData();
        return inflate;
    }

    protected abstract void initData();

    protected abstract void createView(View inflate);

    protected abstract int createLayout();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (bind == null) {

            bind.unbind();

        }
    }
}
