import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.apache.commons.beanutils.BeanComparator;
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean2 = (Cat) applicationContext.getBean("cat");
        Cat bean3 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.equals(bean1));
        System.out.println(bean2.equals(bean3));

      /*  BeanComparator comparator = new BeanComparator("helloworld");
        System.out.println(comparator.compare(bean,bean1));
        BeanComparator comparator1 = new BeanComparator("cat");
        System.out.println(comparator1.compare(bean2,bean3));*/





    }
}