package com.xiaocai.endorse_t.service.impl;

import com.xiaocai.endorse_t.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Autowired
    ProductCategoryServiceImpl service;

    @Test
    public void findOne() throws Exception {
        ProductCategory category = service.findOne(1);

        System.out.println(category);

        Assert.assertEquals(new Integer(1), category.getCategoryId());

    }


    @Test
    public void findAll() throws Exception {

        List<ProductCategory> list = service.findAll();

        Assert.assertNotEquals(0, list.size());


    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> byCategoryTypeIn = service.findByCategoryTypeIn(Arrays.asList(10, 13));
        Assert.assertNotEquals(0, byCategoryTypeIn.size());

    }

    @Test
    @Transactional
    public void save() throws Exception {

        ProductCategory category = new ProductCategory();
        category.setCategoryName("排行榜");
        category.setCategoryType(16);

        ProductCategory productCategory = service.save(category);

        Assert.assertNotEquals(new Integer(0), productCategory.getCategoryId());

    }

}