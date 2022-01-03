/**
 * 
 */
package com.jmuscles.async.consumer.customization.demo;

import org.springframework.stereotype.Component;

import com.jmuscles.processing.executor.ExecutorRegistry;
import com.jmuscles.processing.executor.SelfRegisteredExecutor;
import com.jmuscles.processing.schema.requestdata.RequestData;

/**
 * @author Manish Goel
 *
 */
@Component
public class CustomizedExecutor extends SelfRegisteredExecutor {

	public CustomizedExecutor(ExecutorRegistry executorRegistry) {
		super(executorRegistry);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RequestData execute(RequestData requestData) {
		CustomizedRequestData data = (CustomizedRequestData) requestData;

		if (data.getAttribute1().equals("success")) {
			return null;
		} else {
			return requestData;
		}
	}

	@Override
	public Class<?> getExecutorRequestDataClass() {
		return CustomizedRequestData.class;
	}

}
