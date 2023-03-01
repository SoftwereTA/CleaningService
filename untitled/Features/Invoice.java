public class Invoice {
    private Customers customer;
    private List<Product> items;
    private double totalAmount;
    private String deliveryAddress;
    private String deliveryDate;

    public Invoice(Customers customer, List<Product> items, double totalAmount, String deliveryAddress, String deliveryDate) {
        this.customer = customer;
        this.items = items;
        this.totalAmount = totalAmount;
        this.deliveryAddress = deliveryAddress;
        this.deliveryDate = deliveryDate;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }