package com.ecomerce;

/**
 * The Customer class represents a customer in an e-commerce system.
 */
public class Customer {
    private int customerID;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private String customerPhone;
    private static int numberOfCustomers;

    /**
     * Constructs a Customer object with the specified details.
     *
     * @param customerID        the ID of the customer
     * @param customerFirstName the first name of the customer
     * @param customerLastName  the last name of the customer
     * @param customerEmail     the email of the customer
     * @param customerPhone     the phone number of the customer
     */
    public Customer(int customerID, String customerFirstName, String customerLastName,
     String customerEmail, String customerPhone) {
        setCustomerID(customerID);
        setCustomerFirstName(customerFirstName);
        setCustomerLastName(customerLastName);
        setCustomerEmail(customerEmail);
        setCustomerPhone(customerPhone);
        numberOfCustomers++;
    }

    /**
     * Returns the number of customers in the system.
     *
     * @return the number of customers
     */
    public static int getNumberOfCustomers() {
        return numberOfCustomers;
    }
    

    /**
     * Returns the ID of the customer.
     *
     * @return the customer ID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Sets the ID of the customer.
     *
     * @param customerID the customer ID to set
     * @throws IllegalArgumentException if the customer ID is negative
     */
    public void setCustomerID(int customerID) {
        if (customerID < 0) {
            throw new IllegalArgumentException("Customer ID cannot be negative");
        }
        this.customerID = customerID;
    }

    /**
     * Returns the first name of the customer.
     *
     * @return the customer's first name
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Sets the first name of the customer.
     *
     * @param customerFirstName the customer's first name to set
     * @throws IllegalArgumentException if the customer's first name is null or empty
     */
    public void setCustomerFirstName(String customerFirstName) {
        if (customerFirstName == null || customerFirstName.isEmpty()) {
            throw new IllegalArgumentException("Customer First Name cannot be empty");
        }
        this.customerFirstName = customerFirstName;
    }

    /**
     * Returns the last name of the customer.
     *
     * @return the customer's last name
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Sets the last name of the customer.
     *
     * @param customerLastName the customer's last name to set
     * @throws IllegalArgumentException if the customer's last name is null or empty
     */
    public void setCustomerLastName(String customerLastName) {
        if (customerLastName == null || customerLastName.isEmpty()) {
            throw new IllegalArgumentException("Customer Last Name cannot be empty");
        }
        this.customerLastName = customerLastName;
    }

    /**
     * Returns the email of the customer.
     *
     * @return the customer's email
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Sets the email of the customer.
     *
     * @param customerEmail the customer's email to set
     * @throws IllegalArgumentException if the customer's email is null, empty, or invalid
     */
    public void setCustomerEmail(String customerEmail) {
        // Validate email format
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (customerEmail == null || customerEmail.isEmpty() || !customerEmail.matches(emailRegex)) {
            throw new IllegalArgumentException("Customer Email cannot be empty or invalid");
        }
        this.customerEmail = customerEmail;
    }

    /**
     * Returns the phone number of the customer.
     *
     * @return the customer's phone number
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * Sets the phone number of the customer.
     *
     * @param customerPhone the customer's phone number to set
     * @throws IllegalArgumentException if the customer's phone number is null, empty, or invalid
     */
    public void setCustomerPhone(String customerPhone) {
        // Validate phone number format
        String phoneRegex = "^[0-9]{10}$";
        if (customerPhone == null || customerPhone.isEmpty() || !customerPhone.matches(phoneRegex)) {
            throw new IllegalArgumentException("Customer Phone cannot be empty or invalid");
        }
        this.customerPhone = customerPhone;
    }

    /**
     * Returns the full name of the customer.
     *
     * @return the customer's full name
     */
    public String getCustomerFullName() {
        return customerFirstName + " " + customerLastName;
    }

    /**
     * Returns the contact information of the customer.
     *
     * @return the customer's contact information
     */
    public String getCustomerContact() {
        return customerEmail + " | " + customerPhone;
    }

    /**
     * Returns a string representation of the customer.
     *
     * @return a string representation of the customer
     */
    @Override
    public String toString() {
        return "Customer ID: " + customerID + "\n" +
                "Customer Name: " + getCustomerFullName() + "\n" +
                "Customer Contact: " + getCustomerContact();
    }
}
