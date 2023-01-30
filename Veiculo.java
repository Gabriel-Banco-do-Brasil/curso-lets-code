import java.util.List;

public abstract class Veiculo {

    private String placa;
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private int medicaoOdometro;
    private int numeroPortas;
    private int numeroLugares;
    private List<Acessorios> listaAcessorios;
    private Status status;

    Veiculo(String placa,
            String modelo,
            String marca,
            int anoFabricacao,
            int medicaoOdometro,
            int numeroPortas,
            int numeroLugares,
            List<Acessorios> listaAcessorios,
            Status status) {

        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.numeroLugares = numeroLugares;
        this.listaAcessorios = listaAcessorios;
        this.status = status;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getMedicaoOdometro() {
        return medicaoOdometro;
    }

    public void setMedicaoOdometro(int medicaoOdometro) {
        this.medicaoOdometro = medicaoOdometro;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroLugares() {
        return numeroLugares;
    }

    public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }

    public List<Acessorios> getListaAcessorios() {
        return listaAcessorios;
    }

    public void setListaAcessorios(List<Acessorios> listaAcessorios) {
        this.listaAcessorios = listaAcessorios;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
