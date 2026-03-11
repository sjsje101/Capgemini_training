package com.Iocwithxml;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main(String[] args) {
        BeanFactory beanFactory1 = new XmlBeanFactory(new ClassPathResource("bean_configuration.xml"));
        Laptop l1 = (Laptop) beanFactory1.getBean("bean_id");
        System.out.println(l1);

        BeanFactory beanFactory2 = new XmlBeanFactory(new ClassPathResource("bean_configuration.xml"));
        Laptop l3 = (Laptop) beanFactory2.getBean("bean_id2");
        System.out.println(l3);


        ApplicationContext context = new ClassPathXmlApplicationContext("bean_configuration.xml");
        Laptop l4 = (Laptop) context.getBean("bean_id3");
        System.out.println(l4);



    }
}
