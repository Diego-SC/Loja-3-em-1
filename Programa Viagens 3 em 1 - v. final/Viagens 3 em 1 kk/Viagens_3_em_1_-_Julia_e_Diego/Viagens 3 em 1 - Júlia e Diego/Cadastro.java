import java.io.IOException;
import java.util.*;

public class Cadastro implements Comenta {

  // Variáveis para cadastro do usuário
  static Scanner input = new Scanner(System.in);
  private String nome;
  private String cpf;
  private String email;
  private int senha;
  private String comentario;

  public String getComentario() {
    return this.comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getSenha() {
    return this.senha;
  }

  public void setSenha(int senha) {
    this.senha = senha;
  }

  // Cadastrando
  public void cadastramento() {
    System.out.println("\n------ CADASTRO ------");
    System.out.print("\nInsira seu nome: ");
    nome = input.nextLine();
    System.out.print("\nInsira seu CPF: ");
    cpf = input.nextLine();
    System.out.print("\nInsira seu e-mail: ");
    email = input.nextLine();
    System.out.print("\nInsira sua senha: ");
    senha = input.nextInt();
  }

  // Alterando o perfil criado
  public void alterar() {
    System.out.println("\n------ ALTERAR PERFIL ------");
    System.out.print("\nInsira seu novo nome: ");
    nome = input.nextLine();
  }

  // Exibindo a conta cadastrada
  public void exibir() {
    System.out.println("------ CONTA ------");
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("E-mail: " + email);
    System.out.println("-------------------");
    System.out.println("Insira 0 para retornar");
    String enter = input.next();
  }

  // Método de comentário do 3 em 1
  public void feedback() throws IOException, InterruptedException {
    System.out
        .println("Insira seu comentário sobre nosso site, para nos ajudar a melhorar cada vez mais a plataforma\n");
    comentario = input.next();
    App.cls();
    System.out.println("Agradecemos o feedback e estaremos de olho no seu comentário S2\n");
    System.out.println("Insira 0 para retornar");
    String feed = input.next();
  }

}
