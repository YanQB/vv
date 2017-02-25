package cn.liuqiming.vv.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cn.liuqiming.vv.R;
import cn.liuqiming.vv.base.BaseActivity;
import cn.liuqiming.vv.contract.LoginContract;
import cn.liuqiming.vv.presenterImpl.LoginPresenterImpl;

/**
 * Created by Timmy on 2017/2/25.
 */

public class LoginActivity extends BaseActivity implements LoginContract.View, View.OnClickListener {
    private LoginPresenterImpl mLoginPresenter;
    private EditText mUserName;
    private EditText mPwdEt;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void init() {
        super.init();
        mLoginPresenter = new LoginPresenterImpl(this);
        Button loginBtn = (Button) findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(this);
        Button signBtn = (Button) findViewById(R.id.sign_btn);
        signBtn.setOnClickListener(this);
        mUserName = (EditText) findViewById(R.id.user_name_et);
        mPwdEt = (EditText) findViewById(R.id.pwd_et);
    }

    @Override
    public void onLoginResult() {

    }

    @Override
    public void onSignResult() {

    }

    @Override
    public void loadError() {

    }

    @Override
    public void loadErrorReload() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_btn:
                login();
                break;
            case R.id.sign_btn:
                sign();
                break;
        }
    }

    private void login() {
        String userName = mUserName.getText().toString().trim();
        String pwd = mPwdEt.getText().toString().trim();
        mLoginPresenter.login(userName, pwd);
    }

    private void sign() {
        String userName = mUserName.getText().toString().trim();
        String pwd = mPwdEt.getText().toString().trim();
        mLoginPresenter.sign(userName, pwd);
    }
}