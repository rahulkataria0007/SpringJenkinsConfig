package com.example.SpringJenkinBuild;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

@SpringBootTest
class SpringJenkinBuildApplicationTests {

	@Test
	void contextLoads() {
		float square = 2 * 2;
                float rectangle = 2 * 2;
                Assert.assertEquals(square, rectangle);
	}

}
