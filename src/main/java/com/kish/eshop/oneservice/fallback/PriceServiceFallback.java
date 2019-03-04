package com.kish.eshop.oneservice.fallback;
import org.springframework.stereotype.Component;
import com.kish.eshop.oneservice.service.InventoryService;

@Component
public class PriceServiceFallback implements InventoryService{

	@Override
	public String findProductById(Long productId) {
		// TODO Auto-generated method stub
		return "降级价格";
	}

}
