import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

public class EmailApp {
    public static void main(String[]args){
        try(var context=new AnnotationConfigApplicationContext(EmailConfig.class)){
            //Arrays.stream( context.getBeanDefinitionNames()).forEach(System.out::println   );
            System.out.println(context.getBean(EmailConfig.class));
        }
    }
}
