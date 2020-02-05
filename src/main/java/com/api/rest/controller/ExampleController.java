package com.api.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExampleController {

    private static final Logger LOG = LoggerFactory.getLogger(ExampleController.class);

    // Map to store employees, ideally we should use database

    @RequestMapping(value = EmpRestURIConstants.GET_EMP, method = RequestMethod.GET)
    public @ResponseBody Object getEmployee(@PathVariable("id") int empId) {
        LOG.info("Start getEmployee. ID=" + empId);
        return ResponseEntity.ok(empId);
    }

}