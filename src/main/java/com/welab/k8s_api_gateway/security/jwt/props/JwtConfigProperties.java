package com.welab.k8s_api_gateway.security.jwt.props;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@ConfigurationProperties(value = "jwt")
@Getter @Setter
public class JwtConfigProperties {
    private String header;
    private String secretKey;
}
