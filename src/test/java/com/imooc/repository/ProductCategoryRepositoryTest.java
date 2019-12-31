package com.imooc.repository;


import com.imooc.dataobject.ProductCategory;
import com.imooc.SellApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SellApplication.class)
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }
    @Test
    @Transactional
    //在service里这个注解代表如果有异常就会回滚，在测试里就是运行完之后直接回滚
    public void saveTest(){


        ProductCategory productCategory = new ProductCategory("男生最爱",4);

        ProductCategory result = repository.save(productCategory);

        Assert.assertNotNull(result);
        //Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result =repository.findByCategoryTypeIn(list);

        Assert.assertNotEquals(0,result.size());
    }


}
