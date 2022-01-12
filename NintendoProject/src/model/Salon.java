package model;

import java.time.LocalDate;

public class Salon extends Console{


	public Salon(String nom, double prix, LocalDate dateDeSortie) {
		super(nom, prix, dateDeSortie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Salon [getNom()=" + getNom() + ", getPrix()=" + getPrix() + ", getDateDeSortie()=" + getDateDeSortie()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}





}
