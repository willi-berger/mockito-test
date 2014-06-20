package at.wberger;

import at.wberger.service.IMyService;



public class ServiceClient {
	
	IMyService myService;
	public ServiceClient(IMyService myService) {
		this.myService = myService;
	}
	
	

	
	public int useService(int a, int b) {
		
		return myService.add(a, b);
		
	}

}
