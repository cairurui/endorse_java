package com.xiaocai.endorse_t.dao;

import com.xiaocai.endorse_t.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {

    @Autowired
    ProductInfoDao dao;

    @Test
    public void save() {
        ProductInfo info = new ProductInfo();
        info.setProductId(2);
        info.setProductStock(100);
        info.setProductName("农家小炒肉");
        info.setCategoryType(10);
        info.setProductDescription("农家小炒肉，由肉和青椒一起炒");
        info.setProductIcon("http://xxxx.jpg");
        info.setProductPrice(new BigDecimal(12.5));

        ProductInfo save = dao.save(info);

        Assert.assertNotEquals(null,save);

    }


}