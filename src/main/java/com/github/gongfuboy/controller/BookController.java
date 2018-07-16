package com.github.gongfuboy.controller;

import com.github.gongfuboy.IConverter;
import com.github.gongfuboy.dao.BookDao;
import com.github.gongfuboy.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by ZhouLiMing on 2018/6/29.
 */
@Controller
@RequestMapping("/")
public class BookController {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private IConverter iConverter;

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String findBooksByReader(@PathVariable("reader") String reader, Model model, HttpServletResponse httpServletResponse) throws IOException {
        List<Book> booksByReader = bookDao.findBooksByReader(reader);
        model.addAttribute("books", booksByReader);
        model.addAttribute("temp", "something-test");
        httpServletResponse.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "500");

        iConverter.print();

        return "index.html";
    }


}
