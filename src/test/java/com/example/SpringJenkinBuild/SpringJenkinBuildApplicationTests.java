package com.example.SpringJenkinBuild;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

@SpringBootTest
class SpringJenkinBuildApplicationTests {

	@Test
	void contextLoads() {
		float square = 2 * 2;
                float rectangle = 2 * 2;
           assertEquals(square, rectangle);
	}

}
