package com.example.youfeadaway.banmi.presenter;

import com.example.youfeadaway.banmi.base.BaseCallBack;
import com.example.youfeadaway.banmi.base.BasePresenter;
import com.example.youfeadaway.banmi.model.MainModel;
import com.example.youfeadaway.banmi.view.MainView;

/**
 * Created by Administrator on 2019/5/22.
 */

public class MainPresenter<V extends MainView> extends BasePresenter<V> implements BaseCallBack<String> {
    MainModel mMianModel = new MainModel();

    public void getData() {
        mMianModel.initDataMain(this);
    }


    @Override
    public void onSucceed(String bean) {
        view.onSucceed(bean);
    }

    @Override
    public void onError(String error) {

    }
}
