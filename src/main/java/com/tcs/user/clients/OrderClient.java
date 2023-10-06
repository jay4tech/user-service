package com.tcs.user.clients;

import com.tcs.user.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "order-service", url = "http://localhost:8082")
public interface OrderClient {

    @GetMapping("/orders/user/{userId}")
    public List<Order> getOrderByUserId(@PathVariable Long userId);
  
}