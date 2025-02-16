package com.msgroups.msscolarite.proxy;

import com.msgroups.msscolarite.model.Formation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-formation",url = "localhost:8084")

public interface FormationProxy {
    @GetMapping("/formation/{id}")
    public Formation getFormation(@PathVariable("id") String id);
}
