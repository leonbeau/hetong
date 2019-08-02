package entity;

import java.io.Serializable;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-03 17:10
 * @Version 1.0
 */
//商品的实体类
public class Product implements Serializable {
    private int productId;
    private String productName;
    private double productPrice;
    //商品的简介
    private String productDesc;
    private int storeId;
    //商品的标志

    private String productImage;

    public Product() {
    }

    public Product(int productId, String productName, double productPrice, String productDesc, int storeId, String productImage) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDesc = productDesc;
        this.storeId = storeId;
        this.productImage = productImage;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productDesc='" + productDesc + '\'' +
                ", storeId=" + storeId +
                ", productImage='" + productImage + '\'' +
                '}';
    }
}
