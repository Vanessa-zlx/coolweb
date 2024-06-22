package cn.sakuraxiafan.coolweb.controller;


import cn.sakuraxiafan.coolweb.entity.User;
import cn.sakuraxiafan.coolweb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class UploadUrlController {

    @Autowired
    UserMapper userMapper;
    @Value("${dirPath}")
    private String dirPath;
    @RequestMapping("/upload/avatar")
    public String upload(MultipartFile picFile, HttpSession session) throws IOException {
        String filename = picFile.getOriginalFilename();        /*获得图片后缀名，会从最后一个.里面去截后缀*/
        String suffx = filename.substring(filename.lastIndexOf("."));       /*再拼接一个.*/
        filename = UUID.randomUUID() + suffx;
        /*随机生成一个名字，UUID.randomUUID()唯一一个标识符*/
        User user = (User) session.getAttribute("user");
        String userLogin = user.getName();
        userMapper.updateUrl(filename, userLogin);
        File dirfile = new File(dirPath);
        if(!dirfile.exists()){
            dirfile.mkdir();    /*如果files文件夹不存在，就创造一个*/
        }
        String filepath = dirPath + "/" + filename;     /*得到完整的文件路径*/
        picFile.transferTo(new File(filepath));     /*将文件保存在文件夹里面*/
        return filename;
    }

}
