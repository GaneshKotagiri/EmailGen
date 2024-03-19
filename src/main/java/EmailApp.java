import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Arrays;

public class EmailApp {
    public static void main(String[]args){
        try(var context=new AnnotationConfigApplicationContext(EmailConfig.class)){
            System.out.println(context.getBean(EmailConfig.class));
        }
    }
}
