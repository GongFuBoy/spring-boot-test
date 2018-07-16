package com.github.gongfuboy.configurate;

import com.github.gongfuboy.dao.BookDao;
import com.github.gongfuboy.domain.Book;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Conditional;

/**
 * Created by ZhouLiMing on 2018/7/3.
 */
public class AutoConfiguration {

    @ConditionalOnBean(BookDao.class)
    public Book createBook() {
        return new Book();
    }

    @Conditional(PersonalCondition.class)
    public Book createBool() {
        return new Book();
    }

}
