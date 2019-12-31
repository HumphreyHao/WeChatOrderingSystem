package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/*
 * @Description 类目表
 * @Param 
 * @return 注意类名和表名要统一，类名是camel命名法，表名是下划线
 **/
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory(String categoryName,Integer categoryType) {
        this.categoryName  =categoryName;
        this.categoryType =categoryType;
    }

    public ProductCategory() {
    }
}
