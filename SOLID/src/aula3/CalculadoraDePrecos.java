package aula3;

public class CalculadoraDePrecos {

    private TabeleDePreco tabelaDePreco;
    private ServicoDeFrete servico;

    public CalculadoraDePrecos(TabeleDePreco tabelaDePreco, ServicoDeFrete servico ) {
       this.tabelaDePreco = tabelaDePreco;
       this.servico = servico;


    }

    public double calcula(Compra produto) {
        double desconto = tabelaDePreco.descontoPara(produto.getValor());
        double frete    = servico.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}




