package cn.ken.mapper;

import cn.ken.App;
import cn.ken.entity.User;
import cn.ken.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserService userService;

    @Test
    public void test(){
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void testQueryPage(){
        List<User> users = userService.queryPage();
        for (User user : users) {
            System.out.println(user);
        }
    }

}