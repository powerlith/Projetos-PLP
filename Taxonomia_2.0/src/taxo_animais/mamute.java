package taxo_animais;

import taxo_familias.Elephantidae;
import taxo_ordens.Herbivoro;

public class mamute extends Elephantidae implements Herbivoro{

	public mamute(int idade, double peso) {
		super();
		System.out.println("Nome: Mamute");
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + " toneladas!!!");
		animalTerrestre();
		comerFolhas();
		familiaElefantes();
	}

}
//Elephantidae