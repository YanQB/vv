package cn.liuqiming.vv.presenter;

import android.util.Log;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.LogInListener;
import cn.bmob.v3.listener.SaveListener;
import cn.liuqiming.vv.base.BasePresenter;
import cn.liuqiming.vv.bean.User;
import cn.liuqiming.vv.contract.LoginContract;

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
                    Log.d("bmob", "用户登陆成功");
                } else {
                    Log.d("bmob", "登陆失败");
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
                    Log.d("bmob", "注册成功");
                } else {
                    Log.d("bmob", "注册失败");
                }
            }
        });
    }
}