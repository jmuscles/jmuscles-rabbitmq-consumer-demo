/**
 * 
 */
package com.jmuscles.async.consumer.customized.validator;

import com.jmuscles.processing.execvalidator.RestValidator;
import com.jmuscles.processing.schema.requestdata.RequestData;

/**
 * @author Manish Goel
 *
 */
public class CustomizedRestValidator extends RestValidator {

	@Override
	public boolean validateRequest(RequestData requestData, Object config) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateResponse(RequestData requestData, Object response, Object config) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Class<?> responseEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
