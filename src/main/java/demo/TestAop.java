package demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//测试类必须有这个，否则没有加载配置文件  
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestAop {
	@Resource
	private ILogon logon ;
	
	@Test
	public void testAop() {
		logon.productNote1();
	}
	
}
