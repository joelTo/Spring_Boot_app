package org.test.devoxx;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;
import org.test.devoxx.DemoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebIntegrationTest(randomPort = true)
public class HomeControllerIntegrationTest {

	@Value("${local.server.port}")
	private int port;

	@Test
	public void runAndInvokeHome() {
		String url = "http://localhost:" + port + "/";
		String body = new RestTemplate().getForObject(url, String.class);
		assertThat(body, is("hello devoxx"));
	}

}
