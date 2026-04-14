package com.xworkz.comparator.runner;

public class Product implements Comparable<Product>{
    private Integer id;
    private String productName;
    private Double price;
    private Boolean isAvailable;

    public Product(Integer id, String productName, Double price, Boolean isAvailable) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    @Override
    public int compareTo(Product o) {
        return this.id.compareTo(o.id);
    }
}
