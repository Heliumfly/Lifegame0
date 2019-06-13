package lifegame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MapTest1 {

	private static Map map=new Map();
	private Cell[][] cell=new Cell[16][16];
	
	@SuppressWarnings("static-access")
	@Before
	public void setUp() throws Exception {
		cell=map.initial();
	}

	@SuppressWarnings("static-access")
	@Test
	public void testGetLiving() {//±ﬂΩÁ÷µ≤‚ ‘
		for(int i=0;i<16;i++) {
    		for(int j=0;j<16;j++){
    			cell[i][j].setStatus(1);
		}
	}
		boolean flag=false;
		cell=map.getLiving(cell);
		for(int i=1;i<15;i++) {
    		for(int j=1;j<15;j++){
    			if(cell[i][j].getLiving()==8)
    				flag=true;
		}
	}
		for(int i=1;i<15;i++)
			if(cell[1][i].getLiving()==5)
				flag=true;
			else
				flag=false;
		for(int i=1;i<15;i++)
			if(cell[15][i].getLiving()==5)
				flag=true;
			else
				flag=false;
		for(int i=1;i<15;i++)
			if(cell[i][0].getLiving()==5)
				flag=true;
			else
				flag=false;
		for(int i=1;i<15;i++)
			if(cell[i][15].getLiving()==5)
				flag=true;
			else
				flag=false;
		if(cell[0][0].getLiving()==3&&cell[15][15].getLiving()==3&&cell[0][15].getLiving()==3&&cell[15][0].getLiving()==3)
			flag=true;
		else
			flag=false;
		assertEquals(true,flag);
		
	}
}
