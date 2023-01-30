import java.time.LocalDate;
import java.util.UUID;

public class RegistroAluguelRealizado {

    private UUID id;
    private Cliente cliente;
    private Veiculo veiculo;
    private TipoMeioDePagamento tipoPagamento;
    private double valor;
    private LocalDate data;

    public RegistroAluguelRealizado(UUID id, Cliente cliente, Veiculo veiculo, TipoMeioDePagamento tipoPagamento, double valor, LocalDate data) {
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
        this.data = data;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public TipoMeioDePagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoMeioDePagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
