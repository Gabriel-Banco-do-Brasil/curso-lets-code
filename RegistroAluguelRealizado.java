import java.util.Date;

public class RegistroAluguelRealizado {

    Cliente cliente;
    Veiculo veiculo;
    IMeioDePagamento tipoPagamento;
    double valor;
    Date data;

    public RegistroAluguelRealizado(Cliente cliente, Veiculo veiculo, IMeioDePagamento tipoPagamento, double valor, Date data) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
        this.data = data;
    }

}
