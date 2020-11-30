
abstract class Pessoa {
  protected String cpf;
  protected String nome;
  private String tituloEleitoral;
  private String zonaEleitoral;

  public String getCPF() {
    return this.cpf;
  }

  public String getNome() {
    return this.nome;
  }
}
