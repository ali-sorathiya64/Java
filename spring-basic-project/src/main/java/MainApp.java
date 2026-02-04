import com.example.config.AppConfig;
import com.example.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       UserController userController =  context.getBean(UserController.class);

       userController.createUser("Ali sorathiya");
       userController.ListUser();
    }
}
