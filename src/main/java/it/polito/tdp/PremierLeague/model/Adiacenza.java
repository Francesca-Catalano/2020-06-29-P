package it.polito.tdp.PremierLeague.model;

public class Adiacenza implements Comparable<Adiacenza> {
	private Match m1;
	private Match m2;
	private int peso ;
	public Match getM1() {
		return m1;
	}
	public Match getM2() {
		return m2;
	}
	public int getPeso() {
		return peso;
	}
	public Adiacenza(Match m1, Match m2, int peso) {
		super();
		this.m1 = m1;
		this.m2 = m2;
		this.peso = peso;
	}
	@Override
	public int compareTo(Adiacenza o) {
		// TODO Auto-generated method stub
		return -(this.peso-o.getPeso());
	}
	@Override
	public String toString() {
		return m1 + " " + m2 + " " + peso ;
	}

}
