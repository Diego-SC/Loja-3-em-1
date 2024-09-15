import java.util.Scanner;

public class Visualizar {

  // Variáveis de controle
  public static Scanner input = new Scanner(System.in);
  public static String enter;
  public static int i;

  // Método que visualiza os pacotes sem filtro
  public static void visuPacotes(Pacote P1[]) {

    for (i = 0; i < App.vetor; i++) {
      System.out.println(
          "-------------------------------------------------------------------------------------------------------");
      System.out.println("Pacotes com destino para " + P1[i].destino + ":");
      System.out.println(
          "Destino: " + P1[i].destino + "\nEstadia: " + P1[i].estadia + "\nMeio de Locomocao: " + P1[i].locomocao
              + "\nPreco: " + P1[i].preco);
      System.out.println(
          "-------------------------------------------------------------------------------------------------------");
      System.out.println("\n\nEnter para continuar.");
      enter = input.nextLine();

    }

  }
}