package com.welab.k8s_api_gateway.security.jwt.authentication;

import lombok.Getter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Getter
public class JwtAuthentication extends AbstractAuthenticationToken {
    private final String userId;
    private final UserPrinciple principle;

    public JwtAuthentication(UserPrinciple principle, String userId,
                             Collection<?extends GrantedAuthority> authorities) {
        super(authorities);
        this.principle = principle;
        this.userId = userId;
        this.setDetails(principle);
        setAuthenticated(true);
    }

    @Override
    public boolean isAuthenticated() {
        return true;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}
