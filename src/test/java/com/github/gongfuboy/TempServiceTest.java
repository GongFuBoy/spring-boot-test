package com.github.gongfuboy;

import com.github.gongfuboy.service.TempService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ZhouLiMing on 2018/7/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootTestApplication.class)
public class TempServiceTest {

    @Autowired
    private TempService tempService;

    @Test
    public void test() {
//        tempService.testPrint();
        String[] split = "".split(",");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + split.length);
    }

}
