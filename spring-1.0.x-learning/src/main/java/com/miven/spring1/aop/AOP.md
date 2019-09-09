# Aop
## aopalliance(AOP联盟)
> spring 自 1.2-rc1 版本 正式把 AOP 联盟规范的接口，放进 spring 工程里面。
> 该规范为 AOP 抽象了两个概念 Advice (通知) 和 Joinpoint (连接点)
- Advice (通知)
    + Interceptor (拦截器)
        + MethodInterceptor (方法拦截器)
        + ConstructorInterceptor (构造拦截器)
        + FieldInterceptor (字段拦截器)
        
- Joinpoint (连接点)
    + static joinpoint (静态连接点)
        + method
        + field
        + constructor
    + runtime joinpoint (运行时连接点)
        + MethodInvocation (调用方法)
        + FieldAccess (访问字段)
        + ConstructorInvocation (调用构造)
        
- Pointcut (切点，一组符合某种共性的 Joinpoint) 
    + Joinpoint AB
    + Joinpoint AC
    + Joinpoint AD
 