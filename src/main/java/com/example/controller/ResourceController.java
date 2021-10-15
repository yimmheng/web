package com.example.controller;

import com.example.bean.Count;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.service.ResourceService;

@RestController
public class ResourceController {

    @Autowired
    ResourceService resourceService;

    @RequestMapping(value = "/me/count", method = RequestMethod.PUT)
    @ResponseBody
    public void initCount(@RequestBody Count count){
        resourceService.initCount(count);
    }

    @RequestMapping(value = "/me/count", method = RequestMethod.POST)
    @ResponseBody
    public void modifyCount(@RequestBody Count count){
        resourceService.addCount(count);
    }

    @RequestMapping(value = "/me/count", method = RequestMethod.GET)
    @ResponseBody
    public  Count getCount()
    {
        return resourceService.getCount();
    }
}