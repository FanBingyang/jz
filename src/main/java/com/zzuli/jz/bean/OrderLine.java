package com.zzuli.jz.bean;

import java.io.Serializable;

public class OrderLine implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order_line.id
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order_line.number
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    private Integer number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order_line.product_name
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order_line.product_price
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    private String productPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order_line.product_introduce
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    private String productIntroduce;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order_line.product_photo
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    private String productPhoto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order_line.product_id
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order_line.order_id
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jz_order_line
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order_line.id
     *
     * @return the value of jz_order_line.id
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order_line.id
     *
     * @param id the value for jz_order_line.id
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order_line.number
     *
     * @return the value of jz_order_line.number
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order_line.number
     *
     * @param number the value for jz_order_line.number
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order_line.product_name
     *
     * @return the value of jz_order_line.product_name
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order_line.product_name
     *
     * @param productName the value for jz_order_line.product_name
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order_line.product_price
     *
     * @return the value of jz_order_line.product_price
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public String getProductPrice() {
        return productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order_line.product_price
     *
     * @param productPrice the value for jz_order_line.product_price
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice == null ? null : productPrice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order_line.product_introduce
     *
     * @return the value of jz_order_line.product_introduce
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public String getProductIntroduce() {
        return productIntroduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order_line.product_introduce
     *
     * @param productIntroduce the value for jz_order_line.product_introduce
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public void setProductIntroduce(String productIntroduce) {
        this.productIntroduce = productIntroduce == null ? null : productIntroduce.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order_line.product_photo
     *
     * @return the value of jz_order_line.product_photo
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public String getProductPhoto() {
        return productPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order_line.product_photo
     *
     * @param productPhoto the value for jz_order_line.product_photo
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public void setProductPhoto(String productPhoto) {
        this.productPhoto = productPhoto == null ? null : productPhoto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order_line.product_id
     *
     * @return the value of jz_order_line.product_id
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order_line.product_id
     *
     * @param productId the value for jz_order_line.product_id
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order_line.order_id
     *
     * @return the value of jz_order_line.order_id
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order_line.order_id
     *
     * @param orderId the value for jz_order_line.order_id
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}