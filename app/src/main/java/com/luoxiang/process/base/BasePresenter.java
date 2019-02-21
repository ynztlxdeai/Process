package com.luoxiang.process.base;

import android.content.Context;

import com.luoxiang.process.rx.RxManager;


/**
 * packageName:	    com.vincent.template.base
 * className:	    BasePresenter
 * author:	        Luoxiang
 * time:	        2017/4/4	15:07
 * desc:	        基类presenter
 *
 * svnVersion:
 * upDateAuthor:    Vincent
 * upDate:          2017/4/4
 * upDateDesc:      TODO
 */


public abstract class BasePresenter<M,V>{
    public Context   mContext;
    public M         mModel;
    public V         mView;
    public RxManager mRxManage = new RxManager();

    public void setVM(V v, M m) {
        this.mView = v;
        this.mModel = m;
        this.onStart();
    }
    public void onStart(){

    };
    public void onDestroy() {
        mRxManage.clear();
    }
}
