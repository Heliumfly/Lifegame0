package lifegame;


import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("unused")
public class Control {
    public static void main(String []args) {
    	JFrame jframe=new JFrame();
    	jframe.setSize(425,460);
    	JPanel jpanel=new JPanel();
    	jpanel.setBounds(0,0,400,400);
    	int count=0;
    	Cell [][]cell=new Cell[16][16];
    	cell=Map.initial();
    	cell=Map.getLiving(cell);
    	jframe.setTitle("这是第"+count+"次演化");
    	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	jframe.setLocationRelativeTo(null);
    	jframe.add(jpanel);
    	jframe.setVisible(true);
    
    	Graphics g=jpanel.getGraphics();
    	for(int i=0;i<16;i++) {
    		for(int j=0;j<16;j++) {
    			g.drawRect(i*25, j*25, 25, 25);
    		}
    	}
    	for(int i=0;i<16;i++) {
    		for(int j=0;j<16;j++) {
    			if(cell[i][j].getStatus()==1) {
    				g.fillRect(i*25, j*25, 25, 25);
    			}
    			else {
    				g.drawRect(i*25, j*25, 25, 25);
    			}
    		}
    	}
    	long d1= System.currentTimeMillis();
    	while(true) {
    		long d2= System.currentTimeMillis();
    		if(d2-d1>200) {
    			d1=d2;
    			jframe.repaint();
    			cell=Map.update(cell);
    			cell=Map.getLiving(cell);
    			for(int i=0;i<16;i++) {
    	    		for(int j=0;j<16;j++) {
    	    			g.drawRect(i*25, j*25, 25, 25);
    	    		}
    	    	}
    			for(int i=0;i<16;i++) {
    				for(int j=0;j<16;j++) {
    					if(cell[i][j].getStatus()==1) {
    	    				g.fillRect(i*25, j*25, 25, 25);
    	    			}
    	    			else {
    	    				g.drawRect(i*25, j*25, 25, 25);
    				    }
    				}
    			}
    		    count++;
    		    jframe.setTitle("这是第"+count+"次演化");
    			
    	}
		
}
    	//Map.printMap(cell);
    	//Scanner sc=new Scanner(System.in);
    	//while(true) {
    		//System.out.println("输入演化次数，输入0退出！");
        	//int i=sc.nextInt();
        	//if(i==0) break;
        	//while(i>0) {
//        		cell=Map.update(cell);
//        		cell=Map.getLiving(cell);
//        		for(int i=0;i<16;i++) {
//            		for(int j=0;j<16;j++) {
//            			if(cell[i][j].getStatus()==1) {
//            				g.fillRect(i*20, j*20, 20, 20);
//            			}
//            			else {
//            				g.drawRect(i*20, j*20, 20, 20);
//            			}
//            		}
//            	}
//        		//System.out.println("这是第"+count+"次演化结果：");
//        		//Map.printMap(cell);
//        		count++;
        		//i--;
        	//}
    	//}
    }
}


