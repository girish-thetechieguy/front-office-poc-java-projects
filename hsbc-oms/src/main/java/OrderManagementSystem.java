import Repository.OrderRepository;
import service.OrderService;

public class OrderManagementSystem {
    public static void main(String[] args) {
        OrderRepository orderRepository = new OrderRepository();
        OrderService orderService = new OrderService(orderRepository);

        // Creating orders
        orderService.createOrder("1", "AAPL", 10, 150.00);
        orderService.createOrder("2", "GOOGL", 5, 2500.00);

        // Viewing an order
        orderService.viewOrder("1");

        // Listing all orders
        orderService.listAllOrders();

        // Canceling an order
        orderService.cancelOrder("1");

        // Viewing the canceled order
        orderService.viewOrder("1");
    }
}
