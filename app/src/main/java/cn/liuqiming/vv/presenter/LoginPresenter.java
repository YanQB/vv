package cn.liuqiming.vv.presenter;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.LogInListener;
import cn.bmob.v3.listener.SaveListener;
import cn.liuqiming.vv.base.BasePresenter;
import cn.liuqiming.vv.bean.Result;
import cn.liuqiming.vv.bean.User;
import cn.liuqiming.vv.contract.LoginContract;
import cn.liuqiming.vv.utils.ErrorUtils;

/**
 * Created by Timmy on 2017/2/25.
 */

public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter<LoginContract.View> {

    @Override
    public void login(String userName, String pwd) {
        BmobUser.loginByAccount(userName, pwd, new LogInListener<User>() {
            @Override
            public void done(User user, BmobException e) {
                if (user != null) {
                    if (mView != null) {
                        Result result = new Result();
                        result.isSuccess = true;
                        mView.onLoginResult(result);
                    }
                } else {
                    if (mView != null) {
                        Result result = new Result();
                        result.isSuccess = false;
                        result.errorMsg = ErrorUtils.getErrorMsg(e.getErrorCode());
                        mView.onLoginResult(result);
                    }
                }
            }
        });
    }

    @Override
    public void sign(String userName, String pwd) {
        User user = new User();
        user.setUsername(userName);
        user.setPassword(pwd);
        user.signUp(new SaveListener<User>() {
            @Override
            public void done(User user, BmobException e) {
                if (e == null) {
                    if (mView != null) {
                        Result result = new Result();
                        result.isSuccess = true;
                        mView.onSignResult(result);
                    }
                } else {
                    if (mView != null) {
                        Result result = new Result();
                        result.isSuccess = true;
                        result.errorMsg = ErrorUtils.getErrorMsg(e.getErrorCode());
                        mView.onSignResult(result);
                    }
                }
            }
        });
    }
}