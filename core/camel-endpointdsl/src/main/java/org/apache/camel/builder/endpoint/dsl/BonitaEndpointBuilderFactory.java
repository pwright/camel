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
 * Used for communicating with a remote Bonita BPM process engine.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface BonitaEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Bonita component.
     */
    public interface BonitaEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedBonitaEndpointBuilder advanced() {
            return (AdvancedBonitaEndpointBuilder) this;
        }
        /**
         * Hostname where Bonita engine runs.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default BonitaEndpointBuilder hostname(String hostname) {
            doSetProperty("hostname", hostname);
            return this;
        }
        /**
         * Port of the server hosting Bonita engine.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default BonitaEndpointBuilder port(String port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * Name of the process involved in the operation.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default BonitaEndpointBuilder processName(String processName) {
            doSetProperty("processName", processName);
            return this;
        }
        /**
         * Password to authenticate to Bonita engine.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default BonitaEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username to authenticate to Bonita engine.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default BonitaEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Bonita component.
     */
    public interface AdvancedBonitaEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default BonitaEndpointBuilder basic() {
            return (BonitaEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedBonitaEndpointBuilder basicPropertyBinding(
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
        default AdvancedBonitaEndpointBuilder basicPropertyBinding(
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
        default AdvancedBonitaEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedBonitaEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Bonita (camel-bonita)
     * Used for communicating with a remote Bonita BPM process engine.
     * 
     * Category: process
     * Available as of version: 2.19
     * Maven coordinates: org.apache.camel:camel-bonita
     * 
     * Syntax: <code>bonita:operation</code>
     * 
     * Path parameter: operation (required)
     * Operation to use
     * The value can be one of: startCase
     */
    default BonitaEndpointBuilder bonita(String path) {
        class BonitaEndpointBuilderImpl extends AbstractEndpointBuilder implements BonitaEndpointBuilder, AdvancedBonitaEndpointBuilder {
            public BonitaEndpointBuilderImpl(String path) {
                super("bonita", path);
            }
        }
        return new BonitaEndpointBuilderImpl(path);
    }
}