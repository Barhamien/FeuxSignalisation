/**
 * 
 */
package feux;

import feux.Feux;

/**
 * @author Adama
 *
 */
public class Tricolor {
	Feux feu;

	/**
	 * @param state the state to set
	 */
	public void setState(Feux feu) {
		this.feu = feu;
	}
	public void service(){
		this.feu.Handle();
		
	}
}
