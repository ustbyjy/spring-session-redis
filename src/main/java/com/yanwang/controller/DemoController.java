package com.yanwang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
public class DemoController {
    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping(value = "/set", method = RequestMethod.GET)
    public String setSession(HttpServletRequest request) {
        String name = request.getParameter("name");
        String value = request.getParameter("value");
        logger.info("set:" + name + "=" + value);
        request.getSession().setAttribute(name, value);

        return "success";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getSession(HttpServletRequest request, String name) {
        String value = (String) request.getSession().getAttribute(name);
        logger.info("get:" + name + "=" + value);

        return "success";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public String removeSession(HttpServletRequest request, String name) {
        String value = (String) request.getSession().getAttribute(name);
        logger.info("remove:" + name + "=" + value);
        request.getSession().removeAttribute(name);

        return "success";
    }
}
