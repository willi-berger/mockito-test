package at.wberger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import at.wberger.service.IMyService;

@Component
public class AutoWiredServiceClient {
	@Autowired
	IMyService myService;
	
	public int useMyService(int a, int b) {
		return myService.add(a, b);
	}
}
