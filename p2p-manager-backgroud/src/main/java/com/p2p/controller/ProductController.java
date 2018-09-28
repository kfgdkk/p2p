package com.p2p.controller;

import com.p2p.service.ProductService;
import com.p2p.util.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/9/28 0028.
 */
@Controller
public class ProductController {
    @Resource
    ProductService productService;
    @RequestMapping("/product/findAllProduct")
    @ResponseBody
    public Response selectAllProduct() {
        return productService.selectAllProduct();
    }
}
