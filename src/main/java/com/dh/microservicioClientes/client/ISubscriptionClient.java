package com.dh.microservicioClientes.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("microservicioProveedores")
public interface ISubscriptionClient {

    @GetMapping("/subscription/find")
    String find();


}