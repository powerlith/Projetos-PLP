package taxo_animais;

import taxo_familias.Cynocephalidae;
import taxo_ordens.Herbivoro;

public class Cogulos extends Cynocephalidae implements Herbivoro{

	public Cogulos(int idade, double peso) {
		super();
		System.out.println("Nome: Cogulo (Lêmures voadores)	");
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + " kilos");
		animalTerrestre();
		comerFolhas();
		familiaCogulo();
	}

}
//Cynocephalidae