package dependency;

import com.Iocwithxml.Laptop;
import map.dependencyinjection.Kit;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {

        BeanFactory b1 =  new XmlBeanFactory(new ClassPathResource("dependencyinjection.xml"));
        Library l11 = (Library) b1.getBean("bean_id11");
        System.out.println(l11);

        ApplicationContext context = new ClassPathXmlApplicationContext("dependencyinjection.xml");
        Library l44 = (Library) context.getBean("bean_id11");
        System.out.println(l44);


        ApplicationContext context1t = new ClassPathXmlApplicationContext("List_dependency.xml");
        Library1 l45 = (Library1) context1t.getBean("lib");
        System.out.println(l45);

        ApplicationContext context2 = new ClassPathXmlApplicationContext("map_kit.xml");
        Kit l456 = (Kit) context2.getBean("Kit_id");
        System.out.println(l456);
    }
}
