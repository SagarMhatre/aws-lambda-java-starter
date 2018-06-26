package com.amazonaws.lambda.starter;

import org.apache.http.HttpStatus;

import com.amazonaws.apigateway.model.ApiGatewayProxyInput;
import com.amazonaws.apigateway.model.ApiGatewayProxyOutput;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class ApiGatewayProxyLambdaEcho implements ApiGatewayProxyLambdaFunctionHandler {

	@Override
	public ApiGatewayProxyOutput handleRequest(ApiGatewayProxyInput input, Context context) {
		LambdaLogger lambdaLogger = context.getLogger();
		lambdaLogger.log("Input: " + input);

		/*
		ApiGatewayProxyOutput output = new ApiGatewayProxyOutput();
		output.setBody(input.getBody()); output.setHeaders(input.getHeaders());
		output.setStatusCode(HttpStatus.SC_OK);
		
		return output;
		 */

		return (new ApiGatewayProxyOutput()).withBody(input.getBody()).withHeaders(input.getHeaders())
				.withStatusCode(HttpStatus.SC_OK);
	}
}
