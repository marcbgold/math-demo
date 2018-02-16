package mathwebsite.mathdemo;

public class Term {

	private String variable;
	private int exponent;

	public Term(String variable, int exponent) {
		this.variable = variable;
		this.exponent = exponent;
	}

	public String getVariable() {
		return variable;
	}

	public int getExponent() {
		return exponent;
	}

}
