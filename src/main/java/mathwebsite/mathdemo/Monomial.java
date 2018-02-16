package mathwebsite.mathdemo;

import java.util.ArrayList;
import java.util.List;

public class Monomial {

	private int coefficient;
	private List<Term> terms;

	public Monomial(int coefficient, ArrayList<Term> terms) {
		this.coefficient = coefficient;
		this.terms = terms;
	}

	public int getCoefficient() {
		return coefficient;
	}

	public List<Term> getTerms() {
		return terms;
	}

}
