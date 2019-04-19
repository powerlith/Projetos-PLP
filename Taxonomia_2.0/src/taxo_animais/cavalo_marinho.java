package taxo_animais;

import taxo_familias.Syngnathidae;
import taxo_ordens.Carnivoro;

public class cavalo_marinho extends Syngnathidae implements Carnivoro {

	public cavalo_marinho(int idade, int peso) {
		super();
		System.out.println("Nome: Cavalo Marinho ");
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + " kilos");
		animalAquatico();
		comerCarne();
		familiaTubarao();
	}
}
