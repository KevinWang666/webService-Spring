package client;
//模拟调用服务
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import service.MyService;

public class CxfClient {

	public static void main(String[] args) {
		//通过JaxWsProxyFactoryBean代理类来设定服务处理类和服务地址，无须额外的客户端配置,无须配置比较灵活.
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		//接口  ，  地址
		factory.setServiceClass(MyService.class);
		factory.setAddress("http://localhost:8080/webservice-spring/webservice/testService?wsdl");
		System.out.println("==============================================================");
		MyService ms = (MyService) factory.create();
		System.out.println("==============================================================");
		System.out.println(ms.testMethod());
		System.out.println("==============================================================");
	}

}
