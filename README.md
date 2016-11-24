# DavidAndroidProjectTools

Android开发常用功能大集合。以及知识点的详解代码

项目名称：【Android利器】

前提说明,仅供参考.勿用于商业.有些接口是我自己抓取的,版权归原公司所有.

作者：[程序员小冰](http://blog.csdn.net/qq_21376985)

[欢迎点击关注我的微博](http://weibo.com/mcxiaobing)

先来看一下这个项目的总体功能图吧（这只是一小部分，会一直更新维护增加功能）：

![这里写图片描述](http://img.blog.csdn.net/20161031113558371)

更过功能欢迎下载APK进行体验(两种方式，建议第二种微云。腾讯Bugly可能有部分手机不兼容问题)：

1;[点击从腾讯Bugly下载APK进行体验效果](https://beta.bugly.qq.com/davidandroidprojecttools)

![这里写图片描述](http://img.blog.csdn.net/20161108144026261)

2;[点击从腾讯微云下载APK进行体验效果](https://sz-btfs-v2-yun-ftn.weiyun.com/ftn_handler/89277a84dd3265346828c6d955f0fad42dd67c19e3710c75024ee42d5ee317c075904f90706d63288339b2b52e82a6ceeab7dd1ab03e87831d6e47ed2920fb20/Android.apk?fname=Android.apk&from=30111&version=2.0.0.2&uin=986945193)

![腾讯微云下载apk二维码](http://img.blog.csdn.net/20161112153011508)

此项目是小冰工作中总结常用的功能大集合，防止以后用到的话重复造轮子，而且还有常用控件

以及难点的详解，注释非常啰嗦，纯粹是为了积累自己的知识，顺便方便自己查看。当然，说到各种

小功能，肯定少不了各种工具类与自定义View等等,我会和做项目一样，分包，并且要求和我自己做项目差不多

不过，每个人的习惯都不相同，具体分包不要纠结。希望大家能和我一样能看懂代码，学会理解，一起提高自我技能。

由于我也要上班，所以功能会慢慢地长期更新，维护此代码，所以，有bug或者好建议，欢迎提出。

当然，如果你有更好的功能，欢迎联系我。好知识一起共享。Thank You！下面是部分的功能知识点介绍：

包名架构图(目前,还在更戏中......)

![简单效果图展示](http://img.blog.csdn.net/20161031114217092)

【Android方面】里面主要是四大模块：

1,主要提供一些常用控件的知识点详解 

2,常用控件的一些封装，

3,app开发中常用功能的集成

a,二维码的扫描与生成功能 b,圆形头像的功能 

4,著名的一些开源框架的使用以及封装

【JAVA方面】java知识点：

1,设计模式：单例的恶汉式和懒汉式写法。

2,Map集合的存取数据详解。迭代器与增强for循环的知识点。

里面包含工具类：

1,正则提供验证邮箱、手机号、电话号码、身份证号码、数字等方法

2,log打印日志的工具类

3，Toast封装工具类

4，Activity的管理工具类

5，通过url获取Json数据 // 通过url获取网络Bitmap数据 （httpClient所完成）

6,网络状态的判断（是否有网络，以及网络是3G,WIFI等状况）

7,多种loading等待框的介绍与使用。

8,sharepreference的完美封装。

里面所使用第三方库以及（jar文件上传）：

Gson, Xutils2.6, Picasso,Universional_Imageloader, glide,OkHttp,fresco,shareSDK分享

腾讯Bugly,百度ApiStore,Umeng统计的功能等.

由于有些功能效果无法展示，具体实现请看项目源代码。

项目为小冰所写，仅供参考，请勿用于任何商业。转载请说明出处。

可以直接放在AndroidStudio开发工具中运行,

涉及到第三方服务API以及SDK,记得将Constants类中的API秘钥改为自己的即可。

欢迎star,fork，提出更好的建议。版权所有:程序员小冰
