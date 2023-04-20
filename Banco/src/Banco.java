import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nomeConta = "Gabriel Malheiro Vieira";
        String tipoConta = "Corrente";
        double saldoConta = 100.00;
        int opcao = 0;


        System.out.println("*****************************\n" +
                "Dados iniciais do cliente:\n" +
                "\n" +
                "Nome: " + nomeConta + "\n" +
                "Tipo conta: " + tipoConta + "\n" +
                "Saldo inicial: " + saldoConta + "\n\n" +
                "*****************************\n");

        String menu = """
                Operações:
                 
                1 - Consultar saldos
                2 - Transferir valores
                3 - Receber valores
                4 - Sair
                               
                Digite a opção desejada:
                 """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

                if (opcao == 1) {
                System.out.println("O saldo atual da conta é de: " + saldoConta);
                }

                else if (opcao == 2) {
                    System.out.println("Digite o valor que deseja transferir: ");
                    double valor = leitura.nextDouble();

                    if (valor > saldoConta) {
                        System.out.println("Não é possivel realizar essa transferencia, saldo insuficiente!");
                    }

                    else {
                        saldoConta -= valor;
                        System.out.println("Transferencia realizada com sucesso!");
                    }

                }

                else if (opcao == 3){
                    System.out.println("Digite o valor a receber: ");
                    double valorReceber = leitura.nextDouble();
                    saldoConta += valorReceber;
                    System.out.println("Deposito realizado com sucesso!");
                }

                else if (opcao != 4) {
                    System.out.println("Opção invalida, por favor tente novamente...");
                }

        }
    }
}