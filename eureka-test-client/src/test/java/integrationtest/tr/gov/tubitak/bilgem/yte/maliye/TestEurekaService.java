package integrationtest.tr.gov.tubitak.bilgem.yte.maliye;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import com.ozayduman.EurekaTestClientApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EurekaTestClientApplication.class)
@WebAppConfiguration
@IntegrationTest({ "server.port=8761" })
public class TestEurekaService {

	@Value("${local.server.port}")
	private int port;

	private RestTemplate template;

	@Before
	public void setUp() throws Exception {
		template = new TestRestTemplate();
	}

	@Test
	public void testHttp200SuccesfulControllerEndpoint() throws Exception {
		ResponseEntity<String> responseEntity = template.getForEntity("http://localhost:" + port + "/eureka/apps",
				String.class);
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
		assertTrue(responseEntity.getBody().contains("applications"));
	}

}
