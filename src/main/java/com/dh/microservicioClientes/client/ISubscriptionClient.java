package com.dh.microservicioClientes.client;


import com.dh.microservicioClientes.configuration.CustomLoadBalancerConfiguration;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("microservicioProveedores")
@LoadBalancerClient(name = "microservicioProveedores", configuration = CustomLoadBalancerConfiguration.class )
public interface ISubscriptionClient {

    @GetMapping("/proveedores")
    String find();


}