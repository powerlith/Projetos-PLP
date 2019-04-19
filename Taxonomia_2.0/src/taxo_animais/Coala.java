package taxo_animais;

import taxo_familias.Phascolarctidae;
import taxo_ordens.Herbivoro;

public class Coala extends Phascolarctidae implements Herbivoro{

	public Coala(int idade, double peso) {
		super();
		System.out.println("Nome: Coala");
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + " kilo(s)");
		animalTerrestre();
		comerFolhas();
		familiaCoalas();
	}

}
//Phascolarctidae