package com.atom.spring.boot.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Atom
 */
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {
    private String host;
    private Integer port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
