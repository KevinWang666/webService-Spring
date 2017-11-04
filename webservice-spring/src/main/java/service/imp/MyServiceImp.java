package service.imp;

import javax.jws.WebService;

import service.MyService;

@WebService(endpointInterface="service.MyService")
public class MyServiceImp implements MyService {

	@Override
	public String testMethod() {
		return "2333333";
	}

}
