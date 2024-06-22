package cn.sakuraxiafan.coolweb.controller;

import cn.sakuraxiafan.coolweb.entity.Banner;
import cn.sakuraxiafan.coolweb.service.impl.BannerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;

@RestController
public class BannerController {
    @Autowired
    private BannerServiceImpl bannerService;
    @Value("C:\\Users\\yushu\\Pictures\\acg\\")
    private String dirPath;
    @RequestMapping("/banner/select")
    public List<Banner> selectBanners() {
        return bannerService.selectBanners();
    }

    @RequestMapping("/banner/delete")
    public int deleteBannerById(Integer id) {
        String url = bannerService.selectBannerUrl(id);
        String file = dirPath + url;
        new File(file).delete();
        return bannerService.deleteBanner(id);
    }
}
