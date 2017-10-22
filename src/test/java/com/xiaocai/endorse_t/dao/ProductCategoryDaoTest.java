package com.xiaocai.endorse_t.dao;

import com.xiaocai.endorse_t.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    ProductCategoryDao dao;

    @Test
    public void findOneTest() {
        ProductCategory category = dao.findOne(1);
        System.out.println(category.toString());
    }

    @Test
    @Transactional // 事务处理不会真正的插入到数据库，仅用于测试
    public void saveTest() {
        ProductCategory category = dao.findOne(2);
//        ProductCategory category = new ProductCategory();
        category.setCategoryName("男生最爱");
        category.setCategoryType(12);
        dao.save(category);
    }


    @Test
    public void updateTest() {
        ProductCategory category = dao.findOne(2);

        category.setCategoryType(12);

        dao.save(category);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(10, 12);
        List<ProductCategory> datas = dao.findByCategoryTypeIn(list);

        for (ProductCategory data : datas) {
            System.out.println(data.getCategoryName());
            System.out.println(data);
        }


    }


}