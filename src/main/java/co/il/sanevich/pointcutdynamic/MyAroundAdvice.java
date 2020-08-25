package co.il.sanevich.pointcutdynamic;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class MyAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Intercepted  "+ invocation.getMethod().getDeclaringClass().getPackage().getName() + "." + invocation.getMethod().getName());

        return invocation.proceed();
    }
}
