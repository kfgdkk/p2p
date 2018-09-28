package com.p2p.service.impl;

import com.p2p.mapper.ProductMapper;
import com.p2p.pojo.Product;
import com.p2p.service.ProductService;
import com.p2p.util.Response;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/9/28 0028.
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Resource
    ProductMapper productMapper;
    @Override
    public Response selectAllProduct() {
        List<Product> products = productMapper.selectAllProduct();
        return    Response.build().setStatus("1").setData(products);
    }
}
