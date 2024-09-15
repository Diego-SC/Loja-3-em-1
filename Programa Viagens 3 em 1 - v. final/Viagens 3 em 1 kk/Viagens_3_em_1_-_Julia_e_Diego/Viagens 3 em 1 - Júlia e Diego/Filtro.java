import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class Filtro extends Seguranca {

  // Variáveis para controle
  public static Scanner input = new Scanner(System.in);
  public static int numPacote;
  public static double precoPacote;
  public static int troca = 0;
  public static int j;

  // Variáveis para autenticação
  public boolean ss;

  // Variáveis para milhas
  public static double desconto;
  public static int milhas;
  public final int tetoMilheiro = 35001;

  // Método para autenticar a senha
  @Override
  public void auten_compra(int senha) {

    if (senha == Menu.a1.getSenha()) {
      System.out.println("Senha Válida");
      System.out.println("\n\nInsira 0 para continuar");
      String peg = input.next();
      ss = true;
    } else {
      System.out.println("Senha Incorreta");
      System.out.println("\n\nInsira 0 para continuar");
      String peg = input.next();
      ss = false;
    }
  }

  // Método para calcular as milhas do usuário
  @Override
  public void milhas() {
    Random gerador = new Random();
    milhas = gerador.nextInt(tetoMilheiro);
    desconto = ((milhas / 1000) * 70);
  }

  // Método para as perguntas dos filtros
  public static void ux(Pacote[] P1) throws IOException, InterruptedException {

    String f_destino;
    String f_estadia;
    String f_locomocao;

    System.out.println("\t---DESTINOS---");
    System.out.println("Salvador");
    System.out.println("Sao Paulo");
    System.out.println("Foz do Iguacu");
    System.out.println("Florianopolis");
    System.out.println("Rio de Janeiro");
    System.out.println("\n\nInsira seu destino como esta escrito acima\n");

    System.out.println("Digite seu filtro para o destino");
    f_destino = input.nextLine();
    App.cls();

    System.out.println("\t---ESTADIA---");
    System.out.println("Hotel");
    System.out.println("Apartamento - Airbnb");
    System.out.println("Casa - Airbnb");
    System.out.println("\n\nInsira sua estadia como esta escrito acima\n");

    System.out.println("Digite seu filtro para a estadia");
    f_estadia = input.nextLine();
    App.cls();

    System.out.println("\t---LOCOMOÇÃO---");
    System.out.println("Aviao");
    System.out.println("Onibus");
    System.out.println("Carro");
    System.out.println("\n\nInsira sua locomoção como esta escrito acima\n");

    System.out.println("Digite seu filtro para a locomoção");
    f_locomocao = input.nextLine();
    App.cls();

    filtrar(P1, f_destino, f_estadia, f_locomocao);

  }

  // Método da filtragem
  public static void filtrar(Pacote P1[], String f_destino, String f_estadia, String f_locomocao) {

    for (int i = 0; i < App.vetor; i++) {

      if (P1[i].destino.equals(f_destino) && P1[i].estadia.equals(f_estadia) && P1[i].locomocao.equals(f_locomocao)) {

        numPacote = i + 1;
        precoPacote = P1[i].preco;
        troca = 0;

        System.out.println("Filtros correspondem ao Pacote " + numPacote);
        input.nextLine();

        System.out.println("Aperte enter para continuar.");
        input.nextLine();

      } else {
        troca++;
      }

      if (i == App.vetor && troca != 0) {
        System.out.println("Pacote inexistente");
        input.nextLine();
      }
    }
  }
}