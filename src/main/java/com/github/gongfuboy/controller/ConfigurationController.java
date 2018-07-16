package com.github.gongfuboy.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhouLiMing on 2018/7/5.
 */
@Controller
@RequestMapping("/test/configuration")
@ConfigurationProperties
public class ConfigurationController {

    private String tempParam;

    public String getTempParam() {
        List<Object> list = new ArrayList<>();
        return tempParam;
    }

    public void setTempParam(String tempParam) {
        this.tempParam = tempParam;
    }
}
