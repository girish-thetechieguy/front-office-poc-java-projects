package Repository;

import Model.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {
    private Map<String, Order> orderDatabase = new HashMap<>();

    public void save(Order order) {
        orderDatabase.put(order.getOrderId(), order);
    }

    public Order findById(String orderId) {
        return orderDatabase.get(orderId);
    }

    public void delete(String orderId) {
        orderDatabase.remove(orderId);
    }

    public Map<String, Order> findAll() {
        return orderDatabase;
    }
}
