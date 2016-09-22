/*
 * Copyright 2016 Bjoern Bilger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jrestless.aws;

/**
 * API Gateway's context for a request.
 * <p>
 * It can be injected into resources via {@code @Context}.
 *
 * @author Bjoern Bilger
 *
 */
public interface GatewayRequestContext {
	String getAccountId();
	String getResourceId();
	String getStage();
	String getRequestId();
	GatewayIdentity getIdentity();
	String getResourcePath();
	String getHttpMethod();
	String getApiId();
}
