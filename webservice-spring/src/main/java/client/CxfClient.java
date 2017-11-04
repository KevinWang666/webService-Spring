package client;
//ģ����÷���
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import service.MyService;

public class CxfClient {

	public static void main(String[] args) {
		//ͨ��JaxWsProxyFactoryBean���������趨��������ͷ����ַ���������Ŀͻ�������,�������ñȽ����.
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		//�ӿ�  ��  ��ַ
		factory.setServiceClass(MyService.class);
		factory.setAddress("http://localhost:8080/webservice-spring/webservice/testService?wsdl");
		System.out.println("==============================================================");
		MyService ms = (MyService) factory.create();
		System.out.println("==============================================================");
		System.out.println(ms.testMethod());
		System.out.println("==============================================================");
	}

}
