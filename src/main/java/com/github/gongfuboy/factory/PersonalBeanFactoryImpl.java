package com.github.gongfuboy.factory;

import com.github.gongfuboy.convert.Convert;
import com.github.gongfuboy.convert.ConvertBeanNameConfiguration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 *
 * 这个东西是类似于SpringContext一个自定义简单静态工厂类
 *
 * Created by ZhouLiMing on 2018/7/24.
 */
@Component
public class PersonalBeanFactoryImpl implements ApplicationContextAware{

    private static ApplicationContext applicationContext;

    @Autowired
    private static ConvertBeanNameConfiguration convertBeanNameConfiguration;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 通过名称获取不同的convert类型的bean
     * @return
     */
    public static Convert getFirstBean() {
        return applicationContext.getBean(convertBeanNameConfiguration.getFirstConvertName(), Convert.class);
    }

    public static Convert getSecondBean() {
        return applicationContext.getBean(convertBeanNameConfiguration.getSecondConvertName(), Convert.class);
    }


}
