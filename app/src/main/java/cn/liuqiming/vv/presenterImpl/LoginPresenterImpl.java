package cn.liuqiming.vv.presenterImpl;

import cn.liuqiming.vv.contract.LoginContract;
import cn.liuqiming.vv.presenter.LoginPresenter;

/**
 * Created by Timmy on 2017/2/25.
 */

public class LoginPresenterImpl {
    private LoginPresenter mLoginPresenter;

    public LoginPresenterImpl() {

    }

    public LoginPresenterImpl(LoginContract.View view) {
        mLoginPresenter = new LoginPresenter();
        mLoginPresenter.attachView(view);
    }

    public void login(String userName, String pwd) {
        mLoginPresenter.login(userName, pwd);
    }

    public void sign(String userName, String pwd) {
        mLoginPresenter.sign(userName, pwd);
    }
}