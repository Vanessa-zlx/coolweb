package cn.sakuraxiafan.coolweb.service;

import cn.sakuraxiafan.coolweb.entity.Banner;

import java.util.List;

public interface BannerService {
    List<Banner> selectBanners();
    String selectBannerUrl(Integer id);

    int deleteBanner(Integer id);
}
