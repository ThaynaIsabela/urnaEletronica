class UrnaTest {
  public static void run() {
    Urna urna = new Urna();
    urna.adicionarCandidato(new Candidato(200, "Presidente", "Flash", "156.432.666-00"));
    urna.adicionarCandidato(new Candidato(300, "Presidente", "Superman", "789.432.123-00"));
    urna.adicionarCandidato(new Candidato(5000, "Senador", "Ciclope", "541.432.123-00"));
    urna.adicionarCandidato(new Candidato(6000, "Senador", "Wolverine", "639.432.123-00"));
    urna.adicionarCandidato(new Candidato(7000, "Senador", "Tempestade", "613.432.123-00"));
    urna.adicionarCandidato(new Candidato(30000, "Deputado", "Margie", "279.589.123-00"));
    urna.adicionarCandidato(new Candidato(40000, "Deputado", "Homer", "634.432.123-00"));
    urna.adicionarCandidato(new Candidato(50000, "Deputado", "Barth", "333.432.123-00"));
    urna.adicionarCandidato(new Candidato(60000, "Deputado", "Lisa", "582.589.123-00"));
    urna.adicionarCandidato(new Candidato(70000, "Deputado", "Meg", "589.432.258-00"));

    urna.votar(new Eleitor("123.456.789-0", "Thor"), 200,  6000, 30000);

    urna.quantidadeComputado();
    urna.totalDeVotosPorCandidato();
    urna.totalDeVotosDoCandiato(30000);
  }
}
