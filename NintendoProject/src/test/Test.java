package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Achat;
import model.Boutique;
import model.Client;
import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		
		Console nintendoSwitch = new Console("NintendoSwitch");
	

		Jeu marioKart = new Jeu("MarioKart", nintendoSwitch);
		Jeu SmashBros = new Jeu("Super Smash Bros", nintendoSwitch);
		Jeu pokemonUnite = new Jeu("Pokemon Unite", nintendoSwitch);
		Jeu fireEmblem3H = new Jeu("Fire Emblem 3 Houses", nintendoSwitch);
		Jeu xenobaldeChronicle = new Jeu("Xenobalde Chronicle", nintendoSwitch);

		List<Achat> achats = new ArrayList<Achat>();
		achats.add(new Achat(pokemonUnite, 0));


		Client c1 = new Client("LUIGI", "Mario");
		Client c2 = new Client("ZELDA", "Link");
		
		c1.setAchats(achats);

		Boutique b1 = new Boutique("POKECENTER", "Bourgpalette");
	}

}
