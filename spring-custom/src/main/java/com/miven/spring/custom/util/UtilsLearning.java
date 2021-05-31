package com.miven.spring.custom.util;

import org.springframework.util.AntPathMatcher;
import org.springframework.util.ObjectUtils;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;
import java.util.Objects;

/**
 * @author mingzhi.xie
 * @since 2020/6/3 1.0
 * @see ObjectUtils
 */
public class UtilsLearning {

    public static void main(String[] args) {
        testObjectUtils();

        testPathMatcher();

        testUriComponents();
    }

    private static void testUriComponents() {
        String uri = "https://www.test.com/test/123.html";
        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(uri).build();
        String url = uri.replace(Objects.requireNonNull(uriComponents.getPath()), "");
        System.out.println(url);
    }

    private static void testPathMatcher() {
        AntPathMatcher matcher = new AntPathMatcher();
        Map<String, String> map = matcher.extractUriTemplateVariables("/test/{id}.html", "/test/123.html");
        System.out.println(map);
    }

    private static void testObjectUtils() {
        Object o = new Object();
        System.out.println(System.identityHashCode(o));
        System.out.println(o.hashCode());
        System.out.println("abc".hashCode());
        System.out.println("abc".hashCode());
        System.out.println(ObjectUtils.identityToString(UtilsLearning.class));
        System.out.println(ObjectUtils.getIdentityHexString(UtilsLearning.class));
    }
}
