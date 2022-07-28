package com.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConfigController {

	@Value("${environment:ENVDOESNOTEXIST}")
	String environment;
	
	@Value("${spring.application.name}")
	String appName;
	
	@Value("${ecr.datasource.password}")
	String ecrPassword;
	
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping("/getEnvironment/{version}")
	public String getEnvironement() {
		return String.format("Environement: %s and App name is %s ecrpass:%s \n",environment,appName,ecrPassword);
	}
	
	@GetMapping("/emailExists/{emailId}")
	public String emailExists(String emailId) {
		EmailAvailabilityRequest ear = new EmailAvailabilityRequest();
		ear.setEcrID("359971606757994270");
		ear.setEmailId(emailId);
		ear.setLabelID("casinodays");
		ear.setPartnerID("casinodays");
		ResponseEntity<BaseResponse> re = restTemplate.postForEntity("http://ecr-version-1/ecr-v1.0/UserProfileService/checkEmailAvailability"
				,ear, BaseResponse.class);
		BaseResponse be = re.getBody();
		return be.toString();
	}
}
