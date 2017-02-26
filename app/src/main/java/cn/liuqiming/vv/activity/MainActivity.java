package cn.liuqiming.vv.activity;

import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.ListView;

import cn.liuqiming.vv.R;
import cn.liuqiming.vv.base.BaseActivity;

public class MainActivity extends BaseActivity {
    private DrawerLayout dl;
    private ListView mDrawerList;
    private ActionBarDrawerToggle barDrawerToggle;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        super.init();
        setTitle("微圈");
        setNavigationIcon(R.mipmap.ic_launcher);
        dl = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.drawer_list);
        initDrawer(dl);
        initListener();
    }

    private void initListener() {
        setNavigationClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dl.isDrawerOpen(mDrawerList)) {
                    dl.closeDrawer(mDrawerList);
                } else {
                    dl.openDrawer(mDrawerList);
                }
            }
        });
    }

    private void initDrawer(DrawerLayout drawerLayout) {
        barDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.mipmap.ic_launcher, R.string.app_name, R.string.app_name) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        drawerLayout.setDrawerListener(barDrawerToggle);
    }
}