package com.github.gongfuboy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "personal")
public class DoorsConvertImpl implements IConverter {
    private static final Logger logger = LoggerFactory.getLogger(DoorsConvertImpl.class);

    private String host;
    private String uri;
    private String httpMethod;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Override
    public void print() {
        System.out.println(host + uri + httpMethod);
    }
}
