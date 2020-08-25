package co.il.sanevich.pointcutdynamic;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class MyDynamicPointcut extends DynamicMethodMatcherPointcut {
    @Value("${package-target}")
    private String targetPackage;

    @Override
    public boolean matches(Method method, Class<?> targetClass, Object[] args) {
        return targetClass.getPackage().getName().contains("." + targetPackage);
    }

    @Override
    public ClassFilter getClassFilter() {
        return clazz -> {
            Package aPackage = clazz.getPackage();
            return aPackage.getName().startsWith("co.il");
        };
    }
}
