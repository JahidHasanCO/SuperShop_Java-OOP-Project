package ModelClass;

import Interfaces.Item;

/**
 * in this class i implement item interface.
 */
public class Product implements Item {

    private String Name;
    private int productId;
    private double ProductPrice;
    private String Category;

    /**
     * this is an parameterise constractor we ini value (name,productId,
     * productPrice, Category) when creating object.
     * 
     * @param name
     * @param productId
     * @param productPrice
     * @param category
     */
    public Product(String name, int productId, double productPrice, String category) {
        Name = name;
        this.productId = productId;
        ProductPrice = productPrice;
        Category = category;
    }

    /**
     * this is getter mathod. we get name from this method
     * 
     * @return
     */
    public String getName() {
        return Name;
    }

    /**
     * this is setter method. we can set name by calling this method
     * 
     * @param name we can set name in this parameter
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * this is getter method we can get product id from this method.
     * 
     * @return
     */
    public int getProductId() {
        return productId;
    }

    /**
     * this is setter method
     * 
     * @param productId we can set product id or update product by this @param
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * this is getter method
     * 
     * @return we can get product price by lling this method
     */
    public double getProductPrice() {
        return ProductPrice;
    }

    /**
     * this is setter method we can set or update product price by calling this
     * method
     * 
     * @param productPrice this param get double type value
     */
    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    /**
     * this is a getter method
     * 
     * @return we get category value fron this method. this method return category
     *         member value
     */
    public String getCategory() {
        return Category;
    }

    /**
     * this is setter method
     * 
     * @param category this parameter get catagory. String type data
     */
    public void setCategory(String category) {
        Category = category;
    }

    /**
     * this is an override methode from item interface in this method i print
     * product details.
     */
    @Override
    public void displayItem() {

        System.out.println("Product Name: " + Name);
        System.out.println("Product Id: " + productId);
        System.out.println("Product Category: " + Category);
        System.out.println("Product Price: " + ProductPrice);
    }
}
