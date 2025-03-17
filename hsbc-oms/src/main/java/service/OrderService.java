package service;

import Model.Order;
import Model.OrderStatus;
import Repository.OrderRepository;

public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void createOrder(String orderId, String symbol, int quantity, double price) {
        Order order = new Order(orderId, symbol, quantity, price);
        orderRepository.save(order);
        System.out.println("Order created: " + order);
    }

    public void cancelOrder(String orderId) {
        Order order = orderRepository.findById(orderId);
        if (order != null && order.getStatus() != OrderStatus.COMPLETED) {
            order.setStatus(OrderStatus.CANCELED);
            System.out.println("Order canceled: " + order);
        } else {
            System.out.println("Order not found or already completed.");
        }
    }

    public void viewOrder(String orderId) {
        Order order = orderRepository.findById(orderId);
        if (order != null) {
            System.out.println("Order details: " + order);
        } else {
            System.out.println("Order not found.");
        }
    }

    public void listAllOrders() {
        System.out.println("All orders:");
        for (Order order : orderRepository.findAll().values()) {
            System.out.println(order);
        }
    }
}
