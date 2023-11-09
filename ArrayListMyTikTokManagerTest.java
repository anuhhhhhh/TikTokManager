package tiktokers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListMyTikTokManagerTest {

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
	public void anEmptyDirectoryHasNoRumpledEater()
	{
	MyTikTokManager dir = new ArrayListMyTikTokManager();
	dir.put("@nush", "Likes", "600");
	//dir.remove("@nush", "Likes", "600");
	assertNotNull(dir.get("@nush", "Likes"));
	}
	//throw NoSuchElementException("empty");
}
