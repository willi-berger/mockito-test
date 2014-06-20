package at.wberger;

import static org.mockito.Mockito.*;
import junit.framework.TestCase;
import at.wberger.service.IMyService;
import at.wberger.service.impl.MyServiceImpl;

public class ServiceClientTest extends TestCase {

	public void testA() throws Exception {
		IMyService myServiceMock = mock(MyServiceImpl.class);

		ServiceClient serviceClient = new ServiceClient(myServiceMock);

		when(myServiceMock.add(1, 2)).thenReturn(3);

		assertEquals(3, serviceClient.useService(1, 2));
		assertEquals(0, serviceClient.useService(1, 3));
	}

}
