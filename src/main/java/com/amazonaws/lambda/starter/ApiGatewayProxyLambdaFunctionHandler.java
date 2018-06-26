package com.amazonaws.lambda.starter;

import com.amazonaws.apigateway.model.ApiGatewayProxyInput;
import com.amazonaws.apigateway.model.ApiGatewayProxyOutput;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public interface ApiGatewayProxyLambdaFunctionHandler extends RequestHandler<ApiGatewayProxyInput, ApiGatewayProxyOutput> {
}
