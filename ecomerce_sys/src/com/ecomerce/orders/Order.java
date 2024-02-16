package com.ecomerce.orders;

import java.util.ArrayList;

import com.ecomerce.Customer;
import com.ecomerce.Product;

/**
 * The Order class represents an order made by a customer in an e-commerce system.
 */
public class Order {
    private int orderID;
    private Customer customerName;
    private double orderTotal;
    private String orderStatus;
    public static int numberOfOrders;

    private ArrayList<Product> products;

    /**
     * Constructs an Order object with the specified order details.
     *
     * @param orderID     the ID of the order
     * @param customer    the customer who placed the order
     * @param orderTotal  the total amount of the order
     * @param orderStatus the status of the order
     * @param orderDate   the date when the order was placed
     */
    public Order() {
        this.products = new ArrayList<>();
        numberOfOrders++;

    }

    public static int getNumberOfCustomers(){
        return numberOfOrders;

    }

    public void addToCart(Product product) {
        this.products.add(product);
    }

    /**
     * Returns the ID of the order.
     *
     * @return the order ID
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * Sets the ID of the order.
     *
     * @param orderID the order ID to set
     * @throws IllegalArgumentException if the order ID is negative
     */
    public void setOrderID(int orderID) {
        if (orderID < 0) {
            throw new IllegalArgumentException("Order ID cannot be negative");
        }
        this.orderID = orderID;
    }

    /**
     * Returns the customer who placed the order.
     *
     * @return the customer of the order
     */
    public Customer getCustomer() {
        return customerName;
    }

    /**
     * Sets the customer who placed the order.
     *
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customerName = customer;
    }

    /**
     * Returns the total amount of the order.
     *
     * @return the order total
     */
    public double getOrderTotal() {
        return orderTotal;
    }

    /**
     * Sets the total amount of the order.
     *
     * @param orderTotal the order total to set
     * @throws IllegalArgumentException if the order total is negative
     */
    public void setOrderTotal(double orderTotal) {
        if (orderTotal < 0) {
            throw new IllegalArgumentException("Order total cannot be negative");
        }
        this.orderTotal = orderTotal;
    }

    /**
     * Returns the status of the order.
     *
     * @return the order status
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the status of the order.
     *
     * @param orderStatus the order status to set
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * Returns the list of products in the order.
     *
     * @return the list of products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * Sets the list of products in the order.
     *
     * @param products the list of products to set
     */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    

    /**
     * Displays the products in the order.
     */
    public void displayCart() {
        for (Product product : products) {
            System.out.println(product.getProductName());
        }
    }

    /**
     * Generates a summary of the order.
     *
     * @return the order summary
     */
    public String generateOrderSummary() {
        String summary = "Order Summary:\n";
        summary += "Order ID: " + getOrderID() + "\n";
        summary += "Order Total: $" + getOrderTotal() + "\n";
        summary += "Products Ordered:\n";
        for (Product product : getProducts()) {
            summary += "- " + product.getProductName() + "\n";
        }
        return summary;
    }
}
