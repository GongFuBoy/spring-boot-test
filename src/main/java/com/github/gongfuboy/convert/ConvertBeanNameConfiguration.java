package com.github.gongfuboy.convert;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by ZhouLiMing on 2018/7/24.
 */
@Component
@ConfigurationProperties("bean.name")
public class ConvertBeanNameConfiguration {

    private String firstConvertName;

    private String secondConvertName;

    public String getFirstConvertName() {
        return firstConvertName;
    }

    public void setFirstConvertName(String firstConvertName) {
        this.firstConvertName = firstConvertName;
    }

    public String getSecondConvertName() {
        return secondConvertName;
    }

    public void setSecondConvertName(String secondConvertName) {
        this.secondConvertName = secondConvertName;
    }
}
