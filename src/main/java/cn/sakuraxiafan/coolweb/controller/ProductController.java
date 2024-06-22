package cn.sakuraxiafan.coolweb.controller;

import cn.sakuraxiafan.coolweb.entity.Product;
import cn.sakuraxiafan.coolweb.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductServiceImpl productService;

    @GetMapping("/product/select")
    List<Product> selectProducts() {
        return  productService.selectProducts();
    }

    @GetMapping("/product/select/id")
    Product selectById(Integer id) {
        return productService.selectById(id);
    }

    @RequestMapping("/product/delete/id")
    int deleteProduct(Integer id) {
        return  productService.deleteProduct(id);
    }
}
