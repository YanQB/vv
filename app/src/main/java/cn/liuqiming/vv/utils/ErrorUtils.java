package cn.liuqiming.vv.utils;

/**
 * Created by Timmy on 2017/2/25.
 */

public class ErrorUtils {
    public static final int ERROR_SIGN = 202;
    public static final int ERROR_LOGIN = 101;
    public static final int ERROR_CONNECT = 9015;

    public static String getErrorMsg(int errorCode) {
        switch (errorCode) {
            case ERROR_SIGN:
                return "注册失败，该用户名已存在";
            case ERROR_LOGIN:
                return "登陆失败";
            case ERROR_CONNECT:
                return "网络连接超时";
        }
        return "";
    }
}
