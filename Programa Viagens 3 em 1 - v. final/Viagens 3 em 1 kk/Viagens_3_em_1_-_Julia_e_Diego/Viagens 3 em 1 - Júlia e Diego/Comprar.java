import java.io.IOException;

public class Comprar extends Filtro {

  // Variáveis para controle
  public static int i, j, tempo = 0;
  public static int the_senha;
  public static String pega = "0";
  public static int lupin = 0;
  public static double valorFinal, valorMilhas;

  // Método de compra
  public static void comprando() throws IOException, InterruptedException {

    valorMilhas = (precoPacote - desconto);

    System.out.println("------ CARRINHO ------\n");
    System.out.println("Pacote escolhido: Pacote " + numPacote + "\nValor do Pacote: " + precoPacote);

    System.out.println("\nDeseja fazer a compra deste pacote?");
    System.out.println("[1] - Sim");
    System.out.println("[2] - Não");
    i = input.nextInt();

    if (i == 1) {

      Menu.f1.milhas();
      System.out.println("\nVocê possui " + milhas + " milhas, resultaria no valor final do Pacote de " + valorMilhas);
      System.out.println("Deseja finalizar a compra com o uso das milhas? (Esta ação é irreversível)");
      System.out.println("Insira o valor da opção");
      System.out.println("[1] - Sim");
      System.out.println("[2] - Não");
      j = input.nextInt();

      if (j == 1) {
        valorFinal = valorMilhas;
        finalizando();
      } else if (j == 2) {
        valorFinal = precoPacote;
        finalizando();
      }

    } else if (i == 2) {

      System.out.println("\nEstamos te redirecionando para o menu principal");
      System.out.println("\nAperte Enter para continuar");
      input.nextLine();

    }

  }

  // Tratamento de Exceções
  public static void auten_compra(boolean ss) throws Exception {

    if (ss == false) {
      tempo++;
      throw new Exception("Senha Incorreta!");
    }

  }

  // Método para finalização da compra
  public static void finalizando() throws IOException, InterruptedException {

    while (lupin == 0 && the_senha != 1) {

      try {

        if (tempo == 0) {
          System.out.println("Insira sua senha para confirmar a compra");
          the_senha = input.nextInt();
          tempo++;
          App.cls();
        } else if (tempo > 0) {
          System.out.println("Insira sua senha para confirmar a compra");
          System.out.println("Insira 1 para sair\n");
          System.out.print("Digite aqui: ");
          the_senha = input.nextInt();
          App.cls();
        }

        if (the_senha != 1) {
          Menu.f1.auten_compra(the_senha);
        }

      } catch (Exception e) {
        System.out.println(e.getMessage());

      }

      if (Menu.f1.ss == true) {
        lupin++;
        System.out.println("\nParabéns! A compra no valor de R$" + valorFinal + " foi realizada com sucesso!");
        System.out.println("\n\nInsira 0 para continuar");
        String passando = input.next();
        lupin++;
      }
      App.cls();
    }

  }
}
