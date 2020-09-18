package aula3;

public class Teste {


    public static void main(String[] args) {

        TabeleDePreco tabelaDePreco = new TabelaDePrecoPadrao();
        ServicoDeFrete servicoDeFrete = new Frete();

        CalculadoraDePrecos calculadoraDePrecos = new CalculadoraDePrecos(tabelaDePreco, servicoDeFrete);
        calculadoraDePrecos.calcula(new Compra() );
    }
}
