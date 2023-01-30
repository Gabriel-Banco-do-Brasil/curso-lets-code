import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/*
 * for testing:
 * 
 * 1. create test class
 * 2. create test cases
 * 3. transform objects inicialization to class paramter
 * 4. use block do inicialize values
 * 5. ????
 * 6. profit
 * 
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Banco de dados
         */
        Map<UUID, RegistroAluguelRealizado> AluguelRealizadosDB = new HashMap<UUID, RegistroAluguelRealizado>();
        Map<String, Carro> carroDB = new HashMap<String, Carro>();
        Map<String, Cliente> clienteDB = new HashMap<String, Cliente>();
        Map<String, Funcionario> funcionarioDB = new HashMap<String, Funcionario>();


        /**
         * Instancias para teste
         */
        List<Acessorios> acessorios = new ArrayList<Acessorios>();
        acessorios.add(new Acessorios("Rádio", 250.0, 1));
        acessorios.add(new Acessorios("Ar-condicionado", 300.0, 1));
        acessorios.add(new Acessorios("Cópia da Chave", 400.0, 1));

        Carro carro1 = new Carro("AAA-0001", "Skyline GT-R R34", "Nissan", 1957, 0,
                2, 5, acessorios, Status.OPERACIONAL_DISPONIVEL);

        Cliente cliente1 = new Cliente("111.222.333-44", "Gabriel",
        "gabriel@email.com.br", "(99) 98765-4321", "Rua rua, Bairro, Cidade");

        Funcionario funcionario1 = new Funcionario("111.222.333-44", "Gabriel", "gabriel@email.com.br", 
        "(99) 98765-4321", "Rua rua, Bairro, Cidade", "Gerente", 10000.0);



        /**
         * Testes cadastrar
         */
        GenericCrud.cadastrar(carro1.placa, carro1, carroDB);



        /**
         * Testes atualizar
         */
        Carro carro1Atualizado = new Carro("AAA-0001", "Skyline GT-R R34", "Nissan", 1957, 10000,
                2, 5, null, Status.OPERACIONAL_DISPONIVEL);

        GenericCrud.atualizar(carro1.placa, carro1Atualizado, carroDB);



        /**
         * Testes consultar
         */
        System.out.println(GenericCrud.consultar("AAA-0001", carroDB));



        /**
         * Testes deletar
         */
        GenericCrud.deletar("AAA-0001", carroDB);


        
        /*
         * Teste pagamentos
         */
        IMeioDePagamento meioDePagamentoCartaoCredito = MeioDePagamentoFactory
                .createMeioDePagamento(TipoMeioDePagamento.CARTAO_CREDITO);
        meioDePagamentoCartaoCredito.validar();
        meioDePagamentoCartaoCredito.pagar(1000.0);

        IMeioDePagamento meioDePagamentoPix = MeioDePagamentoFactory.createMeioDePagamento(TipoMeioDePagamento.PIX);
        meioDePagamentoPix.validar();
        meioDePagamentoPix.pagar(1500.0);
        //meioDePagamentoPix.enviaEmail(cliente1);

    }

}
