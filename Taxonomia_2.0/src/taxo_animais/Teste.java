package taxo_animais;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("------------------------------------------- \n" + "Taxonomia dos Animais v2.0" + "\n -------------------------------------------" + 
		"\n 1.Ligre" +
		"\n 2.Onça Pintada" +
		"\n 3.Gato do Mato"+
		"\n 4.Elefante Asiático" +
		"\n 5.Ligre" +
		"\n 6.Hipopotamo" +
		"\n 7.Tubarão Tigre" +
		"\n 8.Cavalo Marinho" +
		"\n 9.Cogulos" +
		"\n 10.Coala" +
		"\n digite o número referente ao animal:" +
		"\n -------------------------------------------");

		int escolha;

		escolha = scan.nextInt();

		switch (escolha) {
		case 1:
			Animal Ligre = new Ligre(3, 418);
			break;
		case 2:
			Animal Onca = new Onca(2, 76);
			break;
			
		case 3:
			Animal gato_do_mato = new gato_do_mato(1, 9);
			break;
			
		case 4:
			Animal elefante_asiatico = new elefante_asiatico(2, 2.5);
			break;
			
		case 5:
			Animal mamute= new mamute(5, 3.5);
			break;
			
		case 6:
			Animal hipopotamo= new hipopotamo(2, 1.9);
			break;
		
		case 7:
			Animal tubarao_tigre= new tubarao_tigre(1, 807);
			break;
			
		case 8:
			Animal cavalo_marinho= new cavalo_marinho(1, 85);
			break;
			
		case 9:
			Animal Cogulos= new Cogulos(1, 2);
			break;
			
		case 10:
			Animal Coala= new Coala(2, 8);
			break;
			
			
			
		default:
			System.out.println("Selecione um animal válido para ver as informações!");

		}

	}

}
