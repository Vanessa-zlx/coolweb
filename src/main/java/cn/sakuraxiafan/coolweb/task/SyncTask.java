package cn.sakuraxiafan.coolweb.task;

import cn.sakuraxiafan.coolweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SyncTask {

    @Autowired
    private PostService postService;

    @Scheduled(cron = "0/30 * * * * ?") // 每分钟执行一次
    public void syncViewCounts() {
        postService.syncViewCountsToDatabase();
//        System.out.println("cron task");
    }
}
