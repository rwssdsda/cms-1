package com.briup.cms.web.controller;

import com.briup.cms.bean.Link;
import com.briup.cms.util.Message;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/link")
public class LinkController {
    @PostMapping("/add")
    public Message addLink(Link link){

        return null;
    }
}
