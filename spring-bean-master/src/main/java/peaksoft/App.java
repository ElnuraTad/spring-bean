package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        System.out.println(bean == bean1);

        Cat one = (Cat) applicationContext.getBean("cat");
        System.out.println(one.getVoice());

        Cat two = (Cat) applicationContext.getBean("cat");
        System.out.println(two.getVoice());


        System.out.println(one == two);

    }
}
