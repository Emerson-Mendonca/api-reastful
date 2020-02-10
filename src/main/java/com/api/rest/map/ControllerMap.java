package com.api.rest.map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.controller.EmpRestURIConstants;
import com.api.rest.paginas.Create;

@RestController
@RequestMapping("/api")
public class ControllerMap {

    private static final Logger LOG = LoggerFactory.getLogger(ControllerMap.class);

    // Map to store employees, ideally we should use database

    @RequestMapping(value = EmpRestURIConstants.GET_EMP, method = RequestMethod.GET)
    public @ResponseBody Object getEmployee(@PathVariable("id") int empId) {
        LOG.info("Start getEmployee. ID=" + empId);
        return ResponseEntity.ok(empId);
    }
    
    @RequestMapping(value = EmpRestURIConstants.CREATE_EMP, method = RequestMethod.GET)
    public @ResponseBody Object getObject() {
    	Create create = new Create();
        LOG.info("Start getEmployee. OID=" + create.create()  );
        return  ResponseEntity.ok(create.create());
    }

}