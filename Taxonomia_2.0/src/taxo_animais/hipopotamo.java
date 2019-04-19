package taxo_animais;

import taxo_familias.Hippopotamidae;
import taxo_ordens.Herbivoro;

public class hipopotamo extends Hippopotamidae implements Herbivoro{

	public hipopotamo(int idade, double peso) {
		super();
		System.out.println("Nome: Hipopotámo");
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + " toneladas!!!");
		animalTerrestre();
		comerFolhas();
		familiaHipopotamos();
	}

}
//Elephantidae