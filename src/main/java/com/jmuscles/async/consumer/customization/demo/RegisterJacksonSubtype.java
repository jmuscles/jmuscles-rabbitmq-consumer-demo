/**
 * 
 */
package com.jmuscles.async.consumer.customization.demo;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.jmuscles.async.producer.util.PayloadObjectMapper;

/**
 * @author Manish Goel
 *
 */
@Component
public class RegisterJacksonSubtype {

	@PostConstruct
	public void postConstruct() {
		PayloadObjectMapper.getMapper()
				.registerSubtypes(new NamedType(CustomizedRequestData.class, "customized-request"));
	}

}
