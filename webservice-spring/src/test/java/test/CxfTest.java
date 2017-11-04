package test;

import javax.annotation.Resource;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

import service.MyService;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations= {"classpath:spring-cxf-service.xml"})
public class CxfTest {
	
	@Resource
	private MyService myService ;
	
	//客户端实现方式一
	@Test
	public void testXml() {
		String res = myService.testMethod();
		System.out.println(res);
	}
	//客户端实现方式二
	@Test
	public void testName() throws Exception {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(MyService.class);
		factory.setAddress("http://localhost:8080/webservice-spring/webservice/testService?wsdl");
		MyService ms = (MyService) factory.create();
		String res = ms.testMethod();
		System.out.println(res);
	}
	
}
