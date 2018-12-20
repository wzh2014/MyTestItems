import com.wzh.dao.IUserDao;
import com.wzh.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Callable;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月10日
 */
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private IUserDao dao;

    @Test
    public void testSelectUser() throws Exception {
        int id = 1;
        User user = dao.selectUser(id);
        System.out.println(user);

    }

    @Test
    public void testInsertUser() throws  Exception{
        User user = new User();
        user.setName("wzh4");
        dao.insertUser(user);
    }

    @Test
    public void testUpdateUser() throws  Exception{
        User user = new User();
        user.setId(2);
        user.setName("wzh");
        dao.updateUser(user);

    }

    @Test
    public void testDeleteUser() throws Exception {
        int id = 3;
        dao.deleteUser(id);


    }




}
