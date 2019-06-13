package lifegame;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CellTest {
	
	private static Cell cell=new Cell();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUpdateStatus() {
		cell.setLiving(1);
		cell.UpdateStatus();
		assertEquals(0,cell.getStatus());
		cell.setLiving(3);
		cell.UpdateStatus();
		assertEquals(1,cell.getStatus());
		cell.setLiving(4);
		cell.UpdateStatus();
		assertEquals(0,cell.getStatus());
		cell.setStatus(1);
		cell.setLiving(2);
		cell.UpdateStatus();
		assertEquals(1,cell.getStatus());

	}

}
