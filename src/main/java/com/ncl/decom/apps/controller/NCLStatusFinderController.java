package com.ncl.decom.apps.controller;


import com.ncl.decom.apps.entity.NCLResponseEntity;
import com.ncl.decom.apps.service.NCLStatusFinderService;
import com.ncl.decom.apps.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/api")
public class NCLStatusFinderController {

    NCLStatusFinderService nclStatusFinderService;

    @GetMapping(value="/v1/getAdminView")
    public ResponseEntity<NCLResponseEntity> getAdminView(@RequestParam String mpid){
        return ResponseUtil.successRequestResponse("success",nclStatusFinderService.getAdminView(mpid));
    }

    @GetMapping(value="/v1/getICTOInfraDetails")
    public ResponseEntity<NCLResponseEntity> getICTOInfraDetails(@RequestParam String icto,@RequestParam String mpid){
        return ResponseUtil.successRequestResponse("success",nclStatusFinderService.getICTOInfraDetails(icto,mpid));
    }
}
