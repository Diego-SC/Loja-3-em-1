import java.util.Scanner;

public class Pacote {

  // Variáveis e sobrecarga
  public static Scanner input = new Scanner(System.in);

  public String destino;
  public String estadia;
  public String locomocao;
  public double preco;

  public Pacote() {
    this.destino = null;
    this.estadia = null;
    this.locomocao = null;
    this.preco = 0;
  }

  public Pacote(String destino, String estadia, String locomocao, double preco) {
    this.destino = destino;
    this.estadia = estadia;
    this.locomocao = locomocao;
    this.preco = preco;
  }
}
