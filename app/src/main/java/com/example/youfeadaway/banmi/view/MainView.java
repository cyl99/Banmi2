package com.example.youfeadaway.banmi.view;

import com.example.youfeadaway.banmi.base.BaseView;

/**
 * Created by Administrator on 2019/5/22.
 */

public interface MainView extends BaseView{
    void onSucceed(String bean);

    void onError(String error);
}
