# Aop
## aopalliance(AOP联盟)
> spring 自 1.2-rc1 版本 正式把 AOP 联盟规范的接口，放进 spring 工程里面。
> 该规范为 AOP 抽象了两个概念 Advice (通知) 和 Joinpoint (连接点)
        
## Joinpoint (连接点)
> 程序执行的某个特定位置（如：某个方法调用前、调用后，方法抛出异常后）。一个类或一段程序代码拥有一些具有边界性质的特定点，这些代码中的特定点就是连接点。Spring仅支持方法的连接点。
+ static joinpoint (静态连接点)
    + method
    + field
    + constructor
+ runtime joinpoint (运行时连接点)
    + MethodInvocation (调用方法)
    + FieldAccess (访问字段)
    + ConstructorInvocation (调用构造)
        
## Pointcut (切点，一组符合某种共性的 Joinpoint) 
> 如果连接点相当于数据中的记录，那么切点相当于查询条件，一个切点可以匹配多个连接点。Spring AOP的规则解析引擎负责解析切点所设定的查询条件，找到对应的连接点。
+ Joinpoint AB
+ Joinpoint AC
+ Joinpoint AD

## Advice (增强)
> 增强是织入到目标类连接点上的一段程序代码。
> Spring提供的增强接口都是带方位名的，如：BeforeAdvice、AfterReturningAdvice、ThrowsAdvice等。
> Advice在国内的很多书面资料中都被翻译成”通知”，但是很显然这个翻译无法表达其本质，有少量的读物上将这个词翻译为”增强”，这个翻译是对Advice较为准确的诠释。
- BeforeAdvice（前置增强）
- AfterAdvice（后置增强）
    + AfterReturningAdvice（返回后增强）
    + ThrowsAdvice （抛异常时增强）
- Interceptor (包围型增强)
    + MethodInterceptor (方法拦截器)
    + ConstructorInterceptor (构造拦截器)
    + FieldInterceptor (字段拦截器)

## Introduction（引入）
> 引入是一种特殊的增强，即为目标了引入一个要实现的接口，从而为类添加一些属性和方法。

## Aspect（切面）
> 切面是由切点和增强（引介）组成的，它包括了对横切关注功能的定义，也包括了对连接点的定义。

## Weaving（织入）
> 织入是将增强添加到目标类具体连接点上的过程.
- 编译期织入：需要特殊的Java编译期（例如AspectJ的ajc）
- 装载期织入：要求使用特殊的类加载器，在装载类的时候对类进行增强
- 运行时织入：在运行时为目标类生成代理实现增强。
Spring采用了动态代理的方式实现了运行时织入，而AspectJ采用了编译期织入和装载期织入的方式。
