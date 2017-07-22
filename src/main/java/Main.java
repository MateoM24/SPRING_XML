import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/*
 * Main class to start and test this Java application
 */
public class Main {

    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring-config.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.sayHello();

        ArrayList<String> arrayList = new ArrayList<String >();
        arrayList.add("kola");
        arrayList.add("woda");
        arrayList.add("mliko");
        System.out.println(arrayList);
        String[] strArray1 = new String[arrayList.size()];
        for (String s: strArray1){
            System.out.println(s);
        }
        String[] strArray2 = arrayList.toArray(strArray1);
        for (String s: strArray2){
            System.out.println(s);
        }
        System.out.println("strArray1 == strArray2 : "+(strArray1==strArray2));
    }
}