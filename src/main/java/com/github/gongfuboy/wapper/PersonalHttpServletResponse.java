package com.github.gongfuboy.wapper;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * Created by ZhouLiMing on 2018/7/3.
 */
public class PersonalHttpServletResponse extends HttpServletResponseWrapper{
    /**
     * Constructs a response adaptor wrapping the given response.
     *
     * @param response The response to be wrapped
     * @throws IllegalArgumentException if the response is null
     */
    public PersonalHttpServletResponse(HttpServletResponse response) {
        super(response);
    }

    public void addResponseStatus(int status) {
        ((HttpServletResponse) super.getResponse()).setStatus(status);
    }

}
