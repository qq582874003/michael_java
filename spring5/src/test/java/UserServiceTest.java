import com.michael.aopanno.User;
import com.michael.aopxml.Book;
import com.michael.config.SpringConfig;
import com.michael.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc
 *
 * @author wangc 2021-10-05
 * @since 1.0.0
 */
public class UserServiceTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();

    }

    @Test
    public void test2(){
        ApplicationContext context  = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    /**
     * 测试AOP切入
     */
    @Test
    public void aopAnnoTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_aopanno.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    /**
     * 测试AOP xml切入
     */
    @Test
    public void aopXmlTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_aopxml.xml");
        Book user = context.getBean("book", Book.class);
        user.add();
    }
}
