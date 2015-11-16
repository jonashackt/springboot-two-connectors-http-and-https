package de.jonashackt.springboot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import de.jonashackt.springboot.web.DemoController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TwoConnectorsHttpAndHttpsApplication.class)
@WebIntegrationTest
public class TwoConnectorsHttpAndHttpsApplicationTests {

    private RestTemplate restTemplate = new RestTemplate();
    
	@Test
	public void contextLoads() {
	    // Given
	    String url = "http://localhost:8095/hey";
	    
	    // When
	    ResponseEntity<String> answer = restTemplate.getForEntity(url, String.class);
	    
	    // Then
	    assertEquals(HttpStatus.OK, answer.getStatusCode());
	    assertEquals(DemoController.RESPONSE, answer.getBody());
	}

}
