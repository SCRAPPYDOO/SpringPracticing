package server.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.json.JSONArray;
import org.json.JSONObject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MessageControllerTest {
	
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void communicationTest() throws Exception {
    	this.restTemplate.getForObject("http://localhost:" + port + "/sendMessage?toWhoom=2&fromWho=1&message=Hello%World", String.class);
    	
    	JSONObject jsonm = new JSONObject();
    	String responseAsString = this.restTemplate.getForObject("http://localhost:" + port + "/getMessages?fromWho=1&toWhoom=2", String.class);
        JSONArray response = jsonm.optJSONArray(responseAsString);
        //Object json = (Object) response.get(0);
    	//assertThat((String)json.get("message")).contains("Hello%World");
        
        
    }
}
