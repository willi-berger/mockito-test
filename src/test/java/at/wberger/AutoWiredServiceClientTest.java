package at.wberger;


import javax.annotation.Resource;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import at.wberger.service.IMyService;

import static org.mockito.Mockito.*;

public class AutoWiredServiceClientTest extends TestCase {

	@Mock
	IMyService myServiceMock;

	@InjectMocks
	@Resource
	private AutoWiredServiceClient uut;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testA() throws Exception {

		when(myServiceMock.add(anyInt(), anyInt())).thenReturn(222);

		assertEquals(222, uut.useMyService(1, 2));
		assertEquals(222, uut.useMyService(10, 30));
	}

}
