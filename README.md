# Spring

## 版本
|Version |Feature |
|---------|---------|
|Spring 2.5	发布于 2007 年。|这是第一个支持注解的版本。|
|Spring 3.0	发布于 2009 年。|它完全利用了 Java5 中的改进，并为 JEE6 提供了支持。|
|Spring 4.0	发布于 2013 年。|这是第一个完全支持 JAVA8 的版本。|

## 功能
- 轻量级：Spring 在代码量和透明度方面都很轻便。
- IOC：控制反转
- AOP：面向切面编程可以将应用业务逻辑和系统服务分离，以实现高内聚。
- 容器：Spring 负责创建和管理对象（Bean）的生命周期和配置。
- MVC：对 web 应用提供了高度可配置性，其他框架的集成也十分方便。
- 事务管理：提供了用于事务管理的通用抽象层。Spring 的事务支持也可用于容器较少的环境。
- JDBC 异常：Spring 的 JDBC 抽象层提供了一个异常层次结构，简化了错误处理策略。

## 模块
- Spring 核心容器
    + Spring Core
    + Spring Bean
    + SpEL (Spring Expression Language)
    + Spring Context
- AOP
    + Aspects：为与 AspectJ 的集成提供支持。
- 数据访问/集成
    + JDBC (Java DataBase Connectivity)
    + ORM (Object Relational Mapping)
    + OXM (Object XML Mappers)
    + JMS (Java Messaging Service)
    + Transaction
- Web
    + Web
    + Web – Servlet
    + Web – Socket
    + Web – Portlet
- Instrumentation：为类检测和类加载器实现提供支持。
- Messaging：为 STOMP 提供支持。它还支持注解编程模型，该模型用于从 WebSocket 客户端路由和处理 STOMP 消息。
- Test：为使用 JUnit 和 TestNG 进行测试提供支持。

## IOC
- 容器（通过读取可配置的元数据，然后进行对象的实例化、配置和组装。该元数据可以通过 XML、Java 注解或 Java 代码提供）
    + BeanFactory（BeanFactory 就像一个包含 bean 集合的工厂类。它会在客户端要求时实例化 bean。）
    + ApplicationContext（ApplicationContext 接口扩展了 BeanFactory 接口。它在 BeanFactory 基础上提供了一些额外的功能。）

|BeanFactory |ApplicationContext|
|--------------|---------------------|
|它使用懒加载 |它使用即时加载|
|它使用语法显式提供资源对象 |它自己创建和管理资源对象|
|它使用语法显式提供资源对象 |支持国际化|
|不支持国际化 |支持国际化|
|不支持基于依赖的注解 |支持基于依赖的注解|

## 生命周期
- bean
    + 实现 BeanNameAware 接口，则工厂通过传递 bean 的 ID 来调用 setBeanName()。
    + 实现 BeanFactoryAware 接口，则工厂通过传递自身的实例来调用 setBeanFactory()。
    + 存在关联的 BeanPostProcessors，则调用 preProcessBeforeInitialization() 方法。
    + 指定了 init-method 属性，将会被调用。
    + 存在关联的 BeanPostProcessors，则调用 postProcessAfterInitialization() 方法。
    + 实现 DisposableBean 接口，则 spring 容器关闭时，会调用 destroy()。
    + 指定了 destroy-method 属性，将会被调用。
## 注解
- @Repository（它为 DAO 提供了额外的好处，使未经检查的异常有资格转换为 Spring DataAccessException。）