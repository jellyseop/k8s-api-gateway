package com.welab.k8s_api_gateway.gateway.filter;

import com.welab.k8s_api_gateway.security.jwt.authentication.UserPrinciple;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.function.ServerRequest;

import java.util.function.Function;

public class AuthenticationHeaderFilterFunction {
    public static Function<ServerRequest, ServerRequest> addHeader() {
        return request -> {
            ServerRequest.Builder requestBuilder = ServerRequest.from(request);

            Object principle = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            if (principle instanceof UserPrinciple userPrinciple) {
                requestBuilder.header("X-Auth-UserId", userPrinciple.getUserId());
            }

            String remoteAddr = "70.1.23.15";
            requestBuilder.header("X-Client-Address", remoteAddr);

            String device = "WEB";
            requestBuilder.header("X-Client-Device", device);

            return requestBuilder.build();
        };
    }
}
