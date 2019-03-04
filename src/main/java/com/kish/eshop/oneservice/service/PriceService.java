package com.kish.eshop.oneservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kish.eshop.oneservice.fallback.PriceServiceFallback;

@FeignClient(value = "price-service",fallback=PriceServiceFallback.class)
public interface PriceService {

	@RequestMapping(value = "/product-price/findByProductId",method = RequestMethod.GET)
    String findProductById(@RequestParam(value = "productId") Long productId);
	
}
