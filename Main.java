import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.xml.crypto.Data;

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

                RegistroAluguelRealizado registro1 = new RegistroAluguelRealizado(UUID.randomUUID(), cliente1, carro1,
                                TipoMeioDePagamento.PIX, 1500.0, java.time.LocalDate.now());

                /**
                 * Testes cadastrar
                 */
                GenericCrud.cadastrar(carro1.getPlaca(), carro1, carroDB);

                /**
                 * Testes atualizar
                 */
                Carro carro1Atualizado = new Carro("AAA-0001", "Skyline GT-R R34", "Nissan", 1957, 10000,
                                2, 5, null, Status.OPERACIONAL_DISPONIVEL);

                GenericCrud.atualizar(carro1.getPlaca(), carro1Atualizado, carroDB);

                /**
                 * Testes consultar
                 */
                System.out.println(GenericCrud.consultar("AAA-0001", carroDB));

                /**
                 * Testes deletar
                 */
                GenericCrud.deletar("AAA-0001", carroDB);

                /*
                 * Teste pagamentos e registrar aluguel
                 */
                if (registro1.getTipoPagamento().equals(TipoMeioDePagamento.PIX)) {

                        IMeioDePagamento meioDePagamentoPix = MeioDePagamentoFactory
                                        .createMeioDePagamento(TipoMeioDePagamento.PIX);

                        meioDePagamentoPix.validar();
                        meioDePagamentoPix.pagar(registro1.getValor());
                        GenericCrud.cadastrar(registro1.getId(), registro1, AluguelRealizadosDB);

                } else {

                        IMeioDePagamento meioDePagamentoCartaoCredito = MeioDePagamentoFactory
                                        .createMeioDePagamento(TipoMeioDePagamento.CARTAO_CREDITO);

                        meioDePagamentoCartaoCredito.validar();
                        meioDePagamentoCartaoCredito.pagar(registro1.getValor());
                        GenericCrud.cadastrar(registro1.getId(), registro1, AluguelRealizadosDB);

                }

        }

}