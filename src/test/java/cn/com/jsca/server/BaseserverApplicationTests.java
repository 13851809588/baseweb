package cn.com.jsca.server;

import com.bea.server.BaseserverApplication;
import com.bea.server.modules.system.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BaseserverApplication.class)
public class BaseserverApplicationTests {

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() {
		userService.find(null);
	}

}
