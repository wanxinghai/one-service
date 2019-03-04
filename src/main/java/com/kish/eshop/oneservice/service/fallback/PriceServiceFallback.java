package com.kish.eshop.oneservice.service.fallback;
import org.springframework.stereotype.Component;

import com.kish.eshop.oneservice.service.PriceService;

@Component
public class PriceServiceFallback implements PriceService{

	@Override
	public String findProductById(Long productId) {
		// TODO Auto-generated method stub
		return "降级价格";
	}

}
