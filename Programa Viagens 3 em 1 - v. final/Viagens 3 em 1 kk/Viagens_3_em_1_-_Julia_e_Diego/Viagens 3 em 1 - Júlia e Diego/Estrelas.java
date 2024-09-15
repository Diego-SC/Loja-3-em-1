public class Estrelas {

  // Variáveis da classe
  private double avaliacao;
  private String local;

  // Primeiro construtor de Estrelas
  public Estrelas() {
    this.avaliacao = 0;
    this.local = null;
  }

  // Segundo construtor
  public Estrelas(String local, double avaliacao) {
    this.local = local;
    this.avaliacao = avaliacao;
  }

  public double getAvaliacao() {
    return this.avaliacao;
  }

  public void setAvaliacao(double avaliacao) {
    this.avaliacao = avaliacao;
  }

  public String getLocal() {
    return this.local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

}