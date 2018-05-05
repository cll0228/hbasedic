package com.holyrobot.controller;

import com.holyrobot.pojo.NameSpace;
import com.holyrobot.service.HBaseService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * Created by cuill on 2018/4/2.
 */
@RestController
@Slf4j
public class HbaseController {

    @Autowired
    private HBaseService hBaseService;

    Logger logger = LoggerFactory.getLogger(HbaseController.class);

    @RequestMapping(value = "/namespace")
    @ResponseBody
    public List<NameSpace> send() {
        try {
            return hBaseService.getNamespace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
