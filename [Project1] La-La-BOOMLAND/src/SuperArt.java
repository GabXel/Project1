import java.awt.Color;
import java.awt.Font;
import java.awt.Container;
import java.awt.Graphics;
//	import java.awt.event.WindowAdapter;
//	import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
	
	
	
public class SuperArt extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


//public void numberz(){
//	boolean bomb = true;
//	if (bomb = true){
//		
//	}
//	
//	if (bomb = false) {
		
	

		public void paintComponent (Graphics g) {
			Random randomGenerator = new Random();
			super.paintComponents(g);
			g.setFont(new Font("Arial",Font.BOLD,50));
//			g.drawString("1",100,100);
			for(int i = 0;i<8;i++){
				for(int z = 0;z<8;z++){
					
//					Boomland.minesNearby();
					int contador = randomGenerator.nextInt(8);
					// Replace with variable that detects surrounding mines
					boolean testnumber = false;
					//Replace with variable that determines if square is mined or not
					
					if(testnumber == true){
						
					}
					else{
						if (contador == 0)	{
						
						}
						if (contador == 1)	{
							g.setColor(Color.BLUE);
							g.drawString("1",i*50,z*50);	
						}
						if (contador == 2)	{
							g.setColor(Color.GREEN);
							g.drawString("2",i*50,z*50);	
						}
						if (contador == 3)	{
							g.setColor(Color.MAGENTA);
							g.drawString("3",i*50,z*50);	
						}
						if (contador == 4)	{
							g.setColor(Color.RED);
							g.drawString("4",i*50,z*50);	
						}
						if (contador == 5)	{
							g.setColor(Color.YELLOW);
							g.drawString("5",i*50,z*50);	
						}
						if (contador == 6)	{
							g.setColor(Color.CYAN);
							g.drawString("6",i*50,z*50);	
						}
						if (contador == 7)	{
							g.setColor(Color.GRAY);
							g.drawString("7",i*50,z*50);	
						}
						if (contador == 8)	{
							g.setColor(Color.BLACK);
							g.drawString("8",i*50,z*50);	
						}
					}
				}
			}
//			g.drawString("1",100,100);
//			g.drawString("2",100,200);
//			g.drawString("3",100,0);
//			g.drawString("4",100,50);
//			g.drawString("5",100,250);
//			g.drawString("6",0,100);
//			g.drawString("7",0,100);
//			g.drawString("8",0,100);
		}
//	}
//}


//
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	    JFrame frame = new JFrame();
		frame.setTitle("Practice");

	    frame.setSize(400, 400);
	    frame.addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent e) {
	            System.exit(0);
	          }
	    });
	    Container contentPane = frame.getContentPane();
	    contentPane.add(new SuperArt());
//
	    frame.show();
	}
//	
		


			
}
