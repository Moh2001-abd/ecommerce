package com.ecomerce;

/**
 * Represents a product in an e-commerce system.
 */
public class Product {

    private int productID;
    private String productName;
    private double productPrice;
    private int productQuantity;
    private String productDescription;
    private String productCategory;
    private String productImage;

    /**
     * Constructs a new Product object with the specified attributes.
     *
     * @param productID          the ID of the product
     * @param productName        the name of the product
     * @param productPrice       the price of the product
     * @param productQuantity    the quantity of the product
     * @param productDescription the description of the product
     * @param productCategory    the category of the product
     * @param productImage       the image URL of the product
     */
    public Product(int productID, String productName, double productPrice, int productQuantity, String productDescription, String productCategory, String productImage) {
        setProductID(productID);
        setProductName(productName);
        setProductPrice(productPrice);
        setProductQuantity(productQuantity);
        setProductDescription(productDescription);
        setProductCategory(productCategory);
        setProductImage(productImage);
    }

    /**
     * Returns the ID of the product.
     *
     * @return the product ID
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Sets the ID of the product.
     *
     * @param productID the product ID to set
     * @throws IllegalArgumentException if the product ID is negative
     */
    public void setProductID(int productID) {
        if (productID < 0) {
            throw new IllegalArgumentException("Product ID cannot be negative");
        }
        this.productID = productID;
    }

    /**
     * Returns the name of the product.
     *
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the name of the product.
     *
     * @param productName the product name to set
     * @throws IllegalArgumentException if the product name is null or empty
     */
    public void setProductName(String productName) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Product Name cannot be empty");
        }
        this.productName = productName;
    }

    /**
     * Returns the price of the product.
     *
     * @return the product price
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * Sets the price of the product.
     *
     * @param productPrice the product price to set
     * @throws IllegalArgumentException if the product price is negative
     */
    public void setProductPrice(double productPrice) {
        if (productPrice < 0) {
            throw new IllegalArgumentException("Product Price cannot be negative");
        }
        this.productPrice = productPrice;
    }

    /**
     * Returns the quantity of the product.
     *
     * @return the product quantity
     */
    public int getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the quantity of the product.
     *
     * @param productQuantity the product quantity to set
     * @throws IllegalArgumentException if the product quantity is negative
     */
    public void setProductQuantity(int productQuantity) {
        if (productQuantity < 0) {
            throw new IllegalArgumentException("Product Quantity cannot be negative");
        }
        this.productQuantity = productQuantity;
    }

    /**
     * Returns the description of the product.
     *
     * @return the product description
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the description of the product.
     *
     * @param productDescription the product description to set
     * @throws IllegalArgumentException if the product description is null or empty
     */
    public void setProductDescription(String productDescription) {
        if (productDescription == null || productDescription.isEmpty()) {
            throw new IllegalArgumentException("Product Description cannot be empty");
        }
        this.productDescription = productDescription;
    }

    /**
     * Returns the category of the product.
     *
     * @return the product category
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the category of the product.
     *
     * @param productCategory the product category to set
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * Returns the image URL of the product.
     *
     * @return the product image URL
     */
    public String getProductImage() {
        return productImage;
    }

    /**
     * Sets the image URL of the product.
     *
     * @param productImage the product image URL to set
     * @throws IllegalArgumentException if the product image URL is null or empty
     */
    public void setProductImage(String productImage) {
        if (productImage == null || productImage.isEmpty()) {
            throw new IllegalArgumentException("Product Image cannot be empty");
        }
        this.productImage = productImage;
    }

    /**
     * Returns a string representation of the product.
     *
     * @return a string representation of the product
     */
    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                ", productDescription='" + productDescription + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productImage='" + productImage + '\'' +
                '}';
    }
}
