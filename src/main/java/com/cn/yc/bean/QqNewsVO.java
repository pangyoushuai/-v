package com.cn.yc.bean;

import com.cn.yc.utils.JsonUtils;

/**
 * Created by DT167 on 2017/12/27.
 */
public class QqNewsVO extends NewsVO {
    @Override
    public String getNewsString(){
        return JsonUtils.objToJson(this);
    }
}
