package taxo_animais;

import taxo_familias.Carcharhinidae;
import taxo_ordens.Carnivoro;

public class tubarao_tigre extends Carcharhinidae implements Carnivoro {

	public tubarao_tigre(int idade, int peso) {
		super();
		System.out.println("Nome: Tubarão Tigre ");
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + " kilos");
		animalAquatico();
		comerCarne();
		familiaTubarao();
	}
}
