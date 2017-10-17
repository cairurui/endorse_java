package com.xiaocai.endorse_t;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j // 需要安装lombok插件
public class LoggerTest {

//    private final Logger log = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        log.debug("nongnong");
        log.info("nongnongnong");

        String name = "xiaocai";
        log.error("name: {}", name);

    }
}
