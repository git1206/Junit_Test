package gid.aid;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DemoTest {
	Demo obj=new Demo();
	@Test
	public void testSum() {
		assertEquals(26,obj.sum(10,15));
	}


}
