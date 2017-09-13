package com.woodys.eventcollect.database.table.temp;

import com.woodys.eventcollect.database.annotation.TableField;

/**
 * Created by woodys on 2017/9/7.
 */
public class TempEventData {
    @TableField(value = "e_id")
    public int eId;//事件信息id
    public int width;// 屏幕宽
    public int height;// 屏幕高
    @TableField(value = "android_version")
    public String androidVersion;//android系统版本号
    @TableField(value = "device_id")
    public String deviceId;// 设备唯一id
    @TableField(value = "mobile_model")
    public String mobilemodel;// android6.0 iphone10 ..
    @TableField(value = "mobile_type")
    public String mobiletype;// 小米1 iphone6s ...

    @TableField(value = "phone_no")
    public String phoneNo;
    @TableField(value = "app_version")
    public String appVersion;// 版本
    public String operator;// 运营商
    public String latitude;// 纬度
    public String longitude;//经度
    public String network;// 3G WIFI ...

    //事件信息
    public String type;// 类型
    public String page;// class
    @TableField(value = "offset_time")
    public long offsetTime;// 当前操作相对于上次操作的偏移时间,后端收到消息后解析时间

    //type is enterPage
    @TableField(value = "page_title")
    public String pageTitle;// 页面title

    //type is leavePage
    @TableField(value = "standing_time")
    public long standingTime;// 页面停留时间，当前时间减去进入的时间

    //type is click
    public int x;// x坐标
    public int y;// y坐标
    public String identify;// 描述信息

    public long ct;//创建时间
}
