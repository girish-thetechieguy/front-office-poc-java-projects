package Model;

public class Order {
    private String orderId;
    private String symbol;
    private int quantity;
    private double price;
    private OrderStatus status;

    public Order(String orderId, String symbol, int quantity, double price) {
        this.orderId = orderId;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.status = OrderStatus.NEW;
    }

    // Getters and Setters
    public String getOrderId() { return orderId; }
    public String getSymbol() { return symbol; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
