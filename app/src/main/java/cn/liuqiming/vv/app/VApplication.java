package cn.liuqiming.vv.app;

import android.app.Application;

import cn.bmob.v3.Bmob;
import cn.liuqiming.vv.common.Contacts;
import cn.liuqiming.vv.utils.AppUtils;

/**
 * Created by Timmy on 2017/2/25.
 */

public class VApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化bmob
        Bmob.initialize(this, Contacts.BMOB_APPLICATION_ID);
        AppUtils.init(this);
    }
}