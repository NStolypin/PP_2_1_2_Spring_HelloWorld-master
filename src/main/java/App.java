import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = applicationContext.getBean("helloworld", HelloWorld.class);

        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);

        System.out.println(bean == bean2);

        Cat cat = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat == cat2);

        applicationContext.close();
    }
}