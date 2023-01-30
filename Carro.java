import java.util.List;

public class Carro extends Veiculo {

    Carro(String placa,
            String modelo,
            String marca,
            int anoFabricacao,
            int medicaoOdometro,
            int numeroPortas,
            int numeroLugares,
            List<Acessorios> listaAcessorios,
            Status status) {

        super(placa,
                modelo,
                marca,
                anoFabricacao,
                medicaoOdometro,
                numeroPortas,
                numeroLugares,
                listaAcessorios,
                status);
    }

}
