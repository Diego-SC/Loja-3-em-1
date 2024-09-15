import java.io.*;
import java.util.*;

public class Menu {

	// Variáveis
	public static Scanner input = new Scanner(System.in);
	public static int op;
	public static int i;
	public static Cadastro a1 = new Cadastro();
	public static Pacote[] P1 = new Pacote[App.vetor];
	public static Filtro f1 = new Filtro();

	// Método para cadastrar
	public static void entrada() {
		a1.cadastramento();
	}

	// Método que adiciona (adc) a variável de classe P na classe
	public static void adc(Pacote[] P) {
		for (int i = 0; i < App.vetor; i++) {
			P1[i] = P[i];
		}
	}

	// Menu
	public static void menu_principal(ArrayList<Estrelas> estrelas) throws IOException, InterruptedException {
		do {

			App.cls();
			System.out.println("------ MENU PRINCIPAL ------\n\n");
			System.out.printf("[1] - Visualizar pacotes\n");
			System.out.printf("[2] - Adicionar filtros de pacotes\n");// feito
			System.out.printf("[3] - Exibir perfil\n"); // feito
			System.out.printf("[4] - Alterar perfil\n"); // feito
			System.out.printf("[5] - Mostrar carrinho\n"); // feito
			System.out.printf("[6] - Top 3 Destinos com mais estrelas\n"); // feito
			System.out.printf("[7] - Dar comentários\n");
			System.out.printf("[0] - Sair\n"); // feito
			System.out.print("\nInsira a opção aqui: ");
			op = input.nextInt();
			App.cls();

			switch (op) {
				case 1:
					// visualizar pacotes
					Visualizar.visuPacotes(P1);
					break;

				case 2:
					// filtros
					Filtro.ux(P1);
					break;

				case 3:
					// mostrar perfil
					a1.exibir();
					break;

				case 4:
					// editar perfil
					a1.alterar();
					break;

				case 5:
					// mostrar carrinho
					Comprar.comprando();
					break;

				case 6:
					// mostrar estrelas
					if (estrelas.size() <= 0) {
						System.out.println("Ainda não possuímos avaliações\n");
						System.out.println("Digite enter para continuar");
						input.nextLine();

					} else {
						App.satisfacao(estrelas);
					}
					break;

				case 7:
					// comentários
					a1.feedback();
					;
					break;

				case 0:
					// sair do programa
					i++;
					break;
			}
		} while (i == 0);
	}
}