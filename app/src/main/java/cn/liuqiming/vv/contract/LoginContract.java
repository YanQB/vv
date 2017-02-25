package cn.liuqiming.vv.contract;

import cn.liuqiming.vv.base.BaseContract;

/**
 * Created by Timmy on 2017/2/25.
 */

public interface LoginContract {

    interface View extends BaseContract.BaseView {
        void onLoginResult();

        void onSignResult();
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void login(String userName, String pwd);

        void sign(String userName, String pwd);
    }
}