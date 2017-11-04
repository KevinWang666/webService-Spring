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
	
	//�ͻ���ʵ�ַ�ʽһ
	@Test
	public void testXml() {
		String res = myService.testMethod();
		System.out.println(res);
	}
	//�ͻ���ʵ�ַ�ʽ��
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
