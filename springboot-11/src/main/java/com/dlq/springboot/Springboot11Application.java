package com.dlq.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Springboot11Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot11Application.class, args);
    }

}
    //准备环境
//    ConfigurableEnvironment environment = prepareEnvironment(listeners,
//            applicationArguments);
//    //创建环境完成后回调SpringApplicationRunListener.environmentPrepared()；表示环境准备完成
//
//    Banner printedBanner = printBanner(environment);
//
//      //创建ApplicationContext；决定创建web的ioc还是普通的ioc
//      context = createApplicationContext();
//
//              analyzers = new FailureAnalyzers(context);
//              //准备上下文环境;将environment保存到ioc中；而且applyInitializers()；
//              //applyInitializers()：回调之前保存的所有的ApplicationContextInitializer的initialize方法
//              //回调所有的SpringApplicationRunListener的contextPrepared()；
//              //
//              prepareContext(context, environment, listeners, applicationArguments,
//              printedBanner);
//              //prepareContext运行完成以后回调所有的SpringApplicationRunListener的contextLoaded（）；
//
//              //刷新容器；ioc容器初始化（如果是web应用还会创建嵌入式的Tomcat）；Spring注解版
//              //扫描，创建，加载所有组件的地方；（配置类，组件，自动配置）
//              refreshContext(context);
//              //从ioc容器中获取所有的ApplicationRunner和CommandLineRunner进行回调
//              //ApplicationRunner先回调，CommandLineRunner再回调
//              afterRefresh(context, applicationArguments);
//              //所有的SpringApplicationRunListener回调finished方法
//              listeners.finished(context, null);
//              stopWatch.stop();
//              if (this.logStartupInfo) {
//              new StartupInfoLogger(this.mainApplicationClass)
//              .logStarted(getApplicationLog(), stopWatch);
//              }
//              //整个SpringBoot应用启动完成以后返回启动的ioc容器；
//              return context;
//              }
//              catch (Throwable ex) {
//              handleRunFailure(context, listeners, analyzers, ex);
//              throw new IllegalStateException(ex);
//              }
//              }
