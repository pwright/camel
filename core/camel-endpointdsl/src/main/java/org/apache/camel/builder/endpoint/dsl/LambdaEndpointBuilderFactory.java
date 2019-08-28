/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The aws-lambda is used for managing and invoking functions from Amazon
 * Lambda.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LambdaEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Lambda component.
     */
    public interface LambdaEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedLambdaEndpointBuilder advanced() {
            return (AdvancedLambdaEndpointBuilder) this;
        }
        /**
         * The operation to perform. It can be listFunctions, getFunction,
         * createFunction, deleteFunction or invokeFunction.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.lambda.LambdaOperations</code>
         * type.
         * 
         * Required: true
         * Group: producer
         */
        default LambdaEndpointBuilder operation(LambdaOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform. It can be listFunctions, getFunction,
         * createFunction, deleteFunction or invokeFunction.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.aws.lambda.LambdaOperations</code>
         * type.
         * 
         * Required: true
         * Group: producer
         */
        default LambdaEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Lambda client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default LambdaEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Lambda client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default LambdaEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Lambda client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: proxy
         */
        default LambdaEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default LambdaEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default LambdaEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Lambda component.
     */
    public interface AdvancedLambdaEndpointBuilder
            extends
                EndpointProducerBuilder {
        default LambdaEndpointBuilder basic() {
            return (LambdaEndpointBuilder) this;
        }
        /**
         * To use a existing configured AwsLambdaClient as client.
         * 
         * The option is a: <code>com.amazonaws.services.lambda.AWSLambda</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedLambdaEndpointBuilder awsLambdaClient(
                Object awsLambdaClient) {
            doSetProperty("awsLambdaClient", awsLambdaClient);
            return this;
        }
        /**
         * To use a existing configured AwsLambdaClient as client.
         * 
         * The option will be converted to a
         * <code>com.amazonaws.services.lambda.AWSLambda</code> type.
         * 
         * Group: advanced
         */
        default AdvancedLambdaEndpointBuilder awsLambdaClient(
                String awsLambdaClient) {
            doSetProperty("awsLambdaClient", awsLambdaClient);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedLambdaEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedLambdaEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedLambdaEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedLambdaEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws.lambda.LambdaOperations</code> enum.
     */
    enum LambdaOperations {
        listFunctions,
        getFunction,
        createFunction,
        deleteFunction,
        invokeFunction,
        updateFunction,
        createEventSourceMapping,
        deleteEventSourceMapping,
        listEventSourceMapping,
        listTags,
        tagResource,
        untagResource,
        publishVersion,
        listVersions;
    }
    /**
     * AWS Lambda (camel-aws-lambda)
     * The aws-lambda is used for managing and invoking functions from Amazon
     * Lambda.
     * 
     * Category: cloud,computing,serverless
     * Available as of version: 2.20
     * Maven coordinates: org.apache.camel:camel-aws-lambda
     * 
     * Syntax: <code>aws-lambda:function</code>
     * 
     * Path parameter: function (required)
     * Name of the Lambda function.
     */
    default LambdaEndpointBuilder lambda(String path) {
        class LambdaEndpointBuilderImpl extends AbstractEndpointBuilder implements LambdaEndpointBuilder, AdvancedLambdaEndpointBuilder {
            public LambdaEndpointBuilderImpl(String path) {
                super("aws-lambda", path);
            }
        }
        return new LambdaEndpointBuilderImpl(path);
    }
}