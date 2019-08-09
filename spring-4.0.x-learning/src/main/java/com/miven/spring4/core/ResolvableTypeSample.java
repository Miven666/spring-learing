package com.miven.spring4.core;

import com.miven.entity.Student;
import org.springframework.core.ResolvableType;

import java.lang.reflect.Type;
import java.util.HashMap;

/**
 * ResolvableType 是对 反射包下 Type 的一种增强，原生的 Type 只具备获取类型名的能力。
 * 新增获取父类型、泛型、接口
 *
 * @author mingzhi.xie
 * @date 2019/5/29.
 * @see ResolvableType
 * @see Type
 */
public class ResolvableTypeSample {

    private HashMap<String, Student> hashMap;

    public ResolvableTypeSample() {
        HashMap<String, Student> hashMap = new HashMap<>(16);
        hashMap.put("student", Student.builder().id(1L).name("张三").build());
        this.hashMap = hashMap;
    }

    public static void main(String[] args) throws NoSuchFieldException {
        ResolvableType resolvableType = ResolvableType.forField(ResolvableTypeSample.class.getDeclaredField("hashMap"));
        Type type = resolvableType.getType();
        System.out.println("type name: " + type.getTypeName());

        ResolvableType[] generics = resolvableType.getGenerics();
        for (ResolvableType generic : generics) {
            System.out.println("resolvable type generic: " + generic.getType().getTypeName());
        }
    }
}
