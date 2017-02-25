package cn.liuqiming.vv.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by Timmy on 2017/2/25.
 */

public class User extends BmobObject {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}