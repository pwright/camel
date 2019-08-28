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
 * The influxdb component allows you to interact with InfluxDB, a time series
 * database.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface InfluxDbEndpointBuilderFactory {


    /**
     * Builder for endpoint for the InfluxDB component.
     */
    public interface InfluxDbEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedInfluxDbEndpointBuilder advanced() {
            return (AdvancedInfluxDbEndpointBuilder) this;
        }
        /**
         * Define if this operation is a batch operation or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default InfluxDbEndpointBuilder batch(boolean batch) {
            doSetProperty("batch", batch);
            return this;
        }
        /**
         * Define if this operation is a batch operation or not.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default InfluxDbEndpointBuilder batch(String batch) {
            doSetProperty("batch", batch);
            return this;
        }
        /**
         * The name of the database where the time series will be stored.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default InfluxDbEndpointBuilder databaseName(String databaseName) {
            doSetProperty("databaseName", databaseName);
            return this;
        }
        /**
         * Define if this operation is an insert or a query.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default InfluxDbEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Define the query in case of operation query.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default InfluxDbEndpointBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * The string that defines the retention policy to the data created by
         * the endpoint.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default InfluxDbEndpointBuilder retentionPolicy(String retentionPolicy) {
            doSetProperty("retentionPolicy", retentionPolicy);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the InfluxDB component.
     */
    public interface AdvancedInfluxDbEndpointBuilder
            extends
                EndpointProducerBuilder {
        default InfluxDbEndpointBuilder basic() {
            return (InfluxDbEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedInfluxDbEndpointBuilder basicPropertyBinding(
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
        default AdvancedInfluxDbEndpointBuilder basicPropertyBinding(
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
        default AdvancedInfluxDbEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedInfluxDbEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * InfluxDB (camel-influxdb)
     * The influxdb component allows you to interact with InfluxDB, a time
     * series database.
     * 
     * Category: database
     * Available as of version: 2.18
     * Maven coordinates: org.apache.camel:camel-influxdb
     * 
     * Syntax: <code>influxdb:connectionBean</code>
     * 
     * Path parameter: connectionBean (required)
     * Connection to the influx database, of class InfluxDB.class
     */
    default InfluxDbEndpointBuilder influxDb(String path) {
        class InfluxDbEndpointBuilderImpl extends AbstractEndpointBuilder implements InfluxDbEndpointBuilder, AdvancedInfluxDbEndpointBuilder {
            public InfluxDbEndpointBuilderImpl(String path) {
                super("influxdb", path);
            }
        }
        return new InfluxDbEndpointBuilderImpl(path);
    }
}