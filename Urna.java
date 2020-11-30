class Urna {
  private java.util.ArrayList<Voto> votos = new java.util.ArrayList<Voto>();
  private java.util.ArrayList<Candidato> candidatos = new java.util.ArrayList<Candidato>();
  private java.util.ArrayList<Eleitor> eleitores = new java.util.ArrayList<Eleitor>();  

  public void adicionarCandidato(Candidato candidato) {
    this.candidatos.add(candidato);
  }

  public boolean eleitorVotou(Eleitor eleitor) {
    for (int x = 0; x < this.eleitores.size(); x+=1) {
      if (this.eleitores.get(x).getCPF() == eleitor.getCPF()) {
        return true;
      }
    }
    return false;
  }

  public void votar(Eleitor eleitor, int presidente, int senador, int deputado) {
    if (!this.eleitorVotou(eleitor)) {
      Candidato cpresidente = this.localizarCandidato(presidente);
      Candidato csenador = this.localizarCandidato(senador);
      Candidato cdeputado = this.localizarCandidato(deputado);
      eleitores.add(eleitor);
      this.votos.add(new Voto(eleitor, cpresidente, csenador, cdeputado));
      System.out.println("Voto computado!");
    } else {
      System.out.println("Este eleitor já votou!");
    }
  }

  public Candidato localizarCandidato(int numero) {
    Candidato encontrado = this.candidatos.get(0);
    for (int x = 0; x < this.candidatos.size(); x+=1) {
      if (this.candidatos.get(x).getNumero() == numero) {
        encontrado = this.candidatos.get(x);
        break;
      }
    }
    return encontrado;
  }

  public void quantidadeComputado() {
    System.out.println("Total de votos computados:" + String.format("%5d", votos.size()));
  }

  public void totalDeVotosPorCandidato() {
    System.out.println("\nTotal de Votos por Candidato:\n");
    for (int x = 0; x < this.candidatos.size(); x+=1) {
      Candidato candidato = this.candidatos.get(x);
      System.out.println("Candidato: " + candidato.getNome() + " - Cargo: " + candidato.getCargo() + ": " + String.format("%d", candidato.getTotalDeVotos()));
    }
  }

  public void totalDeVotosDoCandiato(int numero) {
    Candidato candidato = this.localizarCandidato(numero);
    this.totalDeVotosDoCandiato(candidato);
  }

  public void totalDeVotosDoCandiato(Candidato candidato) {
    System.out.println("\nTotal de Votos para um candidato:\n");
    System.out.println("Candidato: " + candidato.getNome() + " - Cargo: " + candidato.getCargo() + ": " + String.format("%d", candidato.getTotalDeVotos()));
  }
}
