package taxo_animais;

import taxo_familias.Felidae;
import taxo_ordens.Carnivoro;

public class Onca extends Felidae implements Carnivoro {

	public Onca(int idade, int peso) {
		super();
		System.out.println("Nome: Onça Pintada");
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + " kilos");
		animalTerrestre();
		comerCarne();
		familiaFelinos();
	}
}
