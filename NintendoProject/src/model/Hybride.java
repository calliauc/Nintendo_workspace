package model;

import java.time.LocalDate;

public class Hybride extends Console{



	public Hybride(String nom, double prix, LocalDate dateDeSortie) {
		super(nom, prix, dateDeSortie);
	}

	@Override
	public String toString() {
		return "Hybride [getNom()=" + getNom() + ", getPrix()=" + getPrix() + ", getDateDeSortie()=" + getDateDeSortie()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
}
