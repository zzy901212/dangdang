package com.zzy;


import com.zzy.entity.User;
import com.zzy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class TestDao {
	@Autowired
	private UserService userService;
	@Test
	public void test1() {
		User user = userService.queryUserById("1");
		System.out.println(user);
	}

}
