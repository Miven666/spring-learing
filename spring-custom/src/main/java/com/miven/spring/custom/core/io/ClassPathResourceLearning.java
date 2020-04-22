package com.miven.spring.custom.core.io;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author mingzhi.xie
 * @date 2020/4/22
 * @since 1.0
 */
public class ClassPathResourceLearning {

    public static void main(String[] args) {
        try {
            // FileInputStream fis = new FileInputStream(new File("src/main/resources/test.text"));
            // System.out.println(fis);

            ClassPathResource cpr = new ClassPathResource("test.text");
            InputStream is = cpr.getInputStream();
            System.out.println("路径: " + cpr.getPath());
            InputStreamReader isr = new InputStreamReader(is);
            char[] chars = new char[1];
            StringBuffer sb = new StringBuffer();
            while (isr.read(chars) != -1) {
                sb.append(chars);
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
