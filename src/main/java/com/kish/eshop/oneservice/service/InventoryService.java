package com.kish.eshop.oneservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kish.eshop.oneservice.service.fallback.InventoryServiceFallback;

@FeignClient(value = "inventory-service",fallback=InventoryServiceFallback.class)
public interface InventoryService {

	@RequestMapping(value = "/product-inventory/findByProductId",method = RequestMethod.GET)
    String findProductById(@RequestParam(value = "productId") Long productId);
	
}
