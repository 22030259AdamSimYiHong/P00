import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class calculatorTESTT {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	       System.out.println("This is the testcase for HelloWorld");
	        String str1="This is the testcase for HelloWorld";
	        String str2="This is the testcase for HelloWorld";
	        assertEquals(str1, str2);
	}

}
