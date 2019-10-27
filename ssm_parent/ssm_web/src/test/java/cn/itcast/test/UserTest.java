package cn.itcast.test;


import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {

    @Test
    public void test() {
        UserService service = new UserServiceImpl();
        User byId = service.findById(1);
        System.out.println(byId);
    }
}
