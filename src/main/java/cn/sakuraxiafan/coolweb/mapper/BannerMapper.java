package cn.sakuraxiafan.coolweb.mapper;

import cn.sakuraxiafan.coolweb.entity.Banner;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BannerMapper {
    @Select("SELECT id, banner_url FROM home_banner;")
    @Results(id = "banner", value = {
            @Result(property = "id", column = "id", javaType = Integer.class),
            @Result(property = "bannerUrl", column = "banner_url", javaType = String.class)
    })
    List<Banner> selectBanners();

    @Select("SELECT banner_url FROM home_banner WHERE id = #{id};")
    @Results(id = "selectBannerUrl", value = {
            @Result(property = "bannerUrl", column = "banner_url", javaType = String.class)
    })
    String selectBannerUrl(Integer id);

    @Delete("DELETE FROM home_banner WHERE id = #{id};")
    int deleteBanner(Integer id);
}
