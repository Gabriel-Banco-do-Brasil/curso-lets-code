
public class CartaoCreditoSystem implements IMeioDePagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Chamando a classe que paga o valor de " + valor + " reais através de cartão de crédito...");        
    }

    @Override
    public void validar() {
        System.out.println("Chamando classe validadora para conta corrente associdada ao cartão para saber se cartão está apto para fazer o pagamento...");            
    }

}
