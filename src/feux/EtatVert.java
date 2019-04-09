/**
 * 
 */
package feux;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Adama Sow
 *
 */

	
	
	 /**
	 * 
	 */

	public class EtatVert extends JPanel implements MouseListener,Feux {
		  Graphics g;
		  // traffic light surface
		  private JPanel panel;
		  // keep track of status of traffic light
		  private int status;
		  // color of "off" red light 
		  private Color offRed;
		  // color of "off" yellow light
		  private Color offYellow;
		  // color of "off" green light
		  private Color offGreen;
		  // ensures all lights are "off" initially
		  
		  /**
		   * Constructs EtatVert object.
		   */
		  public EtatVert() {
		    
		    // instantiate JPanel object and include the
		    // desired layout manager (FlowLayout) as an
		    // argument
		    panel = new JPanel(new FlowLayout());
		    panel.setSize(90, 250);
		    
		    // insert "off" red light
		    offRed = new Color(128, 0, 0);
		    // insert "off" yellow light
		   // offYellow = new Color(192, 192, 0);
		    // insert "off" green light
		    offGreen = new Color(0, 96, 0);
		    
		    // set traffic light to "off"
		    status = 2;
		    
		    // register mouse clicks on the JPanel object
		    addMouseListener(this);
		   
		  }
		  @Override
			public void Changestate() {
			/*  
			  panel = new JPanel(new FlowLayout());
			    panel.setSize(90, 250);
			    
			    // insert "off" red light
			    offRed = new Color(128, 0, 0);
			    // insert "off" yellow light
			    offYellow = new Color(192, 192, 0);
			    // insert "off" green light
			    offGreen = new Color(0, 96, 0);
			    
			    // set traffic light to "off"
			    status = 0;
			    
			    // register mouse clicks on the JPanel object
			    addMouseListener(this); */
			}
		  
		// This method draws the background of the traffic light, with
		  // the lights "off".
		  private void drawBackground(Graphics g) {
		    
		    // color traffic light backdrop
		    g.setColor(Color.LIGHT_GRAY);
		    g.fillRect(0 + 20, 0 + 20, 90, 250);
		    g.setColor(Color.BLACK);
		    g.drawRect(0 + 20, 0 + 20, 90, 250);
		    
		    // insert "off" red light
		    g.setColor(offRed);
		    g.fillOval(10 + 20, 10 + 20, 70, 70);
		    g.setColor(Color.BLACK);
		    g.drawOval(10 + 20, 10 + 20, 70, 70);
		    
		    // insert "off" yellow light
		    g.setColor(offYellow);
		    g.fillOval(10 + 20, 90 + 20, 70, 70);
		    g.setColor(Color.BLACK);
		    g.drawOval(10 + 20, 90 + 20, 70, 70);
		    
		    // insert "off" green light
		    g.setColor(offGreen);
		    g.fillOval(10 + 20, 170 + 20, 70, 70);
		    g.setColor(Color.BLACK);
		    g.drawOval(10 + 20, 170 + 20, 70, 70);
		    
		  }
		  
		  // This method turns "on" and "off" the appropriate lights.
		  private void turnOnLights(Graphics g) {
		    
		    // traffic light is entirely "off"
		   /* if (status == 0) {
		      
		      // turn "on" red light
		      g.setColor(Color.RED);
		      g.fillOval(10 + 20, 10 + 20, 70, 70);
		      g.setColor(Color.BLACK);
		      g.drawOval(10 + 20, 10 + 20, 70, 70);
		      
		    } else if (status == 1) { // red light is "on"
		      
		      // turn "off" red light
		      g.setColor(offRed);
		      g.fillOval(10 + 20, 10 + 20, 70, 70);
		      g.setColor(Color.BLACK);
		      g.drawOval(10 + 20, 10 + 20, 70, 70);
		      
		      // turn "on" yellow light
		      g.setColor(Color.YELLOW);
		      g.fillOval(10 + 20, 90 + 20, 70, 70);
		      g.setColor(Color.BLACK);
		      g.drawOval(10 + 20, 90 + 20, 70, 70);
		      
		    }*/  if (status == 2) { // yellow light is "on"
		      
		      // turn "off" yellow light
		      g.setColor(offYellow);
		      g.fillOval(10 + 20, 90 + 20, 70, 70);
		      g.setColor(Color.BLACK);
		      g.drawOval(10 + 20, 90 + 20, 70, 70);
		      
		      // turn "on" green light
		      g.setColor(Color.GREEN);
		      g.fillOval(10 + 20, 170 + 20, 70, 70);
		      g.setColor(Color.BLACK);
		      g.drawOval(10 + 20, 170 + 20, 70, 70);
		      
		    } else if (status == 3) { // green light is "on"
		      
		      // turn "off" green light
		      g.setColor(offGreen);
		      g.fillOval(10 + 20, 170 + 20, 70, 70);
		      g.setColor(Color.BLACK);
		      g.drawOval(10 + 20, 170 + 20, 70, 70);
		      
		      // turn "on" red light
		      g.setColor(Color.RED);
		      g.fillOval(10 + 20, 10 + 20, 70, 70);
		      g.setColor(Color.BLACK);
		      g.drawOval(10 + 20, 10 + 20, 70, 70);
		      
		    }
		    
		  }
		  
		  /**
		   * This method paints the beginning background and appropriate
		   * lights of the traffic light.
		   * 
		   * @param g The drawing mechanism.
		   */
		  public void paintComponent(Graphics g) {
		    // call superclass method
		    super.paintComponent(g);
		    drawBackground(g);
		    turnOnLights(g);
		    
		  }
		  
		  /**
		   * This method deals with mouse button clicks by turning "on"
		   * and "off" the appropriate lights in the traffic light.
		   * 
		   * @param event Captures information on the mouse button being
		   *              clicked (pressed and released) on a component.
		   */
		  public void mouseClicked(MouseEvent event) {
		    
		    // traffic light is entirely "off"
		    if(status == 0) {
		      // update status of traffic light
		      status = 1;
		    } else if(status == 1) { // red light is "on"
		      status = 2;
		    } else if(status == 2) { // yellow light is "on"
		      status = 3;
		    } else if(status == 3) { // green light is "on"
		      status = 1;
		    }
		    
		    // repaint window to display changes
		    repaint();
		  }
		  
		  /**
		   * Override abstract method with empty implementation.
		   * 
		   * @param event Captures information on the mouse button
		   *              upon entering on a component.
		   */
		
		  
		  /**
		   * The application method to test the traffic light.
		   * 
		   * @param args The command-line arguments.
		   */
		 

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Handle() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void service() {
			// TODO Auto-generated method stub
			
		}

		
		  
		}
