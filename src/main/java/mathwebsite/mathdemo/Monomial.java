package mathwebsite.mathdemo;

import java.util.ArrayList;
import java.util.List;

public class Monomial {

	private int coefficient;
	private List<Term> terms;

	// TODO see if any contructors are unnecessary

	public Monomial(int coefficient, String variable, int exponent) {
		this.coefficient = coefficient;
		terms = new ArrayList<>();
		terms.add(new Term(variable, exponent));
	}

	public Monomial(int coefficient, Term term) {
		this.coefficient = coefficient;
		terms = new ArrayList<>();
		terms.add(term);
	}

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

	@Override
	public String toString() {
		String termOutput = "";
		for (Term i : terms) {
			termOutput = termOutput + i.getVariable() + i.getExponent();
		}

		return coefficient + termOutput;
	}
}
