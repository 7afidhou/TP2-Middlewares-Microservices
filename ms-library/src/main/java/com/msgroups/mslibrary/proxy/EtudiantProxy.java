package com.msgroups.mslibrary.proxy;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
@EnableFeignClients
@FeignClient(name = "ms-scolarite",url = "localhost:8080")
public interface EtudiantProxy {

}
