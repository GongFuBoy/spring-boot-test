package com.github.gongfuboy.dao;

import com.github.gongfuboy.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by ZhouLiMing on 2018/6/29.
 */
public interface BookDao extends JpaRepository<Book, Long>{

    /**
     * 根据reader查询书籍列表
     * @param reader
     * @return
     */
    List<Book> findBooksByReader(String reader);
}
