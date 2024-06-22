package cn.sakuraxiafan.coolweb.service.impl;

import cn.sakuraxiafan.coolweb.entity.Banner;
import cn.sakuraxiafan.coolweb.mapper.BannerMapper;
import cn.sakuraxiafan.coolweb.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerMapper bannerMapper;


    @Override
    public List<Banner> selectBanners() {
        return bannerMapper.selectBanners();
    }

    @Override
    public String selectBannerUrl(Integer id) {
        return bannerMapper.selectBannerUrl(id);
    }

    @Override
    public int deleteBanner(Integer id) {
        return bannerMapper.deleteBanner(id);
    }
}
