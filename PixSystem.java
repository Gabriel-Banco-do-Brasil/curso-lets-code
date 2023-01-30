
public class PixSystem implements IMeioDePagamento{

    @Override
    public void pagar(double valor) {
        System.out.println("Chamando a classe que paga o valor de " + valor + " reais através de pix...");  
    }

    @Override
    public void validar() {
        System.out.println("Chamando classe validadora para conta pix para saber se está apto para fazer o pagamento...");  
    }

}
