package com.github.gongfuboy.service;

import com.github.gongfuboy.convert.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by ZhouLiMing on 2018/7/24.
 */
@Service
public class TempServiceImpl implements TempService {

    private static String temp = "asdas";

    @Autowired
    @Qualifier(value = "firstConvertImpl")
    private Convert firstConvertImpl;

    @Autowired
    @Qualifier(value = "secondConvertImpl")
    private Convert secondConvertImpl;

    @Override
    public void testPrint() {
        firstConvertImpl.print();
        secondConvertImpl.print();
    }

}
