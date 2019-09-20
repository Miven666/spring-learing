package com.miven.spring31.web;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

/**
 *  默认的http请求拦截器
 * @author mingzhi.xie
 * @date 2019/8/22
 * @since 1.0
 */
public class DefaultClientHttpRequestInterceptor implements ClientHttpRequestInterceptor {

    private HttpHeaders headers;

    public boolean containsKey(Object key) {
        return headers.containsKey(key);
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        headers = request.getHeaders();
        return execution.execute(request, body);
    }
}
