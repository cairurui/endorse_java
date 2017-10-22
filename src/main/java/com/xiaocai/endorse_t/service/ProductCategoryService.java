package com.xiaocai.endorse_t.service;

import com.xiaocai.endorse_t.dataobject.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    ProductCategory findOne(Integer categoryID);


    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
