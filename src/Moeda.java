public class Moeda {
    public double valorReal;
    public double cotacaoDolar;
    public double quantidadeDolar;

    public void calcularConversao(){
        this.quantidadeDolar = this.valorReal/this.cotacaoDolar;
    }

    public double getQuantidadeDolar(){
       double dolar = this.valorReal/this.cotacaoDolar;
       return dolar;
    }
}
