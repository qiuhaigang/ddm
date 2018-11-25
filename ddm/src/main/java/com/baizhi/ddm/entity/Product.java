package com.baizhi.ddm.entity;

public class Product {

    private Integer bookId;
    private String bookName;
    private String productImage;
    private Double price;
    private Double dangPrice;
    private Integer inventory;
    private String author;
    private String press;
    private Integer salaNum;
    private Double customeScore;
    private Category category;


    public Product(Integer bookId, String bookName, String productImage, Double price, Double dangPrice, Integer inventory, String author, String press, Integer salaNum, Double customeScore, Category category) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.productImage = productImage;
        this.price = price;
        this.dangPrice = dangPrice;
        this.inventory = inventory;
        this.author = author;
        this.press = press;
        this.salaNum = salaNum;
        this.customeScore = customeScore;
        this.category = category;
    }

    public Product() {
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDangPrice() {
        return dangPrice;
    }

    public void setDangPrice(Double dangPrice) {
        this.dangPrice = dangPrice;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Integer getSalaNum() {
        return salaNum;
    }

    public void setSalaNum(Integer salaNum) {
        this.salaNum = salaNum;
    }

    public Double getCustomeScore() {
        return customeScore;
    }

    public void setCustomeScore(Double customeScore) {
        this.customeScore = customeScore;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", productImage='" + productImage + '\'' +
                ", price=" + price +
                ", dangPrice=" + dangPrice +
                ", inventory=" + inventory +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", salaNum=" + salaNum +
                ", customeScore=" + customeScore +
                ", category=" + category +
                '}';
    }
}
