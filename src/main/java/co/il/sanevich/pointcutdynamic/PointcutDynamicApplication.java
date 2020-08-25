package co.il.sanevich.pointcutdynamic;

import co.il.sanevich.pointcutdynamic.service.Worker;
import co.il.sanevich.pointcutdynamic.service.one.ServiceOne;
import co.il.sanevich.pointcutdynamic.service.two.ServiceTwo;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PointcutDynamicApplication {

    public static void main(String[] args) {
        SpringApplication.run(PointcutDynamicApplication.class, args);
    }

    @Bean
    public CommandLineRunner clr(ServiceOne one, ServiceTwo two) {
        return (args) -> {
            one.doJob();
            two.doJob();
        };
    }

    @Bean("advisor")
    public DefaultPointcutAdvisor advisor(Pointcut myDynamicPointcut, Advice myAroundAdvice) {
        return new DefaultPointcutAdvisor(myDynamicPointcut, myAroundAdvice);
    }

    @Bean
    public ProxyFactoryBean pfb() {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setInterceptorNames("advisor");
        proxyFactoryBean.setTargetClass(Worker.class);
        return proxyFactoryBean;
    }


}
