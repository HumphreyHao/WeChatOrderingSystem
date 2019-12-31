package com.imooc.service.impl;

import com.imooc.SellApplication;
import com.imooc.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SellApplication.class)
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = categoryService.findAll();
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList =categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3,4));

    }

    @Test
    public void save() {
        ProductCategory productCategory =new ProductCategory("男士专享",10);
        ProductCategory result = categoryService.save(productCategory);

    }
}
