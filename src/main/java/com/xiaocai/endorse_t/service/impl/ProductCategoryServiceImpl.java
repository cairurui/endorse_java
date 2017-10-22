package com.xiaocai.endorse_t.service.impl;

import com.xiaocai.endorse_t.dao.ProductCategoryDao;
import com.xiaocai.endorse_t.dataobject.ProductCategory;
import com.xiaocai.endorse_t.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryDao dao;

    @Override
    public ProductCategory findOne(Integer categoryID) {
        return dao.findOne(categoryID);
    }

    @Override
    public List<ProductCategory> findAll() {
        return dao.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return dao.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return dao.save(productCategory);
    }
}
