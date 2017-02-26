package cn.liuqiming.vv.contract;

import cn.liuqiming.vv.base.BaseContract;
import cn.liuqiming.vv.bean.Result;

/**
 * Created by Timmy on 2017/2/25.
 */

public interface LoginContract {

    interface View extends BaseContract.BaseView {
        void onLoginResult(Result result);

        void onSignResult(Result result);
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void login(String userName, String pwd);

        void sign(String userName, String pwd);
    }
}