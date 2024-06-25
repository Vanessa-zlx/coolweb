package cn.sakuraxiafan.coolweb.service;

import cn.sakuraxiafan.coolweb.entity.Post;
import cn.sakuraxiafan.coolweb.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> selectProducts();

    Product selectById(Integer id);

    int deleteProduct(Integer id);
    int insertProduct(Product product);
}
