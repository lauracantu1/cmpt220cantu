public class LinearEquation {
	// program contains private data fields: a,b,c,d,e and f 
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	// Constructor with arguments for a, b, c, d, e, and f 
	LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

//Methods
	/** Return a,b,c,d,e,f */
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getf() {
		return f;
	}

//if else statement will be used
	/** Returns true if ad - bc is not 0 */
	public boolean isSolvable() {
		return a * d - b * c <= 0;
	}
	

	/** Returns x */
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	/** Returns y */
	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
}