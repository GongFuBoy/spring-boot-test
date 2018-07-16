package com.github.gongfuboy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootTestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootTestApplicationTests {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private TestContext testContext;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test() {
//        testRestTemplate.getForObject("" , String.class, "");
        System.out.println(testContext.getApplicationContext());
    }

}
