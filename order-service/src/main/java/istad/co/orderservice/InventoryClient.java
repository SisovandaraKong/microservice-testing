package istad.co.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory-service") // service name registered in Eureka
public interface InventoryClient {

    @GetMapping("/inventory/check/{productId}")
    boolean checkStock(@PathVariable Long productId);
}
