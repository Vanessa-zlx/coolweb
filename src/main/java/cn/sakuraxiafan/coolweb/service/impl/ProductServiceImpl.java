package cn.sakuraxiafan.coolweb.service.impl;

import cn.sakuraxiafan.coolweb.entity.Product;
import cn.sakuraxiafan.coolweb.mapper.ProductMapper;
import cn.sakuraxiafan.coolweb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;
    @Override
    public List<Product> selectProducts() {
        return productMapper.selectProducts();
    }

    @Override
    public Product selectById(Integer id) {
        return productMapper.selectById(id);
    }

    @Override
    public int deleteProduct(Integer id) {
        return productMapper.deleteProduct(id);
    }
}
