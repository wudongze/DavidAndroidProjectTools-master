package davidandroidprojecttools.qq986945193.com.davidandroidprojecttools.activity;/*
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * @OsChina空间: https://my.oschina.net/mcxiaobing
 */

import davidandroidprojecttools.qq986945193.com.davidandroidprojecttools.R;
import davidandroidprojecttools.qq986945193.com.davidandroidprojecttools.constant.Constants;

/**
 * 调用本地的json数据进行更新apk
 */
public class LocalJsonUpdateAppActivity extends BaseActivity{
    @Override
    protected void initView() {
        setContentView(R.layout.activity_local_json_update_app);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void setTitle() {
        super.setTitle();
        tvTitle.setText(Constants.BASE_ACTIVITY_TITLE);

    }
}
