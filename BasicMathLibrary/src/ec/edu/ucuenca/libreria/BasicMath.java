/**
 * 
 */
package ec.edu.ucuenca.libreria;

/**
 * @author Angel Oswaldo Vázquez Patiño
 *
 */
public class BasicMath {
	Double res, a, b;
	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}
	
	public BasicMath(){
		setA(0.0);
		setB(0.0);		
	}
	
	public BasicMath(Double a, Double b){
		setA(a);
		setB(b);		
	}
	
	public Double getSuma(){		
		return a + b;
	}
	
	public Double getSuma(Double a, Double b){
		setA(a);
		setB(b);
		return getSuma();
	}
}
