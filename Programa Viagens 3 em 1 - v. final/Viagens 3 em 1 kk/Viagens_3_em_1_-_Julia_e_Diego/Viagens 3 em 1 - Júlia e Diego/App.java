import java.io.IOException;
import java.util.*;

public class App {

  // variável constante para definir o tamanho do vetor P
  public final static int vetor = 20;
  public static Scanner input = new Scanner(System.in);

  // método cls
  public static void cls() throws IOException, InterruptedException {
    if (System.getProperty("os.name").contains("Windows")) {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } else {
      Runtime.getRuntime().exec("clear");
    }
  }

  // main
  public static void main(String[] args) throws IOException, InterruptedException {

    Menu.entrada();

    // Instâncias de Pacote
    Pacote P[] = new Pacote[vetor];
    P[0] = new Pacote("Salvador", "Hotel", "Aviao", 920.0);
    P[1] = new Pacote("Salvador", "Apartamento - Airbnb", "Onibus", 820.0);
    P[2] = new Pacote("Salvador", "Hotel", "Onibus", 1200.0);
    P[3] = new Pacote("Salvador", "Casa - Airbnb", "Aviao", 3000.0);

    P[4] = new Pacote("Rio de Janeiro", "Hotel", "Aviao", 636.0);
    P[5] = new Pacote("Rio de Janeiro", "Apartamento - Airbnb", "Onibus", 850.0);
    P[6] = new Pacote("Rio de Janeiro", "Apartamento - Airbnb", "Aviao", 1200.0);
    P[7] = new Pacote("Rio de Janeiro", "Hotel", "Onibus", 440.0);

    P[8] = new Pacote("Florianopolis", "Hotel", "Aviao", 2000.0);
    P[9] = new Pacote("Florianopolis", "Hotel", "Onibus", 1200.0);
    P[10] = new Pacote("Florianopolis", "Casa - Airbnb", "Onibus", 850.0);
    P[11] = new Pacote("Florianopolis", "Casa - Airbnb", "Aviao", 1000.0);

    P[12] = new Pacote("Foz do Iguacu", "Hotel", "Aviao", 1200.0);
    P[13] = new Pacote("Foz do Iguacu", "Casa - Airbnb", "Onibus", 640.0);
    P[14] = new Pacote("Foz do Iguacu", "Apartamento - Airbnb", "Aviao", 950.0);
    P[15] = new Pacote("Foz do Iguacu", "Apartamento - Airbnb", "Onibus", 820.0);

    P[16] = new Pacote("Sao Paulo", "Hotel", "Aviao", 2000.0);
    P[17] = new Pacote("Sao Paulo", "Hotel", "Onibus", 1820.0);
    P[18] = new Pacote("Sao Paulo", "Casa - Airbnb", "Aviao", 862.0);
    P[19] = new Pacote("Sao Paulo", "Apartamento - Airbnb", "Onibus", 674.0);

    // Instâncias das Estrelas
    ArrayList<Estrelas> satisfacao = new ArrayList<>();
    Estrelas e0 = new Estrelas("Salvador - BA ->", 5);
    Estrelas e1 = new Estrelas("Florianópolis - SC ->", 4.5);
    Estrelas e2 = new Estrelas("Rio de Janeiro - RJ ->", 4);

    satisfacao.add(e0);
    satisfacao.add(e1);
    satisfacao.add(e2);

    Menu.adc(P);

    Menu.menu_principal(satisfacao);
  }

  // Método de exibição das estrelas
  public static void satisfacao(ArrayList<Estrelas> satisfacao) {
    for (int i = 0; i < satisfacao.size(); i++) {
      System.out.println(satisfacao.get(i).getLocal() + " " + satisfacao.get(i).getAvaliacao());
    }
    System.out.println("Digite enter para continuar");
    input.nextLine();

  }
}
