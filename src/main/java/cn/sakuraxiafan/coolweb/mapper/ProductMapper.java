package cn.sakuraxiafan.coolweb.mapper;

import cn.sakuraxiafan.coolweb.entity.Post;
import cn.sakuraxiafan.coolweb.entity.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Select("SELECT id, product_name, product_brief, product_price, product_cover, product_firm, product_brand FROM tech_product")

    List<Product> selectProducts();

    @Delete("DELETE FROM acg_product WHERE id = #{id}")
    int deleteProduct(Integer id);

    @Insert("INSERT INTO acg_product (product_name, product_brief, product_price, product_cover, product_ip, product_brand) " +
            "VALUES (#{productName}, #{productBrief}, #{productPrice}, #{productCover}, #{productIp}, #{prodcutBrand})")
    int insertProduct(Product product);

    @Select("SELECT id, product_name, product_brief, product_price, product_cover, product_ip, product_brand FROM acg_product WHERE id = #{id};")
    @ResultMap("productResultMap")
    Product selectById(Integer id);
}
