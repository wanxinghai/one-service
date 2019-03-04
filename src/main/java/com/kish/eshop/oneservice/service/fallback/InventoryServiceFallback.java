package com.kish.eshop.oneservice.service.fallback;
import org.springframework.stereotype.Component;
import com.kish.eshop.oneservice.service.InventoryService;

@Component
public class InventoryServiceFallback implements InventoryService{

	@Override
	public String findProductById(Long productId) {
		// TODO Auto-generated method stub
		return "降级库存";
	}

}
