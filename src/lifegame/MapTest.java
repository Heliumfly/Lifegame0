package lifegame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MapTest {

	private static Map map=new Map();
	private static Cell [][]cell=new Cell[16][16];
	@SuppressWarnings("static-access")
	@Before
	public void setUp() throws Exception {
	   
		cell=map.initial();
	}

	@SuppressWarnings("static-access")
	@Test
	public void testUpdate() {
		boolean flag=true;
		//Cell [][]cell=new Cell[16][16];
		Cell [][]cell2=new Cell[16][16];
    	//cell=map.initial();
    	cell2=map.getLiving(cell);
    	cell2=map.update(cell2);
    	
    	for(int i=0;i<16;i++) {
    		for(int j=0;j<16;j++) {
    			if((cell[i][j].getLiving()>3||cell[i][j].getLiving()<2)&&cell2[i][j].getStatus()!=0) 
    				flag=false;
    			else if(cell[i][j].getLiving()==3&&cell2[i][j].getStatus()!=1) 
    				flag=false;
    			else if(cell[i][j].getLiving()==2&&cell2[i][j].getStatus()!=cell[i][j].getStatus())
    				flag=false;
    		}
    	}
    	assertEquals(true,flag);
    	//cell=map.update(cell);
		//cell2=map.getLiving(cell);
    	
		
	}

}
