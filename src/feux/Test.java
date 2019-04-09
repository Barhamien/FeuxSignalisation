/**
 * 
 */
package feux;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;

import feux.EtatVert;

/**
 * @author Hp
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			    
			    JFrame win = new JFrame("Traffic Light");
			    JFrame wi= new JFrame("Traffic Light");
			   /* win.setPreferredSize(new Dimension(130, 290));
			    win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			   win.add(new EtatVert(), BorderLayout.CENTER);
			    win.pack();
			    win.setVisible(true);*/
			    wi.setPreferredSize(new Dimension(130, 290));
			    wi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			   wi.add(new EtatOrange(), BorderLayout.CENTER);
			    wi.pack();
			    
			    wi.setVisible(true);
			    
		

	}

}
