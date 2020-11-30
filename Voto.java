class Voto {
  private Eleitor eleitor;
  private Candidato presidente;
  private Candidato senador;
  private Candidato deputado;

  public Voto(Eleitor eleitor, Candidato presidente, Candidato senador, Candidato deputado) {
    this.eleitor = eleitor;
    this.presidente = presidente;
    this.senador = senador;
    this.deputado = deputado;

    this.presidente.receberVoto();
    this.senador.receberVoto();
    this.deputado.receberVoto();
  }

}
