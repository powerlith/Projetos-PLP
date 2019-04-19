package taxo_animais;

import taxo_familias.Felidae;
import taxo_ordens.Carnivoro;

public class Ligre extends Felidae implements Carnivoro {

	public Ligre(int idade, int peso) {
		super();
		System.out.println("Nome: Ligre ");
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + " kilos");
		animalTerrestre();
		comerCarne();
		familiaFelinos();
	}
}
