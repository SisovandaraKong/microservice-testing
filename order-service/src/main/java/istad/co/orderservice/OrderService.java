package istad.co.orderservice;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final InventoryClient inventoryClient;

    public OrderService(InventoryClient inventoryClient) {
        this.inventoryClient = inventoryClient;
    }

    public boolean canPlaceOrder(Long productId) {
        return inventoryClient.checkStock(productId);
    }
}