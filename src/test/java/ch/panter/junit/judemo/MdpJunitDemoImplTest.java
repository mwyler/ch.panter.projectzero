package ch.panter.junit.judemo;

import ch.panter.jmock.gettingstarted.MdpJunitDemoImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
public class MdpJunitDemoImplTest {
	private MdpJunitDemoImpl instance;
	
	// NEW methods w/ the annotation BeforeClass are executed
    // after executing all tests
    // Note: this method must be static
    @BeforeClass
    public static void beforeEverything() {
    }

    // NEW methods w/ the annotation AfterClass are executed
    // after executing all tests
    // Note: this method must be static
    @AfterClass
    public static void cleanUp() {
    }
	
	@Before
	public void init(){
		this.instance = new MdpJunitDemoImpl();
	}
	
	@After
	public void dispose(){
		instance = null;
	}
	
	@Test
	public void TestReverse(){
		assertEquals(instance.reverse("Ficken"),"nekciF");
	}
	
	@Test(expected=NullPointerException.class)
	public void TestReverseNPEX(){
		instance.reverse(null);
	}
	
	@Test
	public void TestJoin(){
		assertEquals(instance.join("a","b","c","d","e","f","g","h"), "abcdefgh");
	}
	
	@Test
	public void TestCapitalize() throws Exception{
		assertEquals(instance.capitalize("javaistdoof"), "Javaistdoof");
		assertEquals(instance.capitalize("JAVAistDOOF"), "Javaistdoof");
	}
	
	@Test
	public void TestIsEmpty(){
		assertEquals(instance.isEmpty(""),true);
		assertEquals(instance.isEmpty("blah"),false);
	}
	
	
}
