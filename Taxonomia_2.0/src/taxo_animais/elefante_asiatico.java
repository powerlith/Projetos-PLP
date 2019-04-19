package taxo_animais;

import taxo_familias.Elephantidae;
import taxo_ordens.Herbivoro;

public class elefante_asiatico extends Elephantidae implements Herbivoro{

	public elefante_asiatico(int idade, double peso) {
		super();
		System.out.println("Nome: Elefante Asiático");
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + " toneladas!!!");
		animalTerrestre();
		comerFolhas();
		familiaElefantes();
	}

}
//Elephantidae