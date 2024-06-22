package cn.sakuraxiafan.coolweb.service.impl;

import cn.sakuraxiafan.coolweb.service.UploadService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class UploadServiceImpl implements UploadService {
    @Value("${dirPath}")
    private String dirPath;
    @Override
    public String uploadImage(MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
//            String uploadPath = dirPath + fileName; // 上传目录
//            File dest = new File(uploadPath);
//            file.transferTo(dest); // 将文件保存到上传目录

            File dirfile = new File(dirPath);
            if(!dirfile.exists()){
                dirfile.mkdir();    /*如果files文件夹不存在，就创造一个*/
            }
            String filepath = dirPath + "/" + fileName;     /*得到完整的文件路径*/
            file.transferTo(new File(filepath));     /*将文件保存在文件夹里面*/

            return fileName;
        }
        return null;
    }
}
