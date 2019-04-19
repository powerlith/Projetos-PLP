package taxo_animais;

import taxo_familias.Felidae;
import taxo_ordens.Carnivoro;

public class gato_do_mato extends Felidae implements Carnivoro {

	public gato_do_mato(int idade, int peso) {
		super();
		System.out.println("Nome: Gato do Mato");
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + " kilos");
		animalTerrestre();
		comerCarne();
		familiaFelinos();
	}
}
