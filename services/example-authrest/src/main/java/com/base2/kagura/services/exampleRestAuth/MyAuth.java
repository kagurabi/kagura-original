/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.base2.kagura.services.exampleRestAuth;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Map;

public interface MyAuth {

    @GET()
    @Path("/echo")
    public String echo(@QueryParam("message") @DefaultValue("No message= found.") String message);

    @GET()
    @Path("/users")
    public Object users();

    @GET()
    @Path("/groups")
    public Object groups();

    @POST()
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String login(Map<String,String> input);
}