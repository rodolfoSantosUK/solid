package aula1;

public enum Cargo {

    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());

    private RegraDeCalculo regra;

      Cargo( RegraDeCalculo regra ) {
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
