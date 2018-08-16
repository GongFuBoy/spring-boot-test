package com.github.gongfuboy.convert;

import org.springframework.stereotype.Component;

/**
 * Created by ZhouLiMing on 2018/7/24.
 */
@Component
public class SecondConvertImpl implements Convert{
    @Override
    public void print() {
        System.out.println("我是second实现");
    }
}
