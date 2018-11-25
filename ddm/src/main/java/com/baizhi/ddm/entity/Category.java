package com.baizhi.ddm.entity;

public class Category {
    private Integer id;
    private Integer parentId;
    private String categoryName;
    private Integer count;
    private Integer categoryType;

    public Category(Integer id, Integer parentId, String categoryName, Integer count, Integer categoryType) {
        this.id = id;
        this.parentId = parentId;
        this.categoryName = categoryName;
        this.count = count;
        this.categoryType = categoryType;
    }

    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", categoryName='" + categoryName + '\'' +
                ", count=" + count +
                ", categoryType=" + categoryType +
                '}';
    }
}
