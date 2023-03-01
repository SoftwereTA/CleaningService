import java.util.*;

public class Order {
    private String id;
    private Customer customer;
    private List<Product> products;
    private Date orderDate;
    private String deliveryInformation;
    private String status;

    public Order(String id, Customer customer, List<Product> products, Date orderDate, String deliveryInformation) {
        this.id = id;
        this.customer = customer;
        this.products = products;
        this.orderDate = orderDate;
        this.deliveryInformation = deliveryInformation;
        this.status = "waiting";
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getDeliveryInformation() {
        return deliveryInformation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
