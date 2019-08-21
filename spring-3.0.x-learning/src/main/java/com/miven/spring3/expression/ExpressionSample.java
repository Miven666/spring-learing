package com.miven.spring3.expression;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Arrays;

/**
 *  从Expression的文档注释中可以看到，spring表达式自spring3.0开始出现的
 *  同时，通过查询官方的blog(https://spring.io/blog/2008/12/08/spring-framework-3-0-0-m1-released)，验证了此结论
 * @author mingzhi.xie
 * @date 2019/8/21
 * @since 1.0
 * @see Expression
 */
public class ExpressionSample {

    private static ExpressionParser parser = new SpelExpressionParser();
    /**
     * 文字字符串表达式
     * 表达式字符串是由周围的单引号表示的字符串文字
     */
    private static String string = "'Hello world'";
    /**
     * 调用方法表达式
     */
    private static String callingMethod = "'Hello world'.concat('!')";
    /**
     * 访问属性
     */
    private static String accessingProperties = "'Hello world'.bytes";
    /**
     * 嵌套属性
     */
    private static String nestedProperties = "'Hello world'.bytes.length";
    /**
     * 构造函数
     */
    private static String constructor = "new String('Hello world').toUpperCase()";

    public static void main(String[] args) {
        System.out.println(parser.parseExpression(string).getValue());
        System.out.println(parser.parseExpression(callingMethod).getValue());
        byte[] bytes = (byte[]) parser.parseExpression(accessingProperties).getValue();
        System.out.println(Arrays.toString(bytes));
        System.out.println(parser.parseExpression(nestedProperties).getValue());
        System.out.println(parser.parseExpression(constructor).getValue());
    }
}
