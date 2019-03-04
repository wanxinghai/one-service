package com.kish.eshop.oneservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kish.eshop.oneservice.service.InventoryService;
import com.kish.eshop.oneservice.service.PriceService;

@RestController
@RequestMapping("/one")
public class OneController {

	@Autowired
	private InventoryService inventoryService;
	@Autowired
	private PriceService priceService;
	
	@RequestMapping("/findInventoryByProductId")
	public String findInventoryByProductId(Long productId){
		 return inventoryService.findProductById(productId);
	}
	
	@RequestMapping("/findPriceByProductId")
	public String findPriceByProductId(Long productId){
		 return priceService.findProductById(productId);
	}
	
}
