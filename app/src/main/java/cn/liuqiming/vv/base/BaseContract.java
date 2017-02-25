package cn.liuqiming.vv.base;

/**
 * Created by Timmy on 2017/2/25.
 */

public interface BaseContract {

    interface BasePresenter<T> {
        void attachView(T view);

        void detachView();
    }

    interface BaseView {
        void loadError();

        void loadErrorReload();
    }
}
