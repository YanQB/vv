package cn.liuqiming.vv.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import cn.liuqiming.vv.R;

/**
 * Created by Timmy on 2017/2/18.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected Toolbar mToolBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onCreateInit();
        setContentView(getLayoutId());
        init();
    }

    protected abstract int getLayoutId();

    /**
     * 在setContentView之前的初始化
     */
    protected void onCreateInit() {

    }

    /**
     * setContentView之后的初始化
     */
    protected void init() {
        initToolBar();
    }

    private void initToolBar() {
        mToolBar = (Toolbar) findViewById(R.id.tool_bar);
        if (mToolBar != null) {
            setSupportActionBar(mToolBar);
        }
    }

    protected void setTitle(String title) {
        if (mToolBar != null) {
            mToolBar.setTitle(title);
        }
    }
}