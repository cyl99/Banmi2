package com.example.youfeadaway.banmi.activity;


import android.widget.Toast;

import com.example.youfeadaway.banmi.R;
import com.example.youfeadaway.banmi.base.BaseActivity;
import com.example.youfeadaway.banmi.presenter.MainPresenter;
import com.example.youfeadaway.banmi.view.MainView;

public class MainActivity extends BaseActivity<MainView, MainPresenter<MainView>> implements MainView {


    @Override
    public void showProgressbar() {

    }

    @Override
    public void hideProgressBar() {

    }


    @Override
    protected void initData() {
        presenter.getData();
    }

    @Override
    protected int createLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void onSucceed(String bean) {
        Toast.makeText(this, "q" + bean.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String error) {

    }

    @Override
    protected MainPresenter<MainView> createPresenter() {
        return new MainPresenter<>();
    }
}
