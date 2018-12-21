package com.jc.cc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller//因为restcontroller默认返回json数据
public class PageController {

    @RequestMapping("/index")
    public String index(Model model){//Model：像前面反应提示
        ArrayList<String> list=new ArrayList<>();
        list.add("JJJ");
        list.add("cc");
        model.addAttribute("name","Jiac");
        model.addAttribute("list",list);
        model.addAttribute("mobile","199****3062");
        return "index";
    }
}
