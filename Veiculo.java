import java.util.List;

public abstract class Veiculo {

    String placa;
    String modelo;
    String marca;
    int anoFabricacao;
    int medicaoOdometro;
    int numeroPortas;
    int numeroLugares;
    List<Acessorios> listaAcessorios;
    Status status;

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

}
