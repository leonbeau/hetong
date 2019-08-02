package entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-03 17:13
 * @Version 1.0
 */
//商品评价的实体类
public class ProductComment implements Serializable {
    private int productCommentId;
    private int userId;
    private int productId;
    private String comment;
    private double productMark;
    private Date createDate;

    public ProductComment() {
    }

    public ProductComment(int productCommentId, int userId, int productId, String comment, double productMark, Date createDate) {
        this.productCommentId = productCommentId;
        this.userId = userId;
        this.productId = productId;
        this.comment = comment;
        this.productMark = productMark;
        this.createDate = createDate;
    }

    public int getProductCommentId() {
        return productCommentId;
    }

    public void setProductCommentId(int productCommentId) {
        this.productCommentId = productCommentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getProductMark() {
        return productMark;
    }

    public void setProductMark(double productMark) {
        this.productMark = productMark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "ProductComment{" +
                "productCommentId=" + productCommentId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", comment='" + comment + '\'' +
                ", productMark=" + productMark +
                ", createDate=" + createDate +
                '}';
    }
}
