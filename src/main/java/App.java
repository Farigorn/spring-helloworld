import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());
        HelloWorld beanTwo = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat cat = applicationContext.getBean("catBean", Cat.class);
        Cat catTwo = applicationContext.getBean("catBean", Cat.class);
        System.out.println(bean == beanTwo);
        System.out.println(cat == catTwo);
    }
}