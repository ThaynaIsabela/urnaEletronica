class Candidato extends Eleitor implements Candidatura {
  private int numero;
  private String cargo;
  private boolean habilitado = false;
  private int totalDeVotos = 0;

  public Candidato(int numero, String cargo, String nome, String cpf) {
    super(cpf, nome);
    this.cargo = cargo;
    this.numero = numero;
  }

  public void habilitar() {
    this.habilitado = true;
  }

  public void receberVoto() {
    this.totalDeVotos += 1;
  }

  public int getTotalDeVotos() {
    return this.totalDeVotos;
  }

  public int getNumero() {
    return this.numero;
  }

  public String getCargo() {
    return this.cargo;
  }
}
