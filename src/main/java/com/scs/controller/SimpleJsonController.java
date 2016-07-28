package com.scs.controller;

import com.scs.model.Job;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by skrishna on 7/28/16.
 */
@Controller
public class SimpleJsonController {

    @RequestMapping(value = "/app", method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public Job printWelcome() {
        Job job=new Job();
        job.setId(101);
        job.setName("name");
        job.setPoNumber(1233);
        return job;

    }
}
