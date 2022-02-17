package com.learning.oauth2passwordgrantdiffserverauthserver.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

@Data
@ConfigurationProperties(prefix = "security.jwt")
public class SecurityJwtProperties {
    
    private Resource keyStore;
    
    private String keyStorePassword;
    
    private String keyPairAlias;
    
    private String keyPairPassword;
}
