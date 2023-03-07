package com.dh.microservicioCliente.client;


import com.dh.microservicioCliente.configuration.CustomLoadBalancerConfiguration;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("microservicioProveedores")
@LoadBalancerClient(name = "microservicioProveedores", configuration = CustomLoadBalancerConfiguration.class )
public interface ISubscriptionClient {

    @GetMapping("/proveedores")
    String find();

    @GetMapping("/saludar")
    String getSaludar();

}